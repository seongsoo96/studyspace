package day04;

public class Ex08Student01 {
	public static void main(String[] args) {
		// Student 클래스 객체를 선언하고 초기화하자
		Student s = new Student();
		// 객체의 필드나 메소드를 접근할 때에는
		// . 연산자로 접근가능하다.

		// 객체 필드는 해당 객체 안에 우리가 값을 저장하거나
		// 저장된 값을 호출할 수 있다.
		// 이때는 변수처럼 = 연산자 혹은 변수이름을 적어주되
		// "누구의" 필드인지 적어주면 된다.
		// 즉 위의 s 객체의 id 는 s.id 이렇게

		s.id = 1;
		s.name = "조재영";
		s.korean = 80;
		s.english = 81;
		s.math = 81;

		System.out.printf("번호: %03d번 이름: %s\n", s.id, s.name);
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", s.korean, s.english, s.math);

		System.out.printf("총점: %03d점 평균: %.2f점\n", s.calculateSum(), s.calculateAverage());

		Student s2 = new Student();

		System.out.printf("번호: %03d번 이름: %s\n", s2.id, s2.name);
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", s2.korean, s2.english, s2.math);

		s2.id = 3;
		s2.korean = 40;
		s2.name = "김철수";
		s2.english = 30;
		s2.math = 45;

		System.out.printf("총점: %03d점 평균: %.2f점\n", s2.calculateSum(), s2.calculateAverage());

		System.out.println(s);
		System.out.println(s2);

		Student s3 = new Student(2, "아이유", 1, 1, 1);
		Student s4 = new Student(2, "아이유", 1, 1, 1);

		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);

		System.out.println("s3 == s4: " + (s3 == s4));

		System.out.println("s3.equals(s4): " + s3.equals(s4));

	}
}
