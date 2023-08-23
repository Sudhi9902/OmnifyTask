package Generic_Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data {
	public static String Userdata(String key) throws IOException {
		String value;
		FileInputStream fis=new FileInputStream(new File("./src/test/resources/LoginCredentials.properties"));
		Properties prop=new Properties();
		prop.load(fis);
		value=prop.getProperty(key);
		return value;
		
	}
}
