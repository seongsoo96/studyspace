package day03;
// 1���� 100������ �Ҽ��� ���ϴ� ���α׷�

// 1. �Ҽ��� �����ΰ�
//	  ����� 1�� �ڱ��ڽŹۿ� ���� ����
//	  ����: 2, 3, 5, 7 ...
//	  = �� �Ҽ��� ����� 2���� ����

// 2. ����� �����ΰ�?
//	  a�� b�� ���������� ������ ��������
//	  b�� a�� ����̴�.
//	  ����: 4�� ����� 1, 2, 4�̴�.
//	  = a�� b�� ���������� �������� 0�̸�
//		b�� a�� ����̴�.

// 3. � ������ ���� ū ����� ���ΰ�?
//	  �ڱ��ڽ�.

// �츮�� �� 3���� ������ �̿��ؼ�
// 1~100������ �Ҽ��� ����ϴ� ���α׷��� �ۼ��ϰ� �ȴ�.

// i for���� i�� �ش� ���ڰ� �Ҽ����� �ƴ����� �˻��� ���ڰ� �ȴ�.
// j for���� j�� �ش� ���ڰ� i�� ������� �ƴ����� �˻��� ���ڰ� �ȴ�.

public class Ex05PrimeNumber {
	public static void main(String[] args) {
		// 1~100�� �Ҽ��� ���ؾ��ϰ�
		// i�� �Ҽ����� �ƴ����� �˻��� �����̹Ƿ�
		// i�� 1�� �ʱ�ȭ�ϰ� 100���� �۰ų� ��������
		// �ڵ������ �ݺ��ϰ� ������ i++ �ؼ�
		// ������ üũ �� true�� ������
		// �ٽ� �ڵ������ �����Ѵ�.
		for(int i=1; i<=100; i++) {
			// ����� ������ ������ ���� count�� ���������
			int count = 0;
			
			// j for����
			// j�� i�� ������� �ƴ����� �˻��ؾ��ϹǷ�
			// j = 1�� �ʱ�ȭ�ϰ�
			// j<=i�� ����
			// j % i �� 0���� üũ�Ͽ�
			// 0�̸� count�� 1 ������Ű�� �ȴ�.
			for(int j = 1; j <=i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			
			// ����� ������ 2���̸�
			// i�� �Ҽ��̹Ƿ� ������ش�.
			if(count == 2) {
				System.out.println(i + "�� �Ҽ��Դϴ�.");
			}
			 
		}

	}

}