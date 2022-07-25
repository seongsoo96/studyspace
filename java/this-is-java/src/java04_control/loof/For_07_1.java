package java04_control.loof;

public class For_07_1 {
	public static void main(String[] args) {
		
		//초기식, 증감식에는 여러 개의 코드를 쓸 수 있다
		//각 코드는 , 로 구분한다
		
		//안좋다 쓰지 말자
		
		int account = 0;
		
		for(int i=0, money = 10; i<15; i++, account += money, money *= 2);
		System.out.println("저축한 총 금액 : " + account + "원");
		
	}
}
