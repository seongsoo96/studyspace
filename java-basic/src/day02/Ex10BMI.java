package day02;
// 사용자로부터 키와 몸무게를 입력받아서
// 저체중 - 정상 - 과체중 - 비만 - 고도비만 이 출력되는 프로그램을 작성하시오
// 단 사용자가 키를 입력할 때에는 m단위로 입력 받고
// 몸무게는 kg 단위로 입력받도록 합니다.

// 예시: 키 170cm - 1.7
//	     몸무게 60kg -> 60.0
// BMI 공식은
// 몸무게 / 키 / 키 입니다.

// BMI 18.5 미만: 저체중
// 18.5~24.9: 정상체중
// 25~29.9: 과체중
// 30~34.9: 비만
// 35이상: 고도비만
import java.util.Scanner;
public class Ex10BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키(m단위): " );
		double height =  scanner.nextDouble();
		
		System.out.print("몸무게(kg단위): ");
		double weight = scanner.nextDouble();
		
		double bmi = weight / height / height;
		
		System.out.printf("BMI: %.2f\n", bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if ( bmi<25) {
			System.out.println("정상체중");
		}else if(bmi < 30) {
			System.out.println("과체중");
		}else if(bmi < 35 ) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
				
		scanner.close();

	}

}
