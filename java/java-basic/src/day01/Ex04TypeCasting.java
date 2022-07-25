package day01;
// ����ȯ(typecasting)
// ����ȯ�̶�, Ư�� ���� �ٸ� ������Ÿ������ ��ȯ�ϴ� ����
// ����ȯ�̶�� �Ѵ�.

// ����ȯ���� 2���� ������ �ִ�.
// 1. �Ͻ��� ����ȯ(implicit typecasting)
//	  �Ͻ��� ����ȯ�� �� ���� ������Ÿ���� ���� �� ū ������Ÿ������ �ٲ� �� �߻��Ѵ�.
//	  �츮�� Ư���� �ƹ��� ��ɾ �������� �ʾƵ�
//	  �ڵ����� ����ȯ�� �߻��ȴ�.

// 2. ����� ����ȯ(explicit typecasting)
//	  ����� ����ȯ�� �� ū ������Ÿ���� ���� �� ���� ������Ÿ������ �ٲ� �� �߻��Ѵ�.
//	  �ٲ� �� �տ� (�ٲ� ������Ÿ��)�� �����־���Ѵ�.

public class Ex04TypeCasting {
	public static void main(String[] args) {
		int myInt = 30;
		byte myByte = 20;
		System.out.println("myInt�� ���簪:" +  myInt);
		System.out.println("myByte�� ���簪:" +  myByte);
		
		// �Ͻ��� ����ȯ�� �غ���
		System.out.println("byte�� ���� int�� �ٲٴ� �Ͻ��� ����ȯ");
		myInt = myByte;
		System.out.println("myInt�� ���簪:" + myInt);
		System.out.println("myByte�� ���簪:" + myByte);
		
		// ����� ����ȯ�� �غ���
		System.out.println("int�� ���� byte�� �ٲٴ� �Ͻ��� ����ȯ");
		// �Ʒ��ڵ�� �� ���� ������Ÿ���� myByte��
		// �� ū ������Ÿ���� myInt�� ���� �������� �����Ƿ�
		// �����߻�
		// myByte = myInt;
		
		// ����� ����ȯ �ϴ� ���
		// ���� = (�ٲ� Ÿ��)��;
		myByte = (byte)myInt;
		System.out.println("myInt�� ���簪:" + myInt);
		System.out.println("myByte�� ���簪:" + myByte);
		
		// �� ����� ����ȯ�� �Ҷ� �Ѱ��� ������ ���� �ִ�.
		// ���� �⺻�� ������Ÿ�Կ� ���� ����� ����ȯ�� �� ��쿡��
		// ������ ����� ���װ� �߻��Ѵ�.
		
		// ���� ������ ������Ÿ�Կ� ���� ����� ����ȯ�� �� ��쿡��
		// ���� �Ұ����� ����ȯ�� ��� ������ ����.
		
		// �⺻�� ������Ÿ���� ���
		// �ִ밪�� �Ѿ ���� ����� ����ȯ�� �ϰ� �Ǹ�
		// overflow��� ���װ� �߻��Ѵ�.
		
		// byte�� �ִ밪: 127
		// �׷��ٸ� 128�� byte�� ������ ��� �ɱ�?
		myByte = (byte)127;
		System.out.println("overflow �߻� ���� byte�� ���簪:" + myByte);
		
		myByte = (byte)128;
		System.out.println("overflow �߻� ���� byte�� ���簪:" + myByte);
		
		myByte = (byte)129;
		System.out.println("overflow �߻� ���� byte�� ���簪:" + myByte);
		
		// �ּҰ��� �Ѿ ���� ����� ����ȯ�� �ϰ� �Ǹ�
		// underflow��� ���װ� �߻��Ѵ�.
	
		// byte�� �ּҰ�: -128
		myByte = -128;
		System.out.println("underflow �߻� ���� byte�� ���簪:" + myByte);
		myByte = (byte)-138;
		System.out.println("underflow �߻� ���� byte�� ���簪:" + myByte);
	
	}
}
