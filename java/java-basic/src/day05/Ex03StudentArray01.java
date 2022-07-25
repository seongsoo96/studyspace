package day05;

import java.util.Scanner;

import day04.Student;

// �迭�� ����Ͽ� �л����� �����ϴ� ���α׷�

public class Ex03StudentArray01 {
	private final static int SIZE = 5;
	public static void main(String[] args) {
		//�л� �迭 ����
		Student[] studentArray = new Student[SIZE];
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1. �Է� 2. ��� 3. ����");
			System.out.print("> ");
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				//�迭�� ���Ƽ� 
				//null�ΰ��� ã�Ƽ�
				//�Է��� �Ѵ�.
				//���� null�� ���� ������
				//��� �޽����� ���
				
				//1. ���� �迭�� �� �� �� null�� ���� 
				//   ��ġ��ȣ�� ������ int ���� index�� ����
				//   �� index�� -1�� �ʱ�ȭ�Ѵ�.
				//   ���� �迭�� �� á�ٸ� index�� -1�� ���������Ƿ�
				//   �츮�� �޽��� ����� ������ ����.
				int index = -1;
				
				// for���� ����Ͽ�
				// null�� ���� ��ġ��ȣ�� index�� �ְ� break
				for(int i = 0; i < studentArray.length; i++) {
					if(studentArray[i] == null) {
						index = i;
						break;
					}
				}
				
				// ���� index �� -1�̸� "�迭�� �� á���ϴ�" ��
				// ���޽����� ����ϰ�
				// �� �ܿ��� �л���ü�� ����� ������ �ְ�
				// index ĭ�� �ش� ��ü�� �ʱ�ȭ���ش�.
				if(index == -1) {
					System.out.println("���� �迭�� �� á���ϴ�.");
				}else {
					//�л��� ������ ���� ��ü ����
					Student s = new Student();
					System.out.print("��ȣ: ");
					s.setId(scanner.nextInt());
					
					scanner.nextLine();
					System.out.print("�̸�: ");
					s.setName(scanner.nextLine());
					
					s.setKorean(s.validateScore(scanner, "����: "));
					
					s.setEnglish(s.validateScore(scanner, "����: "));
					
					s.setMath(s.validateScore(scanner, "����: "));
					
					studentArray[index] = s;
				}
				
			}else if(userChoice == 2) {
				//�迭�� ���Ƽ�
				//�Ѱ��̶� null�� �ƴ��� üũ�ϰ�
				//��δ� null�̸� ��� �޽��� ���
				//�� �ܿ��� null�� �ƴ� ���� ���
				
				//null�� �ƴϸ� false�� �ٲ��
				//isEmpty boolean ������ true�� ����/�ʱ�ȭ
				boolean isEmpty = true;
				for(int i = 0; i < studentArray.length; i++) {
					if(studentArray[i] != null) {
						isEmpty = false;
						break;
					}
				}
				
				//null�� �ƴѰ��� �����ϴ��� Ȯ���� �Ǿ����Ƿ�
				//if/else ������ ���Ͽ� ����� ���� ����
				if(isEmpty) {
					System.out.println("���� �Էµ� �л��� �������� �ʽ��ϴ�.");  
				}else {
					for(int i = 0; i < studentArray.length; i++) {
						Student s = studentArray[i];
						
						if(s != null) {
							System.out.println("--------------------------");
							System.out.printf("��ȣ: %03d�� �̸�: %s\n", s.getId(), s.getName());
							System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", s.getKorean(), s.getEnglish(), s.getMath());   

							System.out.printf("����: %03d�� ���: %.2f��\n", s.calculateSum(), s.calculateAverage());
							System.out.println("--------------------------");
						}
						
					}
				}
				
				
				
			}else if(userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		
		
		
		scanner.close();
	}
}












