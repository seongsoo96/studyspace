package day02;
// ����ڷκ��� Ű�� �����Ը� �Է¹޾Ƽ�
// ��ü�� - ���� - ��ü�� - �� - ���� �� ��µǴ� ���α׷��� �ۼ��Ͻÿ�
// �� ����ڰ� Ű�� �Է��� ������ m������ �Է� �ް�
// �����Դ� kg ������ �Է¹޵��� �մϴ�.

// ����: Ű 170cm - 1.7
//	     ������ 60kg -> 60.0
// BMI ������
// ������ / Ű / Ű �Դϴ�.

// BMI 18.5 �̸�: ��ü��
// 18.5~24.9: ����ü��
// 25~29.9: ��ü��
// 30~34.9: ��
// 35�̻�: ����
import java.util.Scanner;
public class Ex10BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ű(m����): " );
		double height =  scanner.nextDouble();
		
		System.out.print("������(kg����): ");
		double weight = scanner.nextDouble();
		
		double bmi = weight / height / height;
		
		System.out.printf("BMI: %.2f\n", bmi);
		
		if(bmi < 18.5) {
			System.out.println("��ü��");
		}else if ( bmi<25) {
			System.out.println("����ü��");
		}else if(bmi < 30) {
			System.out.println("��ü��");
		}else if(bmi < 35 ) {
			System.out.println("��");
		}else {
			System.out.println("����");
		}
				
		scanner.close();

	}

}
