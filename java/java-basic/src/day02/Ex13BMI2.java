package day02;
// ����ڷκ��� Ű�� �����Ը� �Է¹޾�
// ��ü�� ����ü�� ��ü�� �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
// �� ����ڰ� �߸��� Ű(.2�̸� or 2.5 �̻�)�� �Է��ϸ� "�߸� �Է��ϼż� �����մϴ�."
// ��µǰ�
// �ùٸ� Ű�� �Է��ϴ��� �߸��� ������(3�̸� or 200�̻�)�� �Է��ϸ�
// �߸� �Է��ϼż� �����մϴ�. �� ��µǰ� ���α׷��� �ۼ��Ͻÿ�

// �� Ű �Է� -> ������ �Է� -> ��� ��� �� ��������
// Ű�� �߸����� ��� �޽��� ��� �� ���α׷� ����
// �����԰� �߸����� ��� �޽��� ��� �� ���α׷� ����
// �� �� �� �ֵ��� ���α׷��� �����Ͻÿ�

// BMI 18.5 �̸�: ��ü��
//18.5~24.9: ����ü��
//25~29.9: ��ü��
//30~34.9: ��
//35�̻�: ����
import java.util.Scanner;
public class Ex13BMI2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ű(m����): ");
		double height = scanner.nextDouble();
		if (height<.2 || height>=2.5) {
			// �ùٸ��� ���� Ű�̹Ƿ� ���޽��� ��� �� ����
			System.out.println("�߸� �Է��ϼż� �����մϴ�.");
		} else {
			// �ùٸ� Ű�� �Էµ����Ƿ� �����Ը� �Է¹޴´�.
			System.out.print("������(kg����): ");
			double weight = scanner.nextDouble();
			if(weight < 3 || weight >= 200) {
				// �ùٸ��� ���� �������̹Ƿ� ���޽��� ��� �� ����
				System.out.println("�߸� �Է��ϼż� �����մϴ�.");
			} else {
				// �ùٸ� Ű�� �����԰� �Էµ����Ƿ� BMI ��� �� ��� ���
				double bmi = weight / height / height;
				
				System.out.printf("BMI: %.2f\n", bmi);
				
				if(bmi < 18.5) {
					System.out.println("��ü��");
				}else if ( bmi<25) {
					System.out.println("����ü��");
				}else if(bmi < 30) {
					System.out.println("��ü��");
				}else if(bmi < 35 ) {
					System.out.println("��");
				}else {
					System.out.println("����");
				}
			}
		}
		
		
		scanner.close();
	}

}
