package day02;
// ����ڷκ���
// ��ȣ -> �̸� -> ���� -> ���� -> ���� ���� ������ �Է� �ް�
// ��ȣ: 001�� �̸�: �̼���
// ����: 080�� ����: 078�� ����: 079��
// ���� 237�� ���: 79.00��
// �� �������� ��µǰ� ���α׷��� �ۼ��Ͻÿ�. (���½ð� �����ؼ� 12�� 10�б���)
import java.util.Scanner;
public class Ex04Grade {

	public static void main(String[] args) {
		final int SUBJECT_SIZE = 3;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("��ȣ: ");
		int number = scanner.nextInt();
		
		System.out.print("�̸�: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.print("����: ");
		int korean = scanner.nextInt();
		
		System.out.print("����: ");
		int english = scanner.nextInt();
		
		System.out.print("����: ");
		int math = scanner.nextInt();
		
		// ������ ������ int ����
		int sum = korean + english + math;
		
		// ����� ������ double ����
		double average = sum / (double)SUBJECT_SIZE;
		
		System.out.printf("��ȣ: %03d�� �̸�: %s\n", number, name);
		System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", korean, english, math);
		System.out.printf("����: %03d�� ���: %.2f��\n", sum, average);
		
		scanner.close();
	}	
}		
		
		// ���� �õ��� ��
//		Scanner scanner = new Scanner(System.in);
//		int number;
//		number = scanner.nextInt();
//		System.out.printf("��ȣ: %03d\n", number);
//		
//		scanner.nextLine();
//		String name = scanner.nextLine();
//		System.out.print("�̸�: " +name);
//
//		number = scanner.nextInt();
//		System.out.printf("����: %03d\n ", number);
//		number = scanner.nextInt();
//		System.out.print("����: " + number + "��");
//		number = scanner.nextInt();
//		System.out.print("����: " + number + "��");
//		number = scanner.nextInt();
//		System.out.println("���� " + number + "��");
		
