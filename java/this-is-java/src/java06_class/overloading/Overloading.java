package java06_class.overloading;

public class Overloading {

	//멤버필드
		private int x;
		private int y;
		
		//멤버필드 x, y를 출력하는 기능 - 멤버 메소드
		public void display() {
			System.out.println("(" + x + ", " + y + ")");
		}
		
		//멤버필드 x, y에 값을 저장하고 나서 출력하는 기능 - 멤버메소드
		public void display(int x, int y) {
			this.x = x;
			this.y = y;
			
			System.out.println("(" + this.x + ", " + this.y + ")");
		}
		
		//------------------------------
		public void display(double d) {
		}
		
		public void display(String str) {
		}
//		public int display(double d) { //에러
//		}
	
}
