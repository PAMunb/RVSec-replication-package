package io.onedev.server.web.page.project.builds.detail.artifacts;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

import org.apache.commons.io.FileUtils;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.extensions.markup.html.repeater.data.grid.ICellPopulator;
import org.apache.wicket.extensions.markup.html.repeater.data.table.AbstractColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.HeadersToolbar;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.NoRecordsToolbar;
import org.apache.wicket.extensions.markup.html.repeater.tree.ITreeProvider;
import org.apache.wicket.extensions.markup.html.repeater.tree.TableTree;
import org.apache.wicket.extensions.markup.html.repeater.tree.table.TreeColumn;
import org.apache.wicket.extensions.markup.html.repeater.tree.theme.HumanTheme;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.ResourceLink;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.OddEvenItem;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import io.onedev.commons.utils.LockUtils;
import io.onedev.server.model.Build;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.util.DateUtils;
import io.onedev.server.web.behavior.NoRecordsBehavior;
import io.onedev.server.web.component.modal.ModalLink;
import io.onedev.server.web.component.modal.ModalPanel;
import io.onedev.server.web.component.svg.SpriteImage;
import io.onedev.server.web.page.project.builds.detail.BuildDetailPage;
import io.onedev.server.web.resource.ArtifactResource;
import io.onedev.server.web.resource.ArtifactResourceReference;
import io.onedev.server.web.util.ConfirmClickModifier;

@SuppressWarnings("serial")
public class BuildArtifactsPage extends BuildDetailPage {

	public BuildArtifactsPage(PageParameters params) {
		super(params);
	}

	@Override
	public void onInitialize() {
		super.onInitialize();
		
		add(new ModalLink("upload") {

			@Override
			protected Component newContent(String id, ModalPanel modal) {
				return new ArtifactUploadPanel(id) {
					
					@Override
					public void onUploaded(AjaxRequestTarget target) {
						updateArtifacts(target);
						modal.close();
					}
					
					@Override
					public void onCancel(AjaxRequestTarget target) {
						modal.close();
					}
					
					@Override
					protected Build getBuild() {
						return BuildArtifactsPage.this.getBuild();
					}
					
				};
			}

			@Override
			protected void onConfigure() {
				super.onConfigure();
				setVisible(SecurityUtils.canManage(getBuild()));
			}

		});
		
		List<IColumn<File, Void>> columns = new ArrayList<>();
		
		columns.add(new TreeColumn<File, Void>(Model.of("Name")));
		columns.add(new AbstractColumn<File, Void>(Model.of("Size")) {

			@Override
			public void populateItem(Item<ICellPopulator<File>> cellItem, String componentId, IModel<File> rowModel) {
				File file = rowModel.getObject();
				if (file.isDirectory())
					cellItem.add(new Label(componentId, ""));
				else
					cellItem.add(new Label(componentId, FileUtils.byteCountToDisplaySize(file.length())));
			}
			
		});
		columns.add(new AbstractColumn<File, Void>(Model.of("Last Modified")) {

			@Override
			public void populateItem(Item<ICellPopulator<File>> cellItem, String componentId, IModel<File> rowModel) {
				File file = rowModel.getObject();
				cellItem.add(new Label(componentId, DateUtils.formatAge(new Date(file.lastModified()))));
			}
			
		});
		if (SecurityUtils.canManage(getBuild())) {
			columns.add(new AbstractColumn<File, Void>(Model.of("")) {

				@Override
				public void populateItem(Item<ICellPopulator<File>> cellItem, String componentId, IModel<File> rowModel) {
					Fragment fragment = new Fragment(componentId, "deleteFrag", BuildArtifactsPage.this);
					AjaxLink<?> link = new AjaxLink<Void>("link") { 

						@Override
						public void onClick(AjaxRequestTarget target) {
							LockUtils.write(getBuild().getArtifactsLockKey(), new Callable<Void>() {

								@Override
								public Void call() throws Exception {
									File file = rowModel.getObject();
									try {
										FileUtils.forceDelete(file);
									} catch (IOException e) {
										throw new RuntimeException(e);
									}
									return null;
								}
								
							});
							updateArtifacts(target);
						}
						
					};
					if (rowModel.getObject().isDirectory())
						link.add(new ConfirmClickModifier("Do you really want to delete this directory?"));
					else
						link.add(new ConfirmClickModifier("Do you really want to delete this file?"));
					fragment.add(link);
					cellItem.add(fragment);
				}
				
			});
		}
		
		ITreeProvider<File> dataProvider = new ITreeProvider<File>() {

			@Override
			public void detach() {
			}

			@Override
			public Iterator<? extends File> getChildren(File node) {
				List<File> dirs = new ArrayList<File>(Arrays.asList(node.listFiles(new FileFilter() {

					@Override
					public boolean accept(File pathname) {
						return pathname.isDirectory();
					}
					
				})));
				dirs.sort(Comparator.comparing(File::getName));

				List<File> files = new ArrayList<File>(Arrays.asList(node.listFiles(new FileFilter() {

					@Override
					public boolean accept(File pathname) {
						return pathname.isFile();
					}
					
				})));
				files.sort(Comparator.comparing(File::getName));
				
				List<File> children = new ArrayList<>();
				children.addAll(dirs);
				children.addAll(files);
				
				return children.iterator();
			}
			
			@Override
			public Iterator<? extends File> getRoots() {
				return getChildren(getBuild().getArtifactsDir());
			}

			@Override
			public boolean hasChildren(File node) {
				return node.isDirectory() && node.listFiles().length != 0;
			}

			@Override
			public IModel<File> model(File object) {
				return Model.of(object);
			}
			
		};
		
		add(new TableTree<File, Void>("artifacts", columns, dataProvider, Integer.MAX_VALUE) {

			@Override
			protected void onInitialize() {
				super.onInitialize();
			    getTable().addTopToolbar(new HeadersToolbar<Void>(getTable(), null));
			    getTable().addBottomToolbar(new NoRecordsToolbar(getTable()));	
				getTable().add(new NoRecordsBehavior());
			    getTable().add(AttributeAppender.append("class", "table"));
			    add(new HumanTheme());
				expand(getBuild().getArtifactsDir());
				setOutputMarkupPlaceholderTag(true);
			}

			@Override
			protected void onConfigure() {
				super.onConfigure();
				setVisible(getBuild().hasArtifacts());
			}

			@Override
			protected Item<File> newRowItem(String id, int index, IModel<File> model) {
				return new OddEvenItem<File>(id, index, model);
			}

			@Override
			public void expand(File file) {
				super.expand(file);
				
				File[] children = file.listFiles();
				if (children != null && children.length == 1 && children[0].isDirectory())
					expand(children[0]);
			}

			@Override
			protected Component newContentComponent(String id, IModel<File> model) {
				Fragment fragment = new Fragment(id, "artifactFrag", BuildArtifactsPage.this);
				File file = model.getObject();
				WebMarkupContainer link;
				if (file.isDirectory()) {
					link = new AjaxLink<Void>("link") {

						@Override
						public void onClick(AjaxRequestTarget target) {
							if (getState(file) == State.EXPANDED)
								collapse(file);
							else
								expand(file);
						}
						
					};
					link.add(new SpriteImage("icon", "folder"));
					link.add(AttributeAppender.append("class", "folder"));
				} else {
					String artifactPath = getBuild().getArtifactsDir().toURI().relativize(file.toURI()).getPath();
					PageParameters params = ArtifactResource.paramsOf(
							getBuild().getProject(), getBuild().getNumber(), artifactPath); 
					link = new ResourceLink<Void>("link", new ArtifactResourceReference(), params);
					link.add(new SpriteImage("icon", "file"));
					link.add(AttributeAppender.append("class", "file"));
				}
				link.add(new Label("label", file.getName()));
				fragment.add(link);
				
				return fragment;
			}				
			
		});
		add(new WebMarkupContainer("noArtifacts") {

			@Override
			protected void onConfigure() {
				super.onConfigure();
				setVisible(!getBuild().hasArtifacts());
			}
			
		}.setOutputMarkupPlaceholderTag(true));
	}

	private void updateArtifacts(AjaxRequestTarget target) {
		target.add(get("artifacts"));
		target.add(get("noArtifacts"));
	}
	
	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(CssHeaderItem.forReference(new BuildArtifactsCssResourceReference()));
	}
	
}
