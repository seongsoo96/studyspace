package day02;
// ���ǹ� 03: if-else if ����
// if-else if ����������
// �츮�� ���ǽ��� �������� �־
// ���� ���� true�� ������ �ϳ��� �ڵ� ����� ������ �ϰ� �ȴ�.
// ���� ���� �������� else�� �����ٸ�
// ���� ������ ��� false�϶� �ش� else �ڵ����� ����ǰ� �ȴ�.

// else if �� ���
// if�� �ٱ� ������ �ݵ�� ���ǹ��� ()�� ��ܼ� ���� �Ѿ�;��Ѵ�.

// if-else if�� ������ ���� ������ ������.
// if(���ǽ�1) {
//
// } else if (����2) {
//
// }...
// } else {
// }
public class Ex09IfElseIf {
	public static void main(String[] args) {
		int age = 5;
		if(age <= 5 ) {
			System.out.println("�����Դϴ�.");
		} else if (age <= 13) {
			System.out.println("����Դϴ�.");
		}else if(age < 18) {
			System.out.println("û�ҳ��Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
	}
}
