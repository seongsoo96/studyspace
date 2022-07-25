package java06_class.etc;

public class ObjectArray {
	public static void main(String[] args) {
		
		//객체 배열
		
		Student st = new Student("Alce", 50);
		
		//-------------------------------------------
		
		Student[] stuArr; //Student타입의 배열 변수 선언
		
		stuArr = new Student[3]; //Student타입 배열 생성
		
//		stuArr[0].setName("Alice"); //NullPointerException발생
		
//		stuArr[0] = new Student("Bob", 22); //객체 생성이 필요하다
		
		//-------------------------------------------
		
		for(int i=0; i<stuArr.length; i++) {
			stuArr[i] = new Student();
		}
		
		//-------------------------------------------
		
		stuArr[0] = new Student("Alice", 11);
		stuArr[1] = new Student("Bob", 22);
		stuArr[2] = new Student("Clare", 33);
		
		for(int i=0; i<stuArr.length; i++) {
			System.out.println(stuArr[1]);  
		}
		
		
		
	}
}
