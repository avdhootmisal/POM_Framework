package com.guruprasad.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileHelper {
	
	File file;
	FileInputStream fis;
	Properties prop;
	
	public PropertiesFileHelper(String fileLocations) {
		file = new File(fileLocations);
		try {
			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String getPropFileValue(String key) {
		return prop.getProperty(key);
	}

}
