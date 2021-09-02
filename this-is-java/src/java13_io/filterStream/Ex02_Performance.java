package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {
	public static void main(String[] args) {
		
		//성능 평가, Performance Evaluation
		//	알고리즘 시작 전 현재시간 체크 - start
		//	알고리즘 완료 후 현재시간 체크 - end
		//	둘의 차이를 구한다, 수행시간 : end - start
		
		long start = System.currentTimeMillis(); //현재시간 밀리초
		// start, end 사이에 평가하려는 알고리즘을 작성한다
		long end = System.currentTimeMillis(); //현재시간 밀리초
		
		System.out.println( end-start );
		System.out.println( (end-start)/(double)1000 );
		
		System.out.println("----------------------------");
		
		//입력대상 파일 객체
		File file = new File("./src/java13_io/filterStream/", "source.txt");
		System.out.println("[TEST] file : " + file.exists());

		//파일 입력 스트림 객체
		FileInputStream fis = null; //1차스트림
		BufferedInputStream bis = null; //2차스트림, 성능 향상 보조스트림
	
		//파일 입력관련 보조 변수
		byte[] buf = new byte[1024]; //입력 데이터 버퍼
		int len = 0; //입력 데이터의 길이
		
		
		try {
			//파일 입력 스트림 생성
			fis = new FileInputStream(file); //File -> FileInputStream
			
			//파일 입력
			start = System.currentTimeMillis();
			while( (len = fis.read(buf)) != -1 ) {
			}
			end = System.currentTimeMillis();
			System.out.println("fis 결과 : " + (end-start)/(double)1000 );
			
			
			System.out.println("----------------");
			
			
			//파일 입력 스트림 생성
			fis = new FileInputStream(file); //File -> FileInputStream
			bis = new BufferedInputStream(fis); // FileInputStream -> BufferedInputStream
			
			//파일 입력
			start = System.currentTimeMillis();
			while( (len = bis.read(buf)) != -1 ) {
			}
			end = System.currentTimeMillis();
			System.out.println("bis 결과 : " + (end-start)/(double)1000 );
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null)	bis.close();
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}