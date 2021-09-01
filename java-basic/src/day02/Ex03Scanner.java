package day02;

// Scanner
// Scanner�� �ڹٰ� �⺻������ �������ִ� Ŭ�����μ�
// �پ��� �Է��� ����Ѵ�.
// ��, Scanner�� �츮 ��Ű�� �ȿ� �������� �����Ƿ�
// import ��� ��ɾ ���ؼ�
// ��� �ִ� Scanner Ŭ������ ������ ������ �������־�� �Ѵ�.
import java.util.Scanner;

public class Ex03Scanner {

	public static void main(String[] args) {
		// Scanner�� ������ ������Ÿ���̹Ƿ�
		// �Ʒ��� ���� ������� ������ ������ش�.
		Scanner scanner = new Scanner(System.in);
		
		int number;

		// ��ĳ�ʸ� ����Ͽ� ������ �Է¹��� ������
		// nextInt() �޼ҵ带 ȣ���ϸ� �ȴ�.
		System.out.print("����: ");
		number = scanner.nextInt();
		System.out.println("����ڰ� �Է��� ����: " + number);

		// ��ĳ�ʸ� ����Ͽ� �Ǽ��� �Է¹��� ������
		// nextDouble() �޼ҵ带 ȣ���ϸ� �ȴ�.
		System.out.print("�Ǽ�: ");
		double myDouble = scanner.nextDouble();
		System.out.println("����ڰ� �Է��� �Ǽ�: " + myDouble);

		// ��ĳ�ʸ� ����Ͽ� ��Ʈ���� �Է¹��� ������
		// nextLine() �޼ҵ带 ȣ���ϸ� �ȴ�.

		// nextLine() �޼ҵ带 ����� �� �Ѱ��� ������ ���� �ִµ�
		// nextInt(), nextDouble() ����
		// ���ڸ� �Է��ϴ� �޼ҵ带 ȣ���� �Ŀ���
		// �츮�� ���ڸ� �Է��ϸ鼭 �Է��� �����ٸ� �˷��ִ� ����Ű��
		// ���۸޸𸮿� �״�� �����ִ�.
		// ���� ���� �Է� �Ŀ� nextLine()�� ����ϸ�
		// ��ĳ�ʴ� "����ڰ� �ƹ��� �Է¾��� �Է��� ������ױ���!" ���
		// �����ϰ� �ȴ�.
		// ���� ���۸޸𸮸� �ѹ� ����־��
		// ���������� ���� �Է� �Ŀ� ��Ʈ�� �Է��� �����ϴ�.
		// ���۸޸𸮸� ����ֱ� ���ؼ��� �Ʒ��� ������ �����Ű�� �ȴ�.
		scanner.nextLine();
		
		// ������ ���۸޸𸮰� �ƹ��͵� ���� ���,
		// �� scanner.nextLine()�� ����� ���ĳ�
		// ���� �Է��� �ޱ� ���̶��
		// ���۸޸𸮸� ����� �ʿ䰡 ����
		// ������ scanner.nextLine()�� �����ָ�
		// �츮�� �߰������� ���� �Է��� �ؾ��Ѵ�.

		System.out.print("�̸�: ");
		String name = scanner.nextLine();
		System.out.println("����ڰ� �Է��� �̸�: " + name);

		// ��ĳ�� ������ ����
		// �ܺ� '�޸�'�� �����ϴ� ������
		// �׻� ���α׷� ���� �������ٿ�
		// close() �޼ҵ带 ȣ�����ָ� ����.
		scanner.close();

	}

}
