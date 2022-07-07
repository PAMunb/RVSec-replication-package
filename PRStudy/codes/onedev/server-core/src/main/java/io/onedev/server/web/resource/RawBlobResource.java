package io.onedev.server.web.resource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.AbstractResource;
import org.eclipse.jetty.io.EofException;
import org.eclipse.jgit.lib.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Splitter;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.ProjectManager;
import io.onedev.server.git.Blob;
import io.onedev.server.git.BlobIdent;
import io.onedev.server.model.Project;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.util.ExceptionUtils;

public class RawBlobResource extends AbstractResource {

	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(RawBlobResource.class);

	private static final String PARAM_PROJECT = "project";

	private static final int BUFFER_SIZE = 8*1024;

	@Override
	protected ResourceResponse newResourceResponse(Attributes attributes) {
		PageParameters params = attributes.getParameters();

		Long projectId = params.get(PARAM_PROJECT).toLong();
		Project project = OneDev.getInstance(ProjectManager.class).load(projectId);

		List<String> revisionAndPathSegments = new ArrayList<>();
		for (int i = 0; i < params.getIndexedCount(); i++) {
			String segment = params.get(i).toString();
			if (segment.length() != 0)
				revisionAndPathSegments.add(segment);
		}

		BlobIdent blobIdent = new BlobIdent(project, revisionAndPathSegments);

		String revision = blobIdent.revision;
		String path = blobIdent.path;
		if (StringUtils.isBlank(revision) || StringUtils.isBlank(path))
			throw new IllegalArgumentException("Revision and path should be specified");

		if (!SecurityUtils.canReadCode(project))
			throw new UnauthorizedException();

		final Blob blob = project.getBlob(new BlobIdent(revision, path, 0), true);

		ResourceResponse response = new ResourceResponse();
		response.setAcceptRange(ContentRangeType.BYTES);
		response.setContentType(project.detectMediaType(blob.getIdent()).toString());
		
		if (blob.getLfsPointer() != null) 
			response.setContentLength(blob.getLfsPointer().getObjectSize());
		else 
			response.setContentLength(blob.getSize());
		
		if (response.getContentType().equals(MediaType.TEXT_HTML)) 
			response.setContentType(MediaType.TEXT_PLAIN);

		if (!ObjectId.isId(revision))
			response.disableCaching();

		try {
			response.setFileName(URLEncoder.encode(blob.getIdent().getName(), StandardCharsets.UTF_8.name()));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}

		response.setWriteCallback(new WriteCallback() {

			private void copyRange(InputStream in, OutputStream out, long start, long end) throws IOException {
				int totalSkipped = 0;
				while (totalSkipped < start)	 {
					long skipped = in.skip(start-totalSkipped);
					if (skipped == 0)
						break;
					totalSkipped += skipped;
				}
				
				if (totalSkipped < start) 
					throw new IOException("Skipped only " + totalSkipped + " bytes out of " + start + " required.");

				long bytesToCopy = end - start + 1;

				byte buffer[] = new byte[BUFFER_SIZE];
				while (bytesToCopy > 0) {
					int bytesRead = in.read(buffer);
					if (bytesRead <= bytesToCopy) {
						out.write(buffer, 0, bytesRead);
						bytesToCopy -= bytesRead;
					} else {
						out.write(buffer, 0, (int) bytesToCopy);
						bytesToCopy = 0;
					}
					if (bytesRead < buffer.length) {
						break;
					}
				}
			}

			@Override
			public void writeData(Attributes attributes) throws IOException {
				try (InputStream is = getInputStream(blob)) {
					Long startByte = RequestCycle.get().getMetaData(CONTENT_RANGE_STARTBYTE);
					Long endByte = RequestCycle.get().getMetaData(CONTENT_RANGE_ENDBYTE);

					if (startByte == null)
						startByte = 0L;
					if (endByte == null || endByte == -1) {
						if (blob.getLfsPointer() != null)
							endByte = blob.getLfsPointer().getObjectSize() - 1;
						else
							endByte = blob.getSize() - 1;
					}
					try {
						copyRange(is, attributes.getResponse().getOutputStream(), startByte, endByte);
					} catch (Exception e) {
						EofException eofException = ExceptionUtils.find(e, EofException.class);
						if (eofException != null) 
							logger.trace("EOF while writing data", eofException);
						else 
							throw e;
					}
				}
			}

			private InputStream getInputStream(Blob blob) {
				if (blob.getLfsPointer() != null)
					return project.getLfsObjectInputStream(blob.getLfsPointer().getObjectId());
				else if (blob.isPartial())
					return project.getInputStream(blob.getIdent());
				else
					return new ByteArrayInputStream(blob.getBytes());
			}

		});

		return response;
	}

	public static PageParameters paramsOf(Project project, BlobIdent blobIdent) {
		PageParameters params = new PageParameters();
		params.set(PARAM_PROJECT, project.getId());
		
		int index = 0;
		for (String segment: Splitter.on("/").split(blobIdent.revision)) {
			params.set(index, segment);
			index++;
		}
		for (String segment: Splitter.on("/").split(blobIdent.path)) {
			params.set(index, segment);
			index++;
		}

		return params;
	}

}
