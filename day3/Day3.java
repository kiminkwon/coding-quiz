package kguru;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
	[3일차] Quiz.
	중첩된 배열을 매개변수로 받아 각 하위 배열에서 정확히 하나의 요소를 가지는 고유 배열의 수를 반환하는 함수를 작성하세요.

	예시): solve([[1,2],[4],[5,6]])은 4개의 배열이 생성가능합니다.([1,4,5],[1,4,6],[2,4,5],[2,4,6]).

	중복은 카운트에 포함하지 않습니다.
	
	ex)
	[[1,2],[4],[5,6]]) -> 4
	[[1,2],[4,4],[5,6,6]] -> 4
	[[1,2],[3,4],[5,6]] -> 8
	[[1,2,3],[3,4,6,6,7],[8,9,10,12,5,6]] -> 72
	
 **/
public class Day3 {
	
	public static void main(String[] args) throws Exception {
		System.out.println("숫자 배열을 입력해주세요.숫자 배열 입력 시 ,(comma)를 붙여주세요.");
		System.out.println("종료를 원한다면 \"끝\"이라는 명령어를 입력해주세요.");
		
		System.out.println(solve()); // result 라는 변수를 함수 리턴값만 받는 데만 사용한다면 굳이 변수 선언 없이 함수를 바로 인자로 넣으면 군더더니 없는 코드로 작성 가능합니다.
	}
	
	/**
	 * 퀴즈를 다시 확인 하셨으면 좋겠습니다. scanner를 이용해 배열을 하나씩 입력하는 형태로 퀴즈를 푸셨는데 퀴즈에서는 함수에 매개변수로 List<List<int>> 형인 매개변수를 넘겨서 푸는 형태를 요구했습니다.
	 * 즉 solve() 는 solve(List<List<int>> param) 형태의 함수이고, solve 함수를 호출할 떄 매개 변수로 예제의 배열을 넘겨서 결과를 확인하는 형태로 푸셔야 합니다.
	 */

	public static int solve() throws Exception {
		
		List<Integer> counts = new ArrayList<Integer>(); 
		
		boolean stop = false;
		
		while(!stop) { //true인 경
			Scanner scan = new Scanner(System.in); // Scanner 보다 junit을 사용해서 테스트 해보세요. junit은 구글링하면 쉽게 학습할 수 있고 이클립스에서도 쉽게 사용할 수 있습니다.
			String arrayStr = scan.next();

			if(!"끝".equals(arrayStr)){
				
				String[] splitArray = arrayStr.split(",");
				
				HashSet<Integer> set = new HashSet<>(); // java7 이후 제네릭 선언은 변수 선언부만 선언해도 사용 가능합니다.
				for(int i=0; i<splitArray.length; i++) {
					set.add(Integer.parseInt(splitArray[i]));
				}
				counts.add(set.size()); // count 라는 배열을 만들어 다시 결과를 확인하는 것보다 int count 변수를 사용하는 것이 불필요한 작업을 없앨 수 있지 않을까요??
			}
			else {
				stop = true;
			}
		}
		
		int result = 1; 
		
		for(int count:counts) {
			result *= count;
		}
		return result;
	}
}
