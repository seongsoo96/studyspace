package day01;
// ������ �⺻��Ÿ��
// char
// char�� character�� ���Ӹ��ν�
// ASCII ���̺��̶�� Ư���� ǥ�� ����Ͽ�
// ���ڸ� ��Ÿ����.

// char�� �ѹ��� �� ���ڸ� ������ �� �ִ�.

public class Ex06Character {
	public static void main(String[] args) {
		//char�� ���� �������� 2���� ����� �����ϴ�
		//1. ���� ���ڸ� ''���� ���μ� �ִ� ���
		char myChar = 'a';
		System.out.println("myChar�� ���簪:" + myChar);
		
		//2. �ڵ尪�� �ִ� ���
		myChar = 66;
		System.out.println("myChar�� ���簪:" + myChar);
		
		// char�� ����:
		// �ѹ��� �� ���ڸ� ��밡���ϴ�.
		// ���� ���� ���ڸ� �ٷ��� �� ������
		// String Ŭ���� ������ ����ؾ� �Ѵ�.
		
		// String�� ���� ���� ������
		// ""�� ������ ���ڵ��� �־��ָ� �ȴ�.
		String myString = new String();
		myString = "abcdefg";
		System.out.println("myString�� ���簪:" + myString);
	}
	
	
}
