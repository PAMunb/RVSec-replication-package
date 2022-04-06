package br.unb.cic.maven.invoker.io;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import br.unb.cic.maven.invoker.model.Configuration;

public class ConfigurationParserYaml {
	private ObjectMapper om;
	
	public ConfigurationParserYaml() {
		om = new ObjectMapper(new YAMLFactory());
	}

	public Configuration read(File file) throws StreamReadException, DatabindException, IOException {
		return om.readValue(file, Configuration.class);
	}

	public void write(Configuration configuration, File out) throws StreamWriteException, DatabindException, IOException {
		om.writeValue(out, configuration);
	}

}
