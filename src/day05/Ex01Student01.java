package day05;
// ���ѷ��� �޴��� ��

// �л����� �Է� ���α׷��� �ۼ��Ͻÿ�.
// (30�б���)
// �� ����ڰ� �ƹ��� ������ ���� ����� ������ ���
// "�ƹ��� ������ �Էµ��� �ʾҽ��ϴ�" �� ������ �ۼ��Ͻÿ�

import day04.Student;
import java.util.Scanner;

public class Ex01Student01 {
	public static void main(
			String[] args) {
		Scanner scanner = new Scanner(
				System.in);
		Student s = new Student();
		while (true) {
			System.out.println(
					"1. �Է� 2. ��� 3. ����");
			int userChoice = scanner
					.nextInt();
			if (userChoice == 1) {
				// �л� ���� �Է� �ڵ� ����
				System.out.print("��ȣ: ");
				s.setId(scanner.nextInt());
				
				scanner.nextLine();
				System.out.print("�̸�: ");
				s.setName(scanner.nextLine());
				
				s.setKorean(s.validateScore(scanner, "����: "));
				
				s.setEnglish(s.validateScore(scanner, "����: "));
				
				s.setMath(s.validateScore(scanner, "����: "));
				
				
			} else if (userChoice == 2) {
				// �л� ���� ��� �ڵ� ����
				if (s.calculateSum() < 0) {
					System.out.println(
							"���� �Էµ� ������ �����ϴ�.");
				} else {
					System.out.printf(
							"��ȣ: %03d�� �̸�: %s\n",
							s.getId(),
							s.getName());
					System.out.printf(
							"����: %03d�� ����: %03d�� ����: %03d��\n",
							s.getKorean(),
							s.getEnglish(),
							s.getMath());
					System.out.printf(
							"����: %03d�� ���: %.2f��\n",
							s.calculateSum(),
							s.calculateAverage());
				}
			} else if (userChoice == 3) {
				System.out.println(
						"������ּż� �����մϴ�.");
				break;
			}
		}

		scanner.close();
	}
}
