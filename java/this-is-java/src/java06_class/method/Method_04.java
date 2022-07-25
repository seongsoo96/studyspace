package java06_class.method;

public class Method_04 {

	public void returnTest01() {
		
		for(int i=0; i<100; i++ ) {
			
			if(i == 5) {
//				break;
				return;
			}
			System.out.println(i);
				
		}
		
		System.out.println("반복문 종료 후 실행됨");
	}
	
	public int returnTest02(int num) {
		
		if( num < 0 ) { //전달인자가 음수라면 처리하지 않음
			return -1;
		}
		
		for(int i=0; i<num; i++) { //num횟수만큼
			System.out.println("Apple");
		}
		
		return num;
		
	}
}
