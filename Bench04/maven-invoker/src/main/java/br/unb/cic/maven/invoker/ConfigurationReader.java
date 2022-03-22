package br.unb.cic.maven.invoker;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import br.unb.cic.maven.invoker.model.Configuration;
import br.unb.cic.maven.invoker.model.Project;

public class ConfigurationReader {

    public static Configuration read(File file) throws IOException, CsvValidationException {
        List<Project> projects = new LinkedList<>();      
        
        try (Reader reader = Files.newBufferedReader(file.toPath()); 
                CSVReader csvReader = getCSVReader(reader)) {
            String[] line;

            while ((line = csvReader.readNext()) != null) {
                projects.add(new Project(line[0], Arrays.asList(line[1].split(" "))));
            }
        }
                
        return new Configuration(projects);
    }
    
    private static CSVReader getCSVReader(Reader reader) {
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .withIgnoreQuotations(true)
                .build();

        return new CSVReaderBuilder(reader)
                .withSkipLines(0)
                .withCSVParser(parser)
                .build();
    }       

}
