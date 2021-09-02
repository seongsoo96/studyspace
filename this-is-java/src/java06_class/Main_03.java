package java06_class;

public class Main_03 {
	public static void main(String[] args) {
		
		Class_03 cl = new Class_03();
		
//		System.out.println( cl.num ); //에러 private이라서.
		
		//setter를 이용한 필드값 대입
		cl.setNum(123);
		
		//getter를 이용한 필드값 출력
		System.out.println(cl.getNum());
		
		//private접근자로 멤버필드에 대한 외부 접근을 막고
		//getter, setter 메소드를 이용하여 일부분만 접근을 허용한다
		
		// getter: 멤버필드에 값을 불러온다
		// setter: 멤버필드에 값을 저장한다
		
	}
}
