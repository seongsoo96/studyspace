package day04;
// ���ѷ����� ����Ͽ�
// ���ȭ���� ����
// ����ڰ� �ʿ��� ����� ������ �� �ְ� ������
import java.util.Scanner;
public class Ex05Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1. �Է� 2. ��� 3. ����");
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				// �Է��ϴ� �ڵ带 �����ش�.
			}else if(userChoice == 2) {
				// ����ϴ� �ڵ带 �����ش�.
			}else if(userChoice == 3) {
				// �޽��� ����� ����
				// switch ó��
				// �ݺ����� �����ų��
				// break�� ����ϸ� �ȴ�.
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		
		
		scanner.close();
	}
}






