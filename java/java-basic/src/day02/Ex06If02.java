package day02;
// ����ڷκ��� ���ڸ� �Է¹޾Ƽ�
// �ش���ڰ� ¦���� �޽����� ����ϼ���
// ����:
// ����: 6
// 6�� ¦���Դϴ�.
// ���α׷� ����

// ����: 5
// ���α׷� ����

import java.util.Scanner;
public class Ex06If02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����: ");
		int number = scanner.nextInt();
		
		if(number%2==0) {
			System.out.println(number + "�� ¦���Դϴ�.");
		}
		System.out.println("���α׷� ����");
		
		scanner.close();

	}

}
