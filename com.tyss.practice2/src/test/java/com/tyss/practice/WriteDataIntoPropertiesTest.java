package com.tyss.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoPropertiesTest {

	public static void main(String[] args) throws Exception {
		  Properties pObj = new Properties();
	        FileOutputStream fos = null;
	        
	        try {
	         
	            pObj.setProperty("browser", "chrome");
	            pObj.setProperty("url", "url");
	            pObj.setProperty("username", "admin");
	            pObj.setProperty("password", "admin");
	            
	            fos = new FileOutputStream(".\\src\\test\\resources\\PropertyFile.properties");
	            pObj.store(fos, "credentials");
	            
	            System.out.println("Properties written successfully.");
	        } 
	        catch (IOException io) {
	            io.printStackTrace();
	        } 
	        finally {
	           fos.close();
	        }

	}

}
