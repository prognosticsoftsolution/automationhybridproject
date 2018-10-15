package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider() {
		
		File src=new File("./configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			
			pro= new Properties();
			pro.load(fis);
		} catch (Exception e) {

		System.out.println("exception is"+e.getMessage());
		
		}
	} 

	public String getApplicationUrl() {
		
		String url=pro.getProperty("url");
		return url;
		
	}
	
	public String getChromePath() {
		
		String url=pro.getProperty("chromepath");
		return url;
		
		
	}
	public String getFirefoxPath() {
		String url=pro.getProperty("firefoxpath");
		return url;
	}
}
