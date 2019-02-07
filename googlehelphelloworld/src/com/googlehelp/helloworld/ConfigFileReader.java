package com.googlehelp.helloworld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "C:\\Users\\deltaman\\Documents\\Automation\\SeleniumProjects\\googlehelphelloworld\\src\\com\\googlehelp\\helloworld\\SearchText.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at "
					+ propertyFilePath);
		}
	}

	public String getSearchText() {
		String searchText = properties.getProperty("strSearch");
		if (searchText != null)
			return searchText;
		else
			throw new RuntimeException(
					"url not specified in the Configuration.properties file.");
	}
}