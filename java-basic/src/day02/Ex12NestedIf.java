package day02;
// ��ø if�� ����� ����
// ����ڷκ��� ����, ����, ��ü����� �Է¹޾�
// ����, ����, ���� �� ����ϴ� ���α׷�
// �� ������ ��쿣 ���� ��ü����� �Է¹��� �ʰ�
// ���� �̼������� ��쿣 ��ü����� �Է¹��� �ʴ´�.

import java.util.Scanner;
public class Ex12NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����(���ڴ� 1 ���ڴ� 2): ");
		int sex = scanner.nextInt();
		if (sex == 1) {
			// �����̹Ƿ� ���̸� �Է¹޴´�.
			System.out.print("����: ");
			int age = scanner.nextInt();
			if (age >= 18) {
				// �����̹Ƿ� ��ü����� �Է¹޴´�.
				System.out.print("��ü���: ");
				int category = scanner.nextInt();
				if(category <= 3) {
					System.out.println("�����Դϴ�.");
				} else if (category == 4) {
					System.out.println("�����Դϴ�.");
				} else {
					System.out.println("�����Դϴ�.");
				}
			} else {
				// �̼������̹Ƿ� �޽����� ���
				System.out.println("���� �̼������Դϴ�.");
			}
		} else {
			// �����̹Ƿ� �޽����� ���
			System.out.println("�������Դ� ������ �ǹ��� �����ϴ�.");
		}
		

		
		scanner.close();
	}

}
