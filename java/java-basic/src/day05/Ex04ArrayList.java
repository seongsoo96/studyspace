package day05;

import java.util.ArrayList;

import day04.Student;

// ArrayList
// �迭�� Ŭ������ �����ó��
// �츮�� ��Ҹ� �߰��ϸ�
// index�� �ڵ����� �����ǰ�
// ���� ũ�⵵ �����Ǿ����� �ʾƼ�
// �츮�� �߰��ϸ� ũ�Ⱑ �����ϰ�
// �����ϸ� ũ�Ⱑ �����Ѵ�.

public class Ex04ArrayList {
	public static void main(String[] args) {
		// �迭�� �츮��
		// ������Ÿ��[] �� � ������Ÿ���� �迭���� �����ߴٸ�
		// ArrayList��
		// <> �ȿ� � ������Ÿ���� �������� �����ְ� �ȴ�.
		// ��, <> �ȿ��� ���� Ŭ������ ���� �� �ִ�.
		// Q: �׷� �⺻�� ������Ÿ�� 8�����¿�?
		// A: �� �����ɴϴ�.
		// Q: �׷� ������ ��Ƴ��� ArrayList�� �ʿ��ϸ��?
		// A: �׶��� �������� �ڹٰ� �⺻�� ������Ÿ�Ե��� Ŭ������ �ٲ��
		// ���� Ŭ����(wrapper class)�� �����ָ� �˴ϴ�.
		// ���� ��� int �� ���, Integer ��� Ŭ������
		// int�� ���� Ŭ������ �˴ϴ�.

		ArrayList<Student> list = new ArrayList<>();

		// 1. ArrayList�� ����ִ��� üũ�ϰ� �ʹٸ�
		// isEmpty() �޼ҵ带 ȣ���ϸ� �ȴ�.
		System.out.println("----------------------");
		System.out.println("1. isEmpty()");
		System.out.println("list.isEmpty(): " + list.isEmpty());
		System.out.println("----------------------");
		
		// 2. ArrayList�� ���� ũ�Ⱑ �˰� �ʹٸ�
		// size() �޼ҵ带 ȣ���ϸ� �ȴ�.
		System.out.println("2. size()");
		System.out.println("list.size(): " + list.size());
		System.out.println("----------------------");
		
		//����Ʈ�� �߰��� ��ü + @ �� ������
		Student s1 = new Student(1, "1", 1, 1, 1);
		Student s2 = new Student(2, "2", 2, 2, 2);
		Student s3 = new Student(3, "3", 3, 3, 3);
		Student s4 = new Student(4, "4", 4, 4, 4);
		Student s5 = new Student(5, "5", 5, 5, 5);
		Student s6 = new Student(6, "6", 6, 6, 6);
		Student s7 = new Student(7, "7", 7, 7, 7);
		
		//3. ArrayList�� ���ο� ��Ҹ� �߰��� ������
		//   add(���) �޼ҵ带 �����ϸ� �ȴ�.
		System.out.println("3. add()");
		list.add(s1);
		System.out.println("add() �� list.size(): " + list.size());
		list.add(s2);
		System.out.println("add() �� list.size(): " + list.size());
		list.add(s3);
		System.out.println("add() �� list.size(): " + list.size());
		list.add(s4);
		System.out.println("add() �� list.size(): " + list.size());
		list.add(s5);
		System.out.println("add() �� list.size(): " + list.size());
		System.out.println("----------------------");
		
		// 4. ArrayList���� Ư�� �ε����� �ִ� 
		// ��Ҹ� ȣ���� ������
		// get(index) �޼ҵ带 ������ �ش�.
		System.out.println("4. get(index)");
		System.out.println("list.get(0): "+list.get(0));
		System.out.println("----------------------");
		// �� �迭�� ����������, �Ұ����� index�� get�� �Ķ���ͷ�
		// �ѱ�� IndexOutOfBoundsException�� �߻��Ѵ�.
		// System.out.println(list.get(-1));
		// System.out.println(list.get(10));
		
		// 5. ArrayList�� Ư�� ��ġ�� ���ο� ��Ҹ� �߰��ش޶�� �Ҷ�����
		// add(index, ���) �� �����ϸ� �ȴ�.
		// �ش� ��ġ�� ���� �ִ� ��Ҵ�
		// ��ĭ�� �ڷ� �и��� �ȴ�.
		// ���� ���
		// ����� 6�� ����Ʈ�� 
		// 2�� �ε����� ���ο� ��Ҹ� �߰��ϸ�
		// ���� 2�� �ε����� �ִ� ��Ҵ� 3������
		// 3���� 4��, 4���� 5��, 5���� 6������
		// �з����� �ȴ�.
		System.out.println("5. add(index, element)");
		System.out.println("add �� list.get(0): "+list.get(0));
		list.add(0, s6);
		System.out.println("add �� list.get(0): "+list.get(0));
		System.out.println("----------------------");
		
		// 6. ���� Ư�� ��ġ�� ��ҿ� 
		// ���ο� ��Ҹ� �ٲ��ٷ���
		// set(�ε���, ���) �޼ҵ带 �����ϸ� �ȴ�.
		// set�� ���, ����� �ش� ��ġ�� �ִ� ��Ҵ� ���� ������
		// ���ο� ��Ұ� �ش� �ε����� ���� �ȴ�.
		// ���� set �޼ҵ��� ��� ���� Ÿ���� < >�� Ŭ�����̱� ������
		// ���� ���� ��Ҹ� �ٸ� ���� ������ ���� �ִ�.
		System.out.println("6. set(index, element)");
		System.out.println("set �� list.get(0): "+list.get(0));
		Student temp = list.set(0, s7);
		System.out.println("set �� list.get(0): "+list.get(0));
		System.out.println("temp: "+temp);
		System.out.println("----------------------");
		
		// 7. ArrayList���� 
		// Ư�� index�� ��Ҹ� ������ ������
		// remove(indeX) �޼ҵ带 �����ϸ� �ȴ�.
		// �����Ŀ��� ũ�Ⱑ 1 �پ���.
		System.out.println("7. list.remove(index)");
		System.out.println("remove �� size(): "+list.size());
		System.out.println("remove �� get(3): "+list.get(3));
		list.remove(3);
		System.out.println("remove �� size(): "+list.size());
		System.out.println("remove �� get(3): "+list.get(3));
		System.out.println("----------------------");
		
		// ���⼭ ���� �Ʒ��� ������ �޼ҵ����
		// < >�� ������ Ŭ������
		// equals() �޼ҵ尡 ��Ȯ�ϰ� �����Ǿ��
		// ���������� ����Ǵ� �޼ҵ���̴�.
		// ArrayList �� �Ʒ��� �޼ҵ���� ���ο���
		// equals() �޼ҵ带 Ȱ���ϱ� �����̴�.
		
		// s44�� ��� list�� �߰������� ������
		// s4�� equals()�� true�� ������ ��ü�̴�.
		Student s44 = new Student(4, "4", 4, 4, 4);
		
		// 8. ��ü�� �ش� list�� �����ϴ��� üũ�ϰ� �ʹٸ�
		//    contains(��ü) �޼ҵ带 �����ϸ� �ȴ�.
		//    �̶��� ���� �Ȱ��� ��ü�� �ƴϴ���
		//    �ش� ��ü�� equals()�� true�� ������ ��ü�� 
		//    ����Ʈ�� �����Ѵٸ�
		//    true�� ���´�.
		System.out.println("8. contains(elements)");
		// �츮�� list���� s3�� remove(index)�� ���������Ƿ�
		// �������� �ʴ°� Ȯ��
		// list�� �߰��ߴ� s2�� ���
		System.out.println("list.contains(s2): "+list.contains(s2));
		// list���� �����Ͽ� ���̻� �������� �ʴ� s3�� ���
		System.out.println("list.contains(s3): "+list.contains(s3));
		// list�� �߰������� ������ equals()�� true�� ������ ��ü�� �����ϴ�
		// s44�� ���
		System.out.println("list.contains(s44): "+list.contains(s44));
		System.out.println("----------------------");
		
		// 9. Ư�� ��ü�� �տ������� �������� index�� �ñ��ϴٸ�
		//    indexOf(��ü) �� �����ϸ� �ȴ�.
		//    �� �ش� ��ü�� �������� ���� ���
		//    -1�� ���ϵȴ�.
		
		System.out.println("9. indexOf(element)");
		// list�� �߰��ߴ� s2�� ���
		System.out.println("list.indexOf(s2): "+list.indexOf(s2));
		// list���� �����Ͽ� ���̻� �������� �ʴ� s3�� ���
		System.out.println("list.indexOf(s3): "+list.indexOf(s3));
		// list�� �߰������� ������ equals()�� true�� ������ ��ü�� �����ϴ�
		// s44�� ���
		System.out.println("list.indexOf(s44): "+list.indexOf(s44));
		System.out.println("----------------------");
		
		// 10. ���� �ڿ������� �������� �ش� ��ü�� 
		//     ��� index�� �����ϴ��� �˷���
		//     lastIndexOf(��ü)�� �����ϸ� �ȴ�.
		//     indexOf()�� ����������
		//     �������� �ʴ� ��ü�� ���ؼ��� -1�� ���ϵȴ�.
		
		list.add(s2);
		
		System.out.println("10. lastIndexOf(element)");
		// list�� �߰��ߴ� s2�� ���
		System.out.println("list.lastIndexOf(s2): "+list.lastIndexOf(s2));
		// list���� �����Ͽ� ���̻� �������� �ʴ� s3�� ���
		System.out.println("list.lastIndexOf(s3): "+list.lastIndexOf(s3));
		// list�� �߰������� ������ equals()�� true�� ������ ��ü�� �����ϴ�
		// s44�� ���
		System.out.println("list.lastIndexOf(s44): "+list.lastIndexOf(s44));
		System.out.println("----------------------");
		
		// 11. ArrayList���� ������ �Ҷ�
		//     index�� �𸣰� ��� ��ü�� ���� ���
		//     remove(��ü) �޼ҵ带 �����ϸ� �ȴ�.
		//     equals()�� true�� ������ ��� ��
		//     ���� index�� ���� �ϳ��� �����Ѵ�.
		//     ���� equals()�� true�� ������ ��Ұ� ���ٸ�
		//     �ƹ��͵� �������� �ʴ´�.
		System.out.println("11. remove(element)");
		
		// ����Ʈ�� �߰��Ǿ��� s7�� ���
		System.out.println("������ list.contains(s7): "+list.contains(s7));
		list.remove(s7);
		System.out.println("������ list.contains(s7): "+list.contains(s7));
		
		// ����Ʈ�� �������� �ʴ� s3�� ���
		System.out.println("������ list.contains(s3): "+list.contains(s3));
		list.remove(s3);
		System.out.println("������ list.contains(s3): "+list.contains(s3));
		
		// ����Ʈ�� �߰��� ���� ������ equals()�� true�� ������ ��Ұ� �����ϴ�
		// s44�� ���
		System.out.println("������ list.contains(s44): "+list.contains(s44));
		list.remove(s44);
		System.out.println("������ list.contains(s44): "+list.contains(s44));
		
	}
}










