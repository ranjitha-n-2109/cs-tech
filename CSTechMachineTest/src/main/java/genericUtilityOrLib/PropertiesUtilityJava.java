package genericUtilityOrLib;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtilityJava
{
	
	public String getDataFromProperties(String data) throws Exception 
	{
	FileInputStream fis = new FileInputStream(IconstantUtility.PropertiesPath);
	Properties pobj = new Properties();
	pobj.load(fis);
	String value = pobj.getProperty(data);
	return value;
	}

}
