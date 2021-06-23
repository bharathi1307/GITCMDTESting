package com.utilsdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	public static Properties prop = new Properties();
	public static void loadProperties()
	{
		try {
			prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "\\Configg\\config.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getPropertyByKey(String key) {
        return prop.getProperty(key);
    }
}
