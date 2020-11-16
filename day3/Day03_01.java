package Day03.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day03_01 {
	// 중첩된 배열을 매개변수로 받아 각 하위 배열에서 정확히 하나의 요소를 가지는 고유 배열의 수를 반환하는 함수를 작성하세요.
	// 예시): solve([[1,2],[4],[5,6]])은 4개의 배열이 생성가능합니다.([1,4,5],[1,4,6],[2,4,5],[2,4,6]).
	// 중복은 카운트에 포함하지 않습니다.
	
	public static void main(String[] args) {
		int arrayCnt = 0;
		int arraySize = 0;
		int result = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력할 배열의 갯수를 입력하세요 : ");
		arrayCnt = input.nextInt();
		
		for(int i=0; i<arrayCnt; i++) {
			System.out.print("배열 사이즈를 입력하세요 : ");
			arraySize = input.nextInt();
			
			System.out.print("배열을 입력하세요 : ");
			int array[] = new int[arraySize];
			for(int j=0; j<arraySize; j++) {
				array[j] = input.nextInt();
			}
			
			List<String> list = new ArrayList<String>();
			for(int j=0; j<arraySize; j++) {
				if(!list.contains(Integer.toString(array[j]))) list.add(Integer.toString(array[j]));
			}
			result = result * list.size();
		}
		
		System.out.print(result);
	}
}
