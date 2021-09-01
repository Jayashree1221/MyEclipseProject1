package com.Properties;

import java.io.IOException;

public class FileReaderManager {
	
	
	private FileReaderManager() {
		
	}

	
	public static FileReaderManager getInstanceFR() {
		
		FileReaderManager helper = new FileReaderManager();
		return helper;
		
	}
	
	
	public static Config_Reader getInstanceCR() throws IOException {
Config_Reader obj = new Config_Reader();
		return obj;
		
	}
	
	
	
}
