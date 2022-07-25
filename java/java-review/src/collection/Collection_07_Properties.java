package collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection_07_Properties {
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			FileReader reader = new FileReader(
					"./src/collection/user.properties");
			
			prop.load(reader); 
			System.out.println(prop);
			
			String user = prop.getProperty("username");
			System.out.println("user: " + user);
			
			prop.setProperty("username", "John");
			FileWriter writer = new FileWriter(
					"./src/collection/user.properties");
			prop.store(writer, "comment: write user comment");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없음");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("------");
		Properties sysProp = System.getProperties();
		
		System.out.println(sysProp.get("java.version"));
		
		System.out.println(sysProp.get("os.name"));
		
		System.out.println(sysProp);
		
		System.out.println(sysProp.get("java.vm.specification.name"));
		
		
		
		
		
	}


}
