package day03;
// �ǵ������� break�� �����Ͽ� �ڵ带 �����ϰ� ������

// ����ڰ� ���� �Է��ϸ� �ش� ���� ������ ��¥�� �˷��ִ� ���α׷�
import java.util.Scanner;
public class Ex01Switch02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��: ");
		int month = scanner.nextInt();
		switch(month) {
		case 2:
			System.out.println("28�ϱ����Դϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�ϱ����Դϴ�.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31�ϱ����Դϴ�.");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
		
		scanner.close();
	}
	
}
