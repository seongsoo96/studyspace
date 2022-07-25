package day05;

import java.util.ArrayList;

import day04.Student;

// ArrayList
// 배열을 클래스로 만든것처럼
// 우리가 요소를 추가하면
// index가 자동으로 생성되고
// 또한 크기도 고정되어있지 않아서
// 우리가 추가하면 크기가 증가하고
// 제거하면 크기가 감소한다.

public class Ex04ArrayList {
	public static void main(String[] args) {
		// 배열은 우리가
		// 데이터타입[] 로 어떤 데이터타입의 배열인지 지정했다면
		// ArrayList는
		// <> 안에 어떤 데이터타입의 모음인지 정해주게 된다.
		// 단, <> 안에는 오직 클래스만 들어올 수 있다.
		// Q: 그럼 기본형 데이터타입 8가지는요?
		// A: 네 못들어옵니다.
		// Q: 그럼 정수를 모아놓는 ArrayList가 필요하면요?
		// A: 그때는 다행히도 자바가 기본형 데이터타입들을 클래스로 바꿔둔
		// 포장 클래스(wrapper class)를 적어주면 됩니다.
		// 예를 들어 int 의 경우, Integer 라는 클래스가
		// int의 포장 클래스가 됩니다.

		ArrayList<Student> list = new ArrayList<>();

		// 1. ArrayList가 비어있는지 체크하고 싶다면
		// isEmpty() 메소드를 호출하면 된다.
		System.out.println("----------------------");
		System.out.println("1. isEmpty()");
		System.out.println("list.isEmpty(): " + list.isEmpty());
		System.out.println("----------------------");
		
		// 2. ArrayList에 현재 크기가 알고 싶다면
		// size() 메소드를 호출하면 된다.
		System.out.println("2. size()");
		System.out.println("list.size(): " + list.size());
		System.out.println("----------------------");
		
		//리스트에 추가할 객체 + @ 를 만들어보자
		Student s1 = new Student(1, "1", 1, 1, 1);
		Student s2 = new Student(2, "2", 2, 2, 2);
		Student s3 = new Student(3, "3", 3, 3, 3);
		Student s4 = new Student(4, "4", 4, 4, 4);
		Student s5 = new Student(5, "5", 5, 5, 5);
		Student s6 = new Student(6, "6", 6, 6, 6);
		Student s7 = new Student(7, "7", 7, 7, 7);
		
		//3. ArrayList에 새로운 요소를 추가할 때에는
		//   add(요소) 메소드를 실행하면 된다.
		System.out.println("3. add()");
		list.add(s1);
		System.out.println("add() 후 list.size(): " + list.size());
		list.add(s2);
		System.out.println("add() 후 list.size(): " + list.size());
		list.add(s3);
		System.out.println("add() 후 list.size(): " + list.size());
		list.add(s4);
		System.out.println("add() 후 list.size(): " + list.size());
		list.add(s5);
		System.out.println("add() 후 list.size(): " + list.size());
		System.out.println("----------------------");
		
		// 4. ArrayList에서 특정 인덱스에 있는 
		// 요소를 호출할 때에는
		// get(index) 메소드를 실행해 준다.
		System.out.println("4. get(index)");
		System.out.println("list.get(0): "+list.get(0));
		System.out.println("----------------------");
		// 단 배열과 마찬가지로, 불가능한 index를 get의 파라미터로
		// 넘기면 IndexOutOfBoundsException이 발생한다.
		// System.out.println(list.get(-1));
		// System.out.println(list.get(10));
		
		// 5. ArrayList에 특정 위치에 새로운 요소를 추가해달라고 할때에는
		// add(index, 요소) 를 실행하면 된다.
		// 해당 위치에 원래 있던 요소는
		// 한칸씩 뒤로 밀리게 된다.
		// 예를 들어
		// 사이즈가 6인 리스트에 
		// 2번 인덱스에 새로운 요소를 추가하면
		// 기존 2번 인덱스에 있던 요소는 3번으로
		// 3번은 4번, 4번은 5번, 5번은 6번으로
		// 밀려나게 된다.
		System.out.println("5. add(index, element)");
		System.out.println("add 전 list.get(0): "+list.get(0));
		list.add(0, s6);
		System.out.println("add 후 list.get(0): "+list.get(0));
		System.out.println("----------------------");
		
		// 6. 만약 특정 위치에 요소와 
		// 새로운 요소를 바꿔줄려면
		// set(인덱스, 요소) 메소드를 실행하면 된다.
		// set의 경우, 실행시 해당 위치에 있던 요소는 빠져 나오고
		// 새로운 요소가 해당 인덱스에 들어가게 된다.
		// 또한 set 메소드의 경우 리턴 타입이 < >의 클래스이기 때문에
		// 빠져 나온 요소를 다른 곳에 저장할 수도 있다.
		System.out.println("6. set(index, element)");
		System.out.println("set 전 list.get(0): "+list.get(0));
		Student temp = list.set(0, s7);
		System.out.println("set 후 list.get(0): "+list.get(0));
		System.out.println("temp: "+temp);
		System.out.println("----------------------");
		
		// 7. ArrayList에서 
		// 특정 index의 요소를 삭제할 때에는
		// remove(indeX) 메소드를 실행하면 된다.
		// 삭제후에는 크기가 1 줄어든다.
		System.out.println("7. list.remove(index)");
		System.out.println("remove 전 size(): "+list.size());
		System.out.println("remove 전 get(3): "+list.get(3));
		list.remove(3);
		System.out.println("remove 후 size(): "+list.size());
		System.out.println("remove 후 get(3): "+list.get(3));
		System.out.println("----------------------");
		
		// 여기서 부터 아래에 설명할 메소드들은
		// < >에 적혀진 클래스에
		// equals() 메소드가 정확하게 구현되어야
		// 정상적으로 실행되는 메소드들이다.
		// ArrayList 중 아래의 메소드들은 내부에서
		// equals() 메소드를 활용하기 때문이다.
		
		// s44는 비록 list에 추가된적은 없지만
		// s4와 equals()가 true가 나오는 객체이다.
		Student s44 = new Student(4, "4", 4, 4, 4);
		
		// 8. 객체가 해당 list에 존재하는지 체크하고 싶다면
		//    contains(객체) 메소드를 실행하면 된다.
		//    이때는 굳이 똑같은 객체가 아니더라도
		//    해당 객체가 equals()가 true가 나오는 객체가 
		//    리스트에 존재한다면
		//    true가 나온다.
		System.out.println("8. contains(elements)");
		// 우리의 list에서 s3는 remove(index)가 삭제했으므로
		// 존재하지 않는게 확실
		// list에 추가했던 s2의 경우
		System.out.println("list.contains(s2): "+list.contains(s2));
		// list에서 삭제하여 더이상 존재하지 않는 s3의 경우
		System.out.println("list.contains(s3): "+list.contains(s3));
		// list에 추가된적은 없지만 equals()가 true가 나오는 객체가 존재하는
		// s44의 경우
		System.out.println("list.contains(s44): "+list.contains(s44));
		System.out.println("----------------------");
		
		// 9. 특정 객체의 앞에서부터 셌을때의 index가 궁금하다면
		//    indexOf(객체) 를 실행하면 된다.
		//    단 해당 객체가 존재하지 않을 경우
		//    -1이 리턴된다.
		
		System.out.println("9. indexOf(element)");
		// list에 추가했던 s2의 경우
		System.out.println("list.indexOf(s2): "+list.indexOf(s2));
		// list에서 삭제하여 더이상 존재하지 않는 s3의 경우
		System.out.println("list.indexOf(s3): "+list.indexOf(s3));
		// list에 추가된적은 없지만 equals()가 true가 나오는 객체가 존재하는
		// s44의 경우
		System.out.println("list.indexOf(s44): "+list.indexOf(s44));
		System.out.println("----------------------");
		
		// 10. 만약 뒤에서부터 기준으로 해당 객체가 
		//     몇번 index에 존재하는지 알려면
		//     lastIndexOf(객체)를 실행하면 된다.
		//     indexOf()와 마찬가지로
		//     존재하지 않는 객체에 대해서는 -1이 리턴된다.
		
		list.add(s2);
		
		System.out.println("10. lastIndexOf(element)");
		// list에 추가했던 s2의 경우
		System.out.println("list.lastIndexOf(s2): "+list.lastIndexOf(s2));
		// list에서 삭제하여 더이상 존재하지 않는 s3의 경우
		System.out.println("list.lastIndexOf(s3): "+list.lastIndexOf(s3));
		// list에 추가된적은 없지만 equals()가 true가 나오는 객체가 존재하는
		// s44의 경우
		System.out.println("list.lastIndexOf(s44): "+list.lastIndexOf(s44));
		System.out.println("----------------------");
		
		// 11. ArrayList에서 삭제를 할때
		//     index를 모르고 대신 객체가 있을 경우
		//     remove(객체) 메소드를 실행하면 된다.
		//     equals()가 true가 나오는 요소 중
		//     가장 index가 빠른 하나를 삭제한다.
		//     만약 equals()가 true가 나오는 요소가 없다면
		//     아무것도 삭제되지 않는다.
		System.out.println("11. remove(element)");
		
		// 리스트에 추가되었던 s7의 경우
		System.out.println("삭제전 list.contains(s7): "+list.contains(s7));
		list.remove(s7);
		System.out.println("삭제후 list.contains(s7): "+list.contains(s7));
		
		// 리스트에 존재하지 않는 s3의 경우
		System.out.println("삭제전 list.contains(s3): "+list.contains(s3));
		list.remove(s3);
		System.out.println("삭제후 list.contains(s3): "+list.contains(s3));
		
		// 리스트에 추가된 적은 없지만 equals()가 true가 나오는 요소가 존재하는
		// s44의 경우
		System.out.println("삭제전 list.contains(s44): "+list.contains(s44));
		list.remove(s44);
		System.out.println("삭제후 list.contains(s44): "+list.contains(s44));
		
	}
}










