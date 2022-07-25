package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// �����̶� Ŭ������ ����ؼ�
// �ζ� ��ȣ�� ��÷�ϴ� 
// ���α׷�

// �ζǹ�ȣ ����
// 1. 1~45����
// 2. 6��
// 3. �ߺ��� ��ȣ ����
// 4. ���ĵǾ�����
public class Ex05LottoNumbers {
	private final static int SIZE = 6;
	private final static int MAX = 45;
	
	public static void main(String[] args) {
		//���ڸ� ������ ArrayList ��ü ����
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		//���� ���ڸ� ������ Random ��ü ����
		Random random = new Random();
		
		// lottoNumbers�� ũ�Ⱑ 6���� ��������
		// random�� �޼ҵ带 ����ؼ� 
		// 1~45������ ������ ������ �����
		// �� ���ڰ� lottoNumbers�� ������
		// lottoNumbers�� �߰����ش�.
		while(lottoNumbers.size() < SIZE) {
			// ���� ���� ����
			// Random Ŭ������
			// nextInt(MAX)�� ���
			// 
			// 0 ~ MAX-1 ������ ������ ���ڰ� �߻��Ѵ�.
			// ������ �츮�� 1 ~ MAX ������ ���ڰ� �ʿ��ϹǷ�
			// �޼ҵ� ������� 1�� ���ؼ�
			// 0�� ������ 1�� 1�� ������ 2�� .....
			// 44�� ������ 45�� �ǵ��� ���ش�.
			int randomNumber = random.nextInt(MAX) + 1;
			
			//���� randomNumber�� ����Ʈ��
			//�������� �ʴ´ٸ�
			//����Ʈ�� �߰�
			if(!lottoNumbers.contains(randomNumber)) {
				lottoNumbers.add(randomNumber);
			}
			
			
		}
		
		// ������ ��� �츮�� ���� �ڵ带 �����ϴ� ���� �ƴ϶�
		// �ڹٰ� ����� �� ���� ���� ������ ����.
		Collections.sort(lottoNumbers);
		
		// ArrayList�� ������ �ܼ� ����Ҷ��� ���� ��쿡��
		// for���� ���� �����ϰ� ��밡���ϴ�.
		// �տ������� �� ������ ����
		// ���ʴ�� �̾Ƴ���
		// ��ü x �� �ҷ��� �̷������� for ���� ����� �� �� �ִ�.
		// ��
		// for(int i = 0; i < list.size(); i++){
		//     ��ü o = list.get(i);
		// }
		// �� �ٿ��� ���� ���̴�.
		
		// �������
		// for(Ŭ���� o : ArrayList){
		//
		// }
		// �̴�.
		// ���⼭ Ŭ������ ArrayList ������ ��
		// < >�� ���� Ŭ������ �����ָ� �ȴ�.
		// ArrayList�� Ŭ������ �ƴ� ���� ��ü�� ���Ѵ�.
		
		for(Integer i : lottoNumbers) {
			System.out.println(i);
		}
	}
}

















