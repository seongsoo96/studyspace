package day02;
// �ڹ� �ֿܼ� ����ϴ� 3���� ���
// �ڹ� �ֿܼ� ����ϴ� ����
// System.out ����
// print(), println(), printf() 3���� �޼ҵ尡 ����Ѵ�.

// print(): ()���� ������ ����ϰ�, �� ���� �����ġ�� �ٷ� ������ ĭ�� �ȴ�.
// println(): print a line�� ���Ӹ��ν� ()�� ������ ����ϰ�, �� ���� 
//            �����ġ�� ���� ���� ùĭ�� �ȴ�.
// printf() : print in format�� ���Ӹ��ν� ()�� ������ "���Ŀ�" ���߾� ����ϰ�
//			  �� ���� �����ġ�� �ٷ� ������ ĭ�� �ȴ�.

// ���鹮��
// ���鹮�ڶ� �ܼ��� �����̽� ���� �ƴ϶�
// �� ����, ���� ���� ���� ������ ���ϴ� �����̴�.
// �ַ� \+���ĺ����� �̷������.
// �� ������ �����̽� 4ĭ ũ��ν� \t�� ���� �ǰ����� ����.
// ���� ���ڴ� ���� �����ġ�� ���� �ٷ� �ٲٴµ� \n�� ���� �ȴ�.

public class Ex01Print {

	public static void main(String[] args) {
		// 1.print()
		String myString = new String("abcDEF");
		System.out.print(myString);
		System.out.print(myString);
		// 2.println()
		System.out.println(myString);
		System.out.println(myString);
		// 3.printf()
		System.out.printf("%s", myString);
		System.out.printf("%s", myString);
		
		System.out.println();
		//���� System.out.println()�� System.out.print("\n")��
		//�Ȱ��� �ǹ��̴�.
		
		// �� ����
		System.out.println("abc\tDEF");
		// ���� ����
		System.out.println("abc\nDEF");
	}

}
