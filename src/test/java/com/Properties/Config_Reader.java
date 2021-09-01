

package com.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {

	
	public static Properties p;
	
	public Config_Reader() throws IOException {
		File location = new File("C:\\Users\\admin\\Documents\\Custom Office Templates\\AdactinCucumber\\src\\test\\java\\com\\Properties\\Config.Properties");
		FileInputStream read = new FileInputStream(location);
		p=new Properties();
		p.load(read);
		
	}
	public String getBrowser() {
	
		
	String browser = p.getProperty("browser");
		
		return browser;	
		
	}
	
	public String getURL() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getCC_Details() {
		String creditno = p.getProperty("creditno");
		//int credit = Integer.parseInt(creditno);
		return creditno;
	}
	
	public String getCVV() {
		
		String cvv = p.getProperty("cvv");
		//int ccvv=Integer.parseInt(cvv);
		return cvv;
	}
}
