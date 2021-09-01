package day01;
// �� ������
// �� �����ڴ� ������ ���Ұ� �������� ����
// ���Ѵ�.
// > >= < <= == !=
public class Ex10Operator03 {
	public static void main(String[] args) {
		// < ���� ���� ������ ������ ������ true �ƴϸ� false�� ���´�.
		System.out.println("3 < 5 : " + (3 < 5));
		System.out.println("5 < 3 : " + (5 < 3));
		System.out.println("3 < 5 : " + (3 < 3));
		
		// > ���� ���� ������ ������ ũ�� true �ƴϸ� false�� ���´�.
		System.out.println("3 > 5 : " + (3 > 5));
		System.out.println("5 > 3 : " + (5 > 3));
		System.out.println("3 > 5 : " + (3 > 3));

		// <= ���� ���� ������ ������ �۰ų� ������ true �ƴϸ� false�� ���´�.
		System.out.println("3 <= 5 : " + (3 <= 5));
		System.out.println("5 <= 3 : " + (5 <= 3));
		System.out.println("3 <= 5 : " + (3 <= 3));
		
		// >= ���� ���� ������ ������ ũ�ų� ������ true �ƴϸ� false�� ���´�.
		System.out.println("3 >= 5 : " + (3 >= 5));
		System.out.println("5 >= 3 : " + (5 >= 3));
		System.out.println("3 >= 5 : " + (3 >= 3));
		
		// == �� ���� ���� ������ ���� ������ true �ƴϸ� false�� ���´�.
		System.out.println("3 == 3 : " + (3 == 3));
		System.out.println("3 == 4 : " + (3 == 4));
		
		// != �� ���� ���� ������ ���� �ٸ��� true �ƴϸ� false�� ���´�.
		System.out.println("3 != 3 : " + (3 != 3));
		System.out.println("3 != 4 : " + (3 != 4));
		
		// �� �񱳿����� �� == �� != �� ������ ������ ���� ����� ���
		// ��Ȯ�� ���� ������ ���� ���� �ִ�.
		String myString1 = "abc";
		String myString2 = new String("abc");
		String myString3 = myString1;
		
		System.out.println("=========myString ���� Ȯ���ϱ�========");
		System.out.println("myString1�� ���簪: " + myString1);
		System.out.println("myString2�� ���簪: " + myString2);
		System.out.println("myString3�� ���簪: " + myString3);
		System.out.println("====================================");
		
		System.out.println("---�� �����ڸ� ����� ������ ������ ��---");
		System.out.println("myString1 == myString2: "+ (myString1 == myString2));
		System.out.println("myString1 == myString3: "+ (myString1 == myString3));
		System.out.println("myString2 == myString3: "+ (myString2 == myString3));
		System.out.println("-------------------------------------");
		
		// ������ ������ ���
		// �ش� �������� ���� ���� �ƴ�
		// ���� ���� ����ִ� ������ ���� �ּҰ��� ���� �ȴ�.
		
		// ������ �񱳿������� ��� �� �ּҰ��� �����Ͽ� ���� ���� Ȯ���ؼ�
		// ���ϴ� ���� �ƴ϶�
		// �ּҰ� ��ü�� ���ϰ� �ȴ�.
		
		// ���� ������ ������Ÿ�� ������ ���� ���� ������
		// �ش� ������ equals() ��� �޼ҵ带 ������Ѽ� ���ؾ��Ѵ�!
		System.out.println("====equals()�� ����� ��");
		System.out.println("myString1.equals(myString2): " + (myString1.equals(myString2)));
		System.out.println("myString1.equals(myString3): " + (myString1.equals(myString3)));
		System.out.println("myString2.equals(myString3): " + (myString2.equals(myString3)));
	}

}
