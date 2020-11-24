package day02;
// printf�� �پ��� ������ �˾ƺ���
public class Ex02Printf {

	public static void main(String[] args) {
		System.out.println("----1. 10���� ����----");
		// 1. 10���� ����('d'ecimal)
		int number = 157;
		// A. 10���� ������ �״�� ����϶�
		System.out.printf("1-A. %d\n", number);
		// B. 10���� ������ 5�ڸ� ������ �����ؼ� ����ض�
		System.out.printf("1-B. %5d\n", number);
		// ��, �ڸ��� ������ ���� ����� ������ �� ��ٸ�,
		// ���ð� �ȴ�.
		// C. 10���� ������ 2�ڸ� ������ �����ؼ� ����ض�
		System.out.printf("1-C. %2d\n", number);
		// D. 10���� ������ 5�ڸ� ���� �����ؼ� ����ض�
		System.out.printf("1-D. %-5d(��)\n", number);
		// E. 10���� ������ 5�ڸ� ������ �����ϰ�
		//	  ���� �� ������ 0���� ä���� ����ض�
		System.out.printf("1-E. %05d\n", number);
		System.out.println("--------------------");
		System.out.println("----2. 16���� ����----");
		// 2. 16���� ����(he'x'adecimal)
		// A. 16���� ������ �״�� ����ϵ� ���ĺ��� ���� ��� �ҹ��ڷ� ����ض�
		System.out.printf("2-A. %x\n", number);
		// B. 16���� ������ �״�� ����ϵ� ���ĺ��� ���� ��� �빮�ڷ� ����ض�
		System.out.printf("2-B. %X\n", number);
		// C. 16���� ������ ������ ������ 8�ڸ��� ����ϰ�
		//	  ���ĺ��� ���� ��� �빮�ڷ� ����ض�
		System.out.printf("2-C. %8X\n", number);
		// D. 16���� ������ ���� ������ 8�ڸ��� ����ϰ�
		//	  ���ĺ��� ���� ��� �ҹ��ڷ� ����ض�
		System.out.printf("2-D. %-8x(��)\n", number);
		// E. 16���� ������ ������ ������ 8�ڸ��� ����ϰ�
		//	  ���� ���ڸ��� 0���� ä��� ���ĺ��� ���� ��� �빮�ڷ� ����ض�
		System.out.printf("2-E. %08X\n", number);
		System.out.println("--------------------");
		System.out.println("-------3. �Ǽ�-------");
		// 3. �Ǽ�('f'loat)
		double myDouble = 123.4567;
		// A. �Ǽ��� �״�� ����ض�
		System.out.printf("3-A. %f\n", myDouble);
		// B. �Ǽ��� �� 10�ڸ� ������ �����ؼ� ����ض�
		System.out.printf("3-B. %15f\n", myDouble);
		// C. �Ǽ��� �Ҽ��� 2�ڸ����� ����ض�
		System.out.printf("3-C. %.2f\n", myDouble);
		// D. �Ǽ��� �� 10�ڸ� ������ �����ؼ� ����ϰ�
		//	  �Ҽ����� 3��°�ڸ����� ����ϰ� ���� �� ������ 0���� ä����
		System.out.printf("3-D. %010.3f\n", myDouble);
		// E. �Ǽ��� �� 10�ڸ� ���� �����ؼ� ����ϰ�
		//	  �Ҽ����� 2��°�ڸ����� ����ض�
		System.out.printf("3-E. %-10.2f(��)\n", myDouble);
		System.out.println("--------------------");
		System.out.println("------4. ���ڿ�------");
		// 4. ���ڿ�('S'tring)
		String myString= new String("abcDEFghi");
		// A. ���ڿ��� �״�� ����ض�
		System.out.printf("4-A. %s\n", myString);
		// B. ���ڿ��� �ҹ��ڰ� ������ �빮�ڷ� �ٲ㼭 ����ض�
		System.out.printf("4-A. %S\n", myString);
		System.out.println("--------------------");
		
		// printf�� ����� �� ��������.
		// 1. ��ȿ���� ���� %���ڰ� ���ð�� ������ �߻��Ѵ�.
		// System.out.printf("Error 01. %v\n", myString);
		// 2. %���ڿ� ����� ������ ������Ÿ���� �ٸ� ��� ������ �߻��Ѵ�.
		// System.out.printf("Error 02. %d\n", myDouble);
		// 3. %������ ������ ����� �������� ������ ������ ���� ������
		//	  %������ ������ �� ������ ������ ����.
		// System.out.printf("Error 03. %d %d %d\n", 1, 2, 3, 4);
		// System.out.printf("Error 03. %d %d %d\n", 1, 2);
		// int age = 13;
		// System.out.printf("����: %03��\n", age);
		
		// printf ���� ��쿡��
		// ��Ȳ�� ���缭 �پ��� %���ڸ� ��밡���ϴ�.
		System.out.printf("�̸�: %s ��ȣ: %d�� �������: %.2f��\n", "�̼���", 3, 3.141592);
	}

}
