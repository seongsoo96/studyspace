package day04;
// ����ڷκ���
// ��ȣ �̸� ���� ���� ���� ������ ���ʴ�� �Է¹ް�
// ��ȣ: 001�� �̸�: ���翵
// ����: 070�� ����: 070�� ����: 071��
// ����: 211�� ���: 70.33��
// �� ���·� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
// �� ����ڰ� �ùٸ��� ���� ������ ������ �Է��� �ÿ���
// "�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"
// "����: "
// �� ��µǸ鼭 �ùٸ� ������ �Էµɶ�����
// �ٽ� �Է� �޴� ���α׷����� �ۼ��Ͻÿ�(30�б���)
import java.util.Scanner;

public class Ex03GradeBook01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int SUBJECT_SIZE = 3;
		
		System.out.print("��ȣ: ");
		int id = scanner.nextInt();
		
		System.out.print("�̸�: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.print("����: ");
		int korean = scanner.nextInt();
		while(korean < 0 || korean > 100) {
			System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");
			System.out.print("����: ");
			korean = scanner.nextInt();
		}
		
		System.out.print("����: ");
		int english = scanner.nextInt();
		while(english < 0 || english > 100) {
			System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");
			System.out.print("����: ");
			english = scanner.nextInt();
		}
		
		System.out.print("����: ");
		int math = scanner.nextInt();
		while(math < 0 || math > 100) {
			System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");
			System.out.print("����: ");
			math = scanner.nextInt();
		}
		
		System.out.printf("��ȣ: %03d�� �̸�: %s\n", id, name);
		System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", 
				korean, english, math);
		int sum = korean + english + math;
		double average = sum / (double)SUBJECT_SIZE;
		System.out.printf("����: %03d�� ���: %.2f��\n", sum, average);
		
		
		scanner.close();
	}
}














