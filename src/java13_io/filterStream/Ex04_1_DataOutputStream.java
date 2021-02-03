package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_1_DataOutputStream {
	public static void main(String[] args) {
		
		//출력 파일 객체
		File file = new File("./src/java13_io/filterStream", "dataTest.txt");
		System.out.println(file.exists());
		//데이터 출력 스트림
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file)));
			//File -> FileOutputStream -> BufferedOutputStream -> DataOutputStream
					
			dos.writeBoolean(true); //1B
			dos.writeChar('가'); //2B
			dos.writeInt(123); //4B
			
			dos.flush(); //버퍼 비우기
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
