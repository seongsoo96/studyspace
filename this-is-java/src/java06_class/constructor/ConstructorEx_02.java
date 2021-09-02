package java06_class.constructor;

//  java06_class.constructor.Constructor_02
class Constructor_02{
	
	//멤버 필드
	private int num1;
	private int num2;
	
	public Constructor_02() {
		
//		this(99999, -1); //this생성자 호출
		this(99999); //this생성자 호출
		
//		this.num1 = 99999;
//		this.num2 = -1;
		
		System.out.println("디폴트 생성자");
	}
	public Constructor_02(int num1) {
		
		//this생성자 호출
		//	-> 생성자호출 코드는 반드시 첫번째 코드여야한다
		this(num1, 0);
//		this.num1 = num1;
		
		System.out.println("매개변수가 1개인 생성자");
	}
	
	
	public Constructor_02(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
//		setNum1(num1);
//		setNum2(num2);
		
		System.out.println("매개변수가 2개인 생성자");
	}
	
	
	
	
	//모든 멤버 필드의 값을 출력하는 기능
	public void out() {
		System.out.println("num1: " + num1 + ", num2: " + num2);
	}
	
	//Getters, Setters : command + option + s,
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}


// java06_class.constructor.ConstructorEx_02
public class ConstructorEx_02 {
	public static void main(String[] args) {
		
		Constructor_02 cons1 = new Constructor_02(888, 999);
		cons1.out();
		System.out.println("----------------");
		
		Constructor_02 cons2 = new Constructor_02(666);
		cons2.out();
		
		System.out.println("----------------");
		Constructor_02 cons3 = new Constructor_02();
		cons3.out();
		
	}
}
