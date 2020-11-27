package day04;
// ���� ���� ���α׷��� ����ÿ�

// ���� 1: ����ڰ� �߸��� �Է��� �ϸ� �ùٸ� ������ ���ö����� �ٽ� �Է��ϰ�
//        �ۼ��Ͻÿ�
// ���� 2: �޴��� ���� ����ڰ� �Է��� �����ϸ� ������ �Է��ϰ�
//        ����� ������ ������ ������ �����Ͽ� ������ ����Ҽ� �ֵ��� 
//        �ۼ��Ͻÿ�
// ��������: ���� ����ڰ� �ƹ��� �Է¾��� ����� �����ϸ�
//         �ƹ��� ������ �Էµ��� �ʾҽ��ϴٰ� ��µǰ� �ۼ��Ͻÿ�
// (45�б���)

// ����غ���: ������ ������ġ
import java.util.Scanner;

public class Ex06GradeBook02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int SUBJECT_SIZE = 3;

		// �л��� ������ ���� ������ ��ġ�� ��� �Ǿ�� �ұ�?
		// ������ while ���� ������ �ȴ�.

		int id = 0;
		String name = new String();
		int korean = -1;
		int english = -1;
		int math = -1;

		boolean dataSwitch = false;

		while (true) {
			System.out.println("1. �Է� 2. ��� 3. ����");
			int userChoice = scanner.nextInt();
			if (userChoice == 1) {
				// �Է��ϴ� �ڵ带 �����ش�.
				System.out.print("��ȣ: ");
				id = scanner.nextInt();

				System.out.print("�̸�: ");
				scanner.nextLine();
				name = scanner.nextLine();

				System.out.print("����: ");
				korean = scanner.nextInt();
				while (korean < 0 || korean > 100) {
					System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");
					System.out.print("����: ");
					korean = scanner.nextInt();
				}

				System.out.print("����: ");
				english = scanner.nextInt();
				while (english < 0 || english > 100) {
					System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");
					System.out.print("����: ");
					english = scanner.nextInt();
				}

				System.out.print("����: ");
				math = scanner.nextInt();
				while (math < 0 || math > 100) {
					System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");
					System.out.print("����: ");
					math = scanner.nextInt();
				}

				dataSwitch = true;

			} else if (userChoice == 2) {
				// ���� ����ڰ� �ƹ��� ���� �Է����� �ʰ� ����� �ҷ��� �ϸ�
				// "���� �Էµ� ������ �����ϴ�." ���
				// ����� ���ְ� �ʹٸ�
				// 2���� ������� ó���� �����ϴ�.

				// 1. boolean ������ ���� �Է��� ������
				// true�� �ٲ㼭 üũ�ϴ� ���

				if (dataSwitch) {
					// ����ϴ� �ڵ带 �����ش�.
					System.out.printf("��ȣ: %03d�� �̸�: %s\n", id, name);
					System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", korean, english, math);
					int sum = korean + english + math;
					double average = sum / (double) SUBJECT_SIZE;
					System.out.printf("����: %03d�� ���: %.2f��\n", sum, average);

				} else {
					System.out.println("���� �Էµ� ������ �����ϴ�.");
				}

				// 2. ���� ���� ���� ������ �ʱ�ȭ���� �Ұ����� ������
				// �ʱ�ȭ �ϴ� ���
				if(name.isEmpty()) {
					System.out.println("���� �Էµ� ������ �����ϴ�.");
				}

			} else if (userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}

		scanner.close();
	}
}
