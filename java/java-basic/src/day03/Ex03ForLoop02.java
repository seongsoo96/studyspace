package day03;
// for loop ����

// 1. ����ڷκ��� ������ �ϳ� �Է¹޾Ƽ�
//	  1���� �� �������� ���� ���Ͽ� ����ϴ� ���α׷���
//	  �ۼ��Ͻÿ�.

// 2. ����ڷκ��� ������ ���� �Է¹޾Ƽ�
//	  1���� �׼������� ���� ���Ͽ� ����ϴ� ���α׷���
//	  �ۼ��Ͻÿ�
import java.util.Scanner;

public class Ex03ForLoop02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1���� ���� ���� ������ �Է��Ͻÿ�: ");
		int number = scanner.nextInt();

		int result = 0;
		for (int i = 1; i <= number; i++) {
			// result�� ���簪 �� i�� ���ؼ� �ٽ� result�� �Ҵ��ض�
			result += i; // result = result + i
		}
		System.out.printf("1���� %d������ ��: %d\n", number, result);
		
		System.out.print("1���� ���� ���� ������ �Է��Ͻÿ�: ");
		int number2 = scanner.nextInt();
		
		int result2 = 1;
		if(number2 >= 13) {
			System.out.println("�����÷ο� �߻��Ͽ� ��Ȯ�Ѱ�� �Ұ�");
		} else {
			for (int j = 1; j <=number2; j++) {
				result2 *= j;
			}
			System.out.printf("1���� %d������ ��: %d\n", number2, result2);
		}
		
		scanner.close();
	}
}
