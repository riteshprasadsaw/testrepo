package genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties pro;
	public ConfigReader(){
		try{
			File src=new File ("./Configuration/Config.property");
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	
	public String GetApplicationURL(){
		return pro.getProperty("URL");
		
	}
}
