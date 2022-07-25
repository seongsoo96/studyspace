package java12_exception;

class ThrowsTest{
	public void method() throws Exception{
		
		//CheckException -> 반드시 예외처리해야 함
		throw new Exception();
	}
}



public class ExceptionEx_05 {
	public static void main(String[] args) {
		
		ThrowsTest tt = new ThrowsTest();
		
		try {
			tt.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
