package java04_control.switchEx;

public class Switch_01 {
	public static void main(String[] args) {
		
		//switch문, 선택문
		//	switc-case문
		
//		switch( 비교대상 ) {
//		
//		case 값1:
//			
//		case 값2:
//			
//		case 값3:
//			
//		  ...
//		  
//		default:  
//		
//		}
		
		//-------------------------------------------------
		
		int num = 20;

		switch( num ) {
			case 30:
				System.out.println("num은 30입니다");
				break;
	
			case 10:
				System.out.println("num은 10입니다");
				break;
	
			case 20:
				System.out.println("num은 20입니다");
				break;
	
			default:
				System.out.println("num은 10,20,30 모두 아닙니다");
		}
		
		//	비교대상의 값과 case에 지정한 값이 같으면
		//해당 case구문의 위치부터 코드가 실행된다
		
		//	다음 case구문까지 모두 실행된다
		//	-> case구문의 마지막에 break; 코드를 사용한다
		
		//	case에 지정된 값 중에서 같은 값이 없으면 default:
		
		//	default: 생략 가능
		
	}
}
