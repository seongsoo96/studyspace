package day02;
// ���ǹ� 04: switch
// switch ���ǹ���
// ���ǽ��� �ƴ϶�
// �ϳ��� ������ �����ؼ�
// �� ������ ���鿡 ����
// ���� �ڵ带 �츮�� �����ϰ� �ȴ�.

// switch�� ������ ���� ������ ������.
// switch(����) {
//	  case ��:
//		  ������ �ڵ�;
//		  break;
//	  case ��:
//		  ������ �ڵ�;
//		  break;
//	  case ��:
//		  ������ �ڵ�;
//		  break;
//	  case ��:
//		  ������ �ڵ�;
//		  break;
// }
public class Ex14Switch01 {

	public static void main(String[] args) {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		default:
			System.out.println("�׿��Դϴ�.");
			break;
		}

	}
}
