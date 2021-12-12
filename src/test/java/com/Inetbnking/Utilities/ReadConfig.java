package com.Inetbnking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

  Properties prop;
  
  public ReadConfig() {
	  
	  File src = new File("./Configuration/config.properties");
   try {
	   
  
      FileInputStream fis = new FileInputStream(src);
      prop = new Properties();
      prop.load(fis);
   } catch (Exception e) {
	   System.out.println("Exception is "+ e.getMessage());
   }
   

   }
  
  public String getApplicationURL() {
	   String url = prop.getProperty("baseURL");
	   return url;
  }
  
  
  public String getUsername() {
	   String username = prop.getProperty("Username");
	   return username;
 }
  
  public String getPassword() {
	   String pwd = prop.getProperty("Password");
	   return pwd;
}
  
  public String getChromeDriverpath() {
	   String chromepath = prop.getProperty("chromedriverpath");
	   return chromepath;
}
  
  public String getIEpath() {
	   String IEpath = prop.getProperty("IEdriverpath");
	   return IEpath;
}
  
  

}
