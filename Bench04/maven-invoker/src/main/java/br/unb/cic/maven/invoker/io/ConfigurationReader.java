package br.unb.cic.maven.invoker.io;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import br.unb.cic.maven.invoker.model.Configuration;

public class ConfigurationReader {
	private static final Logger log = LoggerFactory.getLogger(ConfigurationReader.class);
	private ObjectMapper om;

	public ConfigurationReader() {
		om = new ObjectMapper(new YAMLFactory());
	}

	public Configuration read(File file) throws StreamReadException, DatabindException, IOException {
		log.info("Reading configuration: " + file.getAbsolutePath());
		return om.readValue(file, Configuration.class);
	}

}
