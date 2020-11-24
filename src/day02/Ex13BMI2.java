package day02;
// 사용자로부터 키와 몸무게를 입력받아
// 저체중 정상체중 과체중 비만 고도비만을 출력하는 프로그램을 작성하시오
// 단 사용자가 잘못된 키(.2미만 or 2.5 이상)을 입력하면 "잘못 입력하셔서 종료합니다."
// 출력되고
// 올바른 키를 입력하더라도 잘못된 몸무게(3미만 or 200이상)을 입력하면
// 잘못 입력하셔셔 종료합니다. 가 출력되게 프로그램을 작성하시오

// 즉 키 입력 -> 몸무게 입력 -> 결과 출력 의 과정에서
// 키가 잘못됐을 경우 메시지 출력 후 프로그램 종료
// 몸무게가 잘못됐을 경우 메시지 출력 후 프로그램 종료
// 가 될 수 있도록 프로그램을 구성하시오

// BMI 18.5 미만: 저체중
//18.5~24.9: 정상체중
//25~29.9: 과체중
//30~34.9: 비만
//35이상: 고도비만
import java.util.Scanner;
public class Ex13BMI2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키(m단위): ");
		double height = scanner.nextDouble();
		if (height<.2 || height>=2.5) {
			// 올바르지 않은 키이므로 경고메시지 출력 후 종료
			System.out.println("잘못 입력하셔서 종료합니다.");
		} else {
			// 올바른 키가 입력됐으므로 몸무게를 입력받는다.
			System.out.print("몸무게(kg단위): ");
			double weight = scanner.nextDouble();
			if(weight < 3 || weight >= 200) {
				// 올바르지 않은 몸무게이므로 경고메시지 출력 후 종료
				System.out.println("잘못 입력하셔서 종료합니다.");
			} else {
				// 올바른 키와 몸무게가 입력됐으므로 BMI 계산 후 결과 출력
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
			}
		}
		
		
		scanner.close();
	}

}
