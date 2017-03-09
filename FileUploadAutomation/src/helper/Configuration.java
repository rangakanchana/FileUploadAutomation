package helper;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Configuration {
	
	 Properties prop;
		
		public Configuration(){
			
		try {
			FileReader reader = new FileReader(new File("./config.properties"));
			
			 prop = new Properties();	
			
			prop.load(reader);

		} catch (Exception e) {
			System.out.println("Exception is:::: " +e.getMessage());
		}
		}
		
		public  String getChromePath(){
			
			return prop.getProperty("chromepath");
		}
		
		public  String getIEPath(){
			
			return prop.getProperty("iedriverpath");
		}
		
		public  String getUrl(){
			
			return prop.getProperty("url");
		}
		
		public String getBrowser(){
			
			return prop.getProperty("browser");
		}
		
		public String getGeckPath(){
			
			return prop.getProperty("geckopath");
		}

}
