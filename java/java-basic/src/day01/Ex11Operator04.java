package day01;
// ��������
// �������ڴ�
// boolean ���� ���� ������ �Ѵ�.
// &&: 2���� ��� true�̸� true
// ||: 2�� �� �ϳ��� true�̸� true
// !: true���� false�� �ٲٰ� false���� true�� �ٲ۴�.
public class Ex11Operator04 {

	public static void main(String[] args) {
		// && �����ڴ�
		// �ΰ��� ���� ��� true�϶��� ����� true�� ���´�.
		// ���� ���� ���� false�� ������ ���� ���� üũ�� ���Ѵ�.
		System.out.println("true && true: "+(true && true));
		System.out.println("true && false: "+(true && false));
		System.out.println("false && true: "+(false && true));
		System.out.println("false && false: "+(false && false));
		
		// || �����ڴ�
		// 2���� �� �� �ϳ��� true�̸� true�� ���´�.
		// ���� ���� ���� true�� ������ ���� ���� üũ�� ���Ѵ�.
		System.out.println("true || true: "+(true || true));
		System.out.println("true || false: "+(true || false));
		System.out.println("false || true: "+(false || true));
		System.out.println("false || false: "+(false || false));

	}

}
