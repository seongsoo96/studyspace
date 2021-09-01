package day02;
// ����ڷκ��� ������ �Է¹޾Ƽ�
// 90~100: A
// 80~89: B
// 70~79: C
// 60~69: D
// ~59: F
// �� ��µǴ� ���α׷��� �ۼ��Ͻÿ�

import java.util.Scanner;
public class Ex11GradeBook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����: ");
		int score = scanner.nextInt();
		
		System.out.println("1. �� ������ ���� ���� ����");
		if(score>=90 ) {
			System.out.println("A");
		}else if(score >=80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		System.out.println("------------------------");
		
		// ����(validation)
		// �����̶� ����ڰ� �Է��� ����
		// ��ȿ�� ������ üũ�ϴ� ������ �����̶�� �Ѵ�.
		// ���� �� ���ݰ� ���� ������
		// ���ĺ����� ȯ���ؼ� �����ִ� ���α׷��� ���
		// ������ 0~100 ������ ���ڿ��߸� �Ѵ�.
		// ����ڰ� - ������ �ƴϸ� 100�� �ʰ��ϴ� ���ڸ� �Է��ϸ�
		// �׿� ���� �߸��� ����� ������ �ȴ�.
		
		// ���� �����ϴ� ����� �پ��ϰ� ������
		// �츮�� ���⼭ �ΰ��� ����� ���Ͽ�
		// �ùٸ� ���� �Է��� ������ ���ĺ� ������ ������
		// �� �ܴ� "�߸��� ���������Դϴ�." �� ��µǰ� if-else if ������
		// ���� ���̴�.
		
		// �� �����ϴ� ��� 1��: ���ǽ��� ������ ��Ȯ�ϰ� �������
		System.out.println("�� ���� 1��: ��Ȯ�� ���ǽ�");
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("B");
		} else if(score >=70 && score <= 79) {
			System.out.println("C");
		} else if(score >=60 && score <= 69) {
			System.out.println("D");
		} else if (score >=0 && score <= 59) {
			System.out.println("F");
		} else {
			System.out.println("�߸��� ���������Դϴ�.");
		}
		System.out.println("------------------------");
		
		// �� �����ϴ� ��� 2��: ���� ���� ��ȿ�������� üũ�Ѵ�.
		// �̶��� ������ "��ø if(nested if)" ���°� �ȴ�.
		// ��ø if���̶� Ŀ�ٶ� if�� �ȿ� �Ǵٸ� if���� ���� �����̴�.
		// 2��, 3��, 4���� �Ǿ������� �츮�� �ʿ��� ��ŭ ��ø�ؼ� ��밡���ϴ�.
		
		System.out.println("�� ���� 2��: ���� �Է°��� ��ȿ���� üũ");
		if(score >= 0 && score <= 100) {
			// ����ڰ� �Է��� ������ �ùٸ� �����̹Ƿ�
			// ������ if-else if ������
			// ���ĺ� ������ ������ �� �ִ�.
			if(score>=90 ) {
				System.out.println("A");
			}else if(score >=80) {
				System.out.println("B");
			}else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else {
			// ����ڰ� �Է��� ������ �߸��� �����̹Ƿ�
			// ���޽��� ���
			System.out.println("�߸��� ���������Դϴ�.");
		}
		System.out.println("---------------------------");
	
		
		scanner.close();

	}

}
