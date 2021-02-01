package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection_06_Properties {
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			FileReader reader = new FileReader(
					"./src/java10_collection/user.properties");
			//	./	-> 현재 프로그램(main())이 실행된 폴더
			//		-> 프로젝트 폴더
			
			prop.load(reader); //파일의 내용을 읽어 Properties 객체에 저장
			System.out.println(prop);
			
			//--- 속성값 가져오기 ---
			String user = prop.getProperty("username");
			System.out.println("USER : " + user);

			
			//--- 속성값 바꿔서 저장하기 ---
			prop.setProperty("username", "Bob");
			
			FileWriter writer = new FileWriter(
					"./src/java10_collection/user.properties");
			prop.store(writer, "comment: write user comment");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("------------------");
		
		Properties sysProp = System.getProperties(); //시스템 설정항목
		
		System.out.println("\n--- 자바 버전 ---");
		System.out.println( sysProp.getProperty("java.version") );
		
		System.out.println("\n--- OS 이름 ---");
		System.out.println( sysProp.getProperty("os.name") );
		
		System.out.println("\n---------------");
		System.out.println( sysProp );
		
		
		
	}
}
