package day04;

public class Ex08Student01 {
	public static void main(String[] args) {
		// Student Ŭ���� ��ü�� �����ϰ� �ʱ�ȭ����
		Student s = new Student();
		// ��ü�� �ʵ峪 �޼ҵ带 ������ ������
		// . �����ڷ� ���ٰ����ϴ�.

		// ��ü �ʵ�� �ش� ��ü �ȿ� �츮�� ���� �����ϰų�
		// ����� ���� ȣ���� �� �ִ�.
		// �̶��� ����ó�� = ������ Ȥ�� �����̸��� �����ֵ�
		// "������" �ʵ����� �����ָ� �ȴ�.
		// �� ���� s ��ü�� id �� s.id �̷���

		s.setId(1);           //s.id = 1;
		s.setName("���翵");  //s.name = "���翵" 
		s.setKorean(80);      //s.korean = 80;
		s.setEnglish(81);     //s.english = 81;
		s.setMath(81);        //s.math = 81;

		System.out.printf("��ȣ: %03d�� �̸�: %s\n", s.getId(), s.getName());
		System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", s.getKorean(), s.getEnglish(), s.getMath());
		System.out.printf("����: %03d�� ���: %.2f��\n", s.calculateSum(), s.calculateAverage());

		Student s2 = new Student();

		System.out.printf("��ȣ: %03d�� �̸�: %s\n", s2.getId(), s2.getName());
		System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", s2.getKorean(), s2.getEnglish(), s2.getMath());

		s2.setId(3);          //s2.id = 3;
		s2.setKorean(40);     //s2.korean = 40;
		s2.setName("��ö��"); //s2.name = "��ö��";
		s2.setEnglish(30);    //s2.english = 30;
		s2.setMath(45);       //s2.math = 45;

		System.out.printf("����: %03d�� ���: %.2f��\n", s2.calculateSum(), s2.calculateAverage());

		System.out.println(s);
		System.out.println(s2);

		Student s3 = new Student(2, "������", 1, 1, 1);
		Student s4 = new Student(2, "������", 1, 1, 1);

		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);

		System.out.println("s3 == s4: " + (s3 == s4));

		System.out.println("s3.equals(s4): " + s3.equals(s4));
		
		
		
		

	}
}
