package kguru;

import java.util.Scanner;

/**
	[2일차] Quiz.
	시작번호와 끝번호를 인수로 받아 시작번호 부터 끝번호까지 숫자 중에서 5 가 포함된 수를 뺀 나머지 수의 갯수를 반환하는 함수를 작성하세요.
	시작 번호는 항상 끝 번호보다 작습니다. 두 숫자 모두 음수 일 수도 있습니다!

	Test Case
	1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
	4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12
	
 **/
public class Day2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 보다 junit을 사용해서 테스트 해보세요. junit은 구글링하면 쉽게 학습할 수 있고 이클립스에서도 쉽게 사용할 수 있습니다.
		int startNum = scan.nextInt();
		int lastNum = scan.nextInt();
		int count = 0;
		
		for(int i=startNum; i<=lastNum; i++) {
			if(!Integer.toString(i).contains("5")) { // if 바디를 비우고 else 에서 처리하는 것보다 if 조건의 부정으로 조건식을 작성하면 else 는 필요 없게 됩니다.
				count++	
			} 
		}
		System.out.println(count);
	}
}
