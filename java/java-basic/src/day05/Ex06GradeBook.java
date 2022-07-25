package day05;

import java.util.ArrayList;
import java.util.Scanner;

import day04.Student;

public class Ex06GradeBook {
	private final static int SIZE = 5;
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. �Է� 2. ��� 3. ����");
			System.out.print("> ");
			int userChoice = scanner.nextInt();

			if (userChoice == 1) {
				// �л��� 5�� ������ �߰� �����ϰ� �Ѵ�.
				if (list.size() < SIZE) {
					// �����͸� ���� Student ��ü ����
					Student s = new Student();

					System.out.print("��ȣ: ");
					s.setId(scanner.nextInt());

					System.out.print("�̸�: ");
					scanner.nextLine();
					s.setName(scanner.nextLine());
					
					// �ߺ��� ��ȣ�� �̸��� ���� �л��� ���� �ڵ�
//					while(list.contains(s)) {
//						System.out.println("�̹� �����ϴ� �л��Դϴ�.");
//						System.out.println("���ο� �л��� �Է����ּ���");
//						
//						System.out.print("��ȣ: ");
//						s.setId(scanner.nextInt());
//
//						System.out.print("�̸�: ");
//						scanner.nextLine();
//						s.setName(scanner.nextLine());
//					}
					
					// ����ڰ� �Է��� �л��� ������ �ÿ���
					// �ش� �л��� ������ ������ ���� �ϴ� �ڵ�
					
					if(list.contains(s)) {
						//�л� ���� �ڵ� ����
						// 1. ����Ʈ���� �ش� �л��� index�� �ҷ��´�.
						int index = list.indexOf(s);
						
						// get(index)�� �����Ű�� 
						// �ű⿡ setKorean���� �޼ҵ带 �����Ų��.
						
						list.get(index).setKorean(s.validateScore(scanner, "����: "));
						list.get(index).setEnglish(s.validateScore(scanner, "����: "));
						list.get(index).setMath(s.validateScore(scanner, "����: "));
						
					}else {
						//s�� ���� �Է��� list�� �߰�
						s.setKorean(s.validateScore(scanner, "����: "));
						s.setEnglish(s.validateScore(scanner, "����: "));
						s.setMath(s.validateScore(scanner, "����: "));

						list.add(s);
					}
					

					
				} else {
					System.out.println("�ִ� �л����� �����߽��ϴ�.");
				}

			} else if (userChoice == 2) {
				// ����Ʈ�� ����ϴ� �ڵ� ����
				// �� ����Ʈ�� ������� ���
				// ���� �߰��� �л��� ���ٰ� ��� �޽����� ���
				if (list.isEmpty()) {
					System.out.println("���� �߰��� �л��� �����ϴ�.");

				} else {
					for (Student s : list) {
						System.out.println("--------------------------");
						System.out.printf("��ȣ: %03d�� �̸�: %s\n", s.getId(),
								s.getName());
						System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n",
								s.getKorean(), s.getEnglish(), s.getMath());

						System.out.printf("����: %03d�� ���: %.2f��\n",
								s.calculateSum(), s.calculateAverage());
						System.out.println("--------------------------");
					}
				}

			} else if (userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}

		}

		scanner.close();
	}
}
