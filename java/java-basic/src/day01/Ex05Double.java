package day01;
// �ڹٿ����� �Ǽ���
// double Ȥ�� float ������Ÿ���� ����Ѵ�.
// ������ �츮�� �ڵ忡�� �Ǽ��� �Է��ϸ�
// �ڹٴ� double�� �ν��ϱ� ������
// float�� ���� ���� ������
// ����� ����ȯ�� �ϰų�
// �ƴϸ� �Ǽ��� �� �ڿ� f�� �ٿ��� �Ǽ��� ���� ��Ÿ����� �Ѵ�.
public class Ex05Double {
	public static void main(String[] args) {
		double myDouble = 3.141592;
		System.out.println("myDouble�� ���簪:" + myDouble);
		
		// �Ʒ� �ڵ�� double ���� 3.141592�� �� ���� ������Ÿ����
		// float�� �Ҵ��Ϸ��� �߱� ������ �����߻�
		//float myFloat = 3.141592;
		
		// ���� float�� ����ϴ� ��쿡��
		// 2���� ����� �����ѵ�
		// 1. ����� ����ȯ
		float myFloat = (float)3.141592;
		
		// 2. �Ǽ����� float �������� ���
		myFloat = 3.141592f;
		
		System.out.println("myFloat�� ���簪:" + myFloat);
	}
}
