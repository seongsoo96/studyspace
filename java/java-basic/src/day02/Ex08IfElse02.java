package day02;
// ����ڷκ��� ������ �Է¹޾Ƽ�
// �ش� ������ Ȧ������ ¦������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�

import java.util.Scanner;
public class Ex08IfElse02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("����: " + number);
		
		if (number%2 == 0) {
			System.out.println("¦���Դϴ�");
		} else {
			System.out.println("Ȧ���Դϴ�");
		}
		
		scanner.close();
	}
	
	
}
