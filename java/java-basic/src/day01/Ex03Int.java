package day01;
// ������ ������Ÿ��
// ������ ������Ÿ���� ��쿡��
// ���� 2�������� ���ϤǤ��Ͽ�
// �� ���� �����ϰ�

// byte: 8��Ʈ
// short: 16��Ʈ
// int: 32��Ʈ
// long: 64��Ʈ

// ��Ʈ��?
// 2���� �ڸ��� 1���� ���Ѵ�.

// byte�� ����: -2�� 7�� ~ 2�� 7�� -1 (�� 2�� 8�°��� ����)
// short�� ����: -2�� 15�� ~ 2�� 15�� -1 (�� 2�� 16�°��� ����)
// int�� ����: -2�� 31�� ~ 2�� 31�� -1 (�� 2�� 32�°��� ����)
// long�� ����: -2�� 63�� ~ 2�� 63�� -1 (�� 2�� 64�°��� ����)

// �ڹٿ����� �츮�� ������ ���� �ڵ忡 ������
// �ڵ����� int�� �ν��Ѵ�.

// ����ó�� ��ǻ���� ���ҽ��� �ſ� ���
// �����ϰ� ���ҽ� ������ �ؾ��ϴ� ��������
// �̸� ������ �ش� ������ �ּ� �ִ밪�� ����ؼ�
// ��Ȯ�ϰ� ������Ÿ���� �����ϴ� ���� �ſ� �߿�������
// ������ ��ǻ���� ���ҽ��� �ſ� �����ӱ� ������
// �����е��� ���� ������ ������ ���(+-20��) int�� ����ϰ�
// ���� Ŀ�ٶ� ������ ��쿡�� long�� ����ϸ� �ȴ�!

public class Ex03Int {
	public static void main(String[] args) {
		byte myByte = 10;
		System.out.println("myByte�� ���簪:" + myByte);
		myByte = 100;
		System.out.println("myByte�� ���簪:" + myByte);
		//byte�� ���
		//-128 ~ 127������ �����̴�.
		//�׷��ٸ� �ش� ������ �Ѿ�� ���� �Ҵ��ϸ� ��� �ɱ�?
		//myByte = 1000;
		//�����߻�
		
	}
}