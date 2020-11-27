package day04;

public class Student {
	// �ʵ�
	int id;
	String name;
	int korean;
	int english;
	int math;

	// �޼ҵ�
	// 1. �л��� ������ ����ϴ� �޼ҵ�
	int calculateSum() {
		int sum = korean + english + math;
		return sum;
	}

	// 2. �л��� ����� ����ϴ� �޼ҵ�
	double calculateAverage() {
		double average = calculateSum() / 3.0;
		return average;
	}

	// 3. ������
	public Student() {
		id = -1;
		name = "���� �Է� �ȵ�";
		korean = -1;
		english = -1;
		math = -1;
	}

	public Student(int id, String name, int korean, int english, int math) {
		this.id = id;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public String toString() {
		return "��ȣ: " + id + "��" + ", �̸�: " + name + ", ����: " + korean + "��" + ", ����: " + english + "��" + ", ����: "
				+ math + "��";

	}

	public boolean equals(Object o) {
		// equals()�޼ҵ忡 �Ķ���Ͱ� Object Ÿ���̹Ƿ�
		// �������̶�� ���� ������ ��� Ŭ������ ��ü�� �Ķ���ͷ� ���� �� �ִ�.
		// �ٸ� �Ķ���ͷ� �Ѿ�� ��ü�� ���� Ŭ���� ��ü�� ������
		// �ʵ� �񱳿� ���� �� �ܴ� �ƹ��͵� ���� �ʴ´�.
		// �ش� ��ü�� � Ŭ������ ��ü�� �´�����
		// instanceOf ��� Ű���尡 Ȯ�����ش�.
		if (o instanceof Student) {
			// �񱳸� ���ؼ� �ӽ÷� ��
			// Student ��ü�� �����
			// �ش� ��ü�� �ʱ�ȭ��
			// o�� �ϵ�, o�� Object Ŭ���� ��ü�̹Ƿ�
			// ����� ����ȯ�� �ؼ�
			// Student ��ü�� �ʱ�ȭ���ش�.
			Student s = (Student) o;
			// ����ȯ�� o�� �ʱ�ȭ��
			// s�� �� �޼ҵ带 �����ϴ�
			// ��ü�� �ʵ� ������ �����ش�.
			// ��� �ʵ带 �� �����־ �ǰ�
			// �ƴϸ� �߿��� �ʵ�鸸 �����־ �ȴ�.
			// ������ �й��� �̸��� ���Ͽ�
			// 2���� ��ġ�ϸ� ���� ��ü�ΰɷ�
			// ����������
			if (id == s.id && name.equals(s.name)) {
				return true;
			}
		}

		return false;
	}
}
