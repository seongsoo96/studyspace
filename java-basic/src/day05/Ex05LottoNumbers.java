package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// 랜덤이란 클래스를 사용해서
// 로또 번호를 추첨하는 
// 프로그램

// 로또번호 조건
// 1. 1~45사이
// 2. 6개
// 3. 중복된 번호 없음
// 4. 정렬되어있음
public class Ex05LottoNumbers {
	private final static int SIZE = 6;
	private final static int MAX = 45;
	
	public static void main(String[] args) {
		//숫자를 보관할 ArrayList 객체 생성
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		//랜덤 숫자를 생성할 Random 객체 생성
		Random random = new Random();
		
		// lottoNumbers의 크기가 6보다 작을동안
		// random의 메소드를 사용해서 
		// 1~45사이의 랜덤한 정수를 만들고
		// 그 숫자가 lottoNumbers에 없으면
		// lottoNumbers에 추가해준다.
		while(lottoNumbers.size() < SIZE) {
			// 랜덤 숫자 생성
			// Random 클래스의
			// nextInt(MAX)의 경우
			// 
			// 0 ~ MAX-1 까지의 랜덤한 숫자가 발생한다.
			// 하지만 우리는 1 ~ MAX 사이의 숫자가 필요하므로
			// 메소드 결과값에 1을 더해서
			// 0이 나오면 1로 1이 나오면 2로 .....
			// 44가 나오면 45가 되도록 해준다.
			int randomNumber = random.nextInt(MAX) + 1;
			
			//만약 randomNumber가 리스트에
			//존재하지 않는다면
			//리스트에 추가
			if(!lottoNumbers.contains(randomNumber)) {
				lottoNumbers.add(randomNumber);
			}
			
			
		}
		
		// 정렬의 경우 우리가 직접 코드를 구현하는 것이 아니라
		// 자바가 만들어 준 것을 직접 쓰도록 하자.
		Collections.sort(lottoNumbers);
		
		// ArrayList의 내용을 단순 출력할때와 같은 경우에는
		// for문을 좀더 간단하게 사용가능하다.
		// 앞에서부터 맨 마지막 까지
		// 차례대로 뽑아내서
		// 객체 x 로 불러라 이런식으로 for 문을 만들어 줄 수 있다.
		// 즉
		// for(int i = 0; i < list.size(); i++){
		//     객체 o = list.get(i);
		// }
		// 를 줄여서 쓰는 것이다.
		
		// 사용방법은
		// for(클래스 o : ArrayList){
		//
		// }
		// 이다.
		// 여기서 클래스는 ArrayList 선언할 때
		// < >에 적은 클래스를 적어주면 된다.
		// ArrayList는 클래스가 아닌 실제 객체를 뜻한다.
		
		for(Integer i : lottoNumbers) {
			System.out.println(i);
		}
	}
}

















