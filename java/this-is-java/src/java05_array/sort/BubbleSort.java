package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = {3,2,5,4,1};
		
		
		//--원본 출력---
		System.out.println("---정렬 전---");
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//-------------------
		
		//----버블 정렬----
		System.out.println("---정렬 진행---");
		for(int j=0; j<arr.length-1; j++) { //(length-1) round 반복, 4round 반복함
			for(int i=0; i<arr.length-1-j; i++) { //각 round
				if( arr[i] > arr[i+1]) {
					//스왑
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
		}
		
		
		
		//-----------------
		
		
		//--- 정렬된 이후 출력---
		System.out.println("----정렬 후---");
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
//		
	}
}
