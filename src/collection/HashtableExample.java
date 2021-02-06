package collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		//아이디와 비밀번호를 미리 저장시킨다
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력");
			System.out.print("아이디: ");
			String id = sc.nextLine();
			
			System.out.print("비밀번호: ");
			String pw = sc.nextLine();
			System.out.println();
			
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 완료");
					break;
				} else {
					System.out.println("비밀번호 틀림");
				}
			} else {
				System.out.println("입력하신 아이디 존재x");
			}
		}
		
	}
}
