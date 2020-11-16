package Day02.project;

import java.util.Scanner;

public class Day02_01 {
	//시작번호와 끝번호를 인수로 받아 시작번호 부터 끝번호까지 숫자 중에서 5 가 포함된 수를 뺀 나머지 수의 갯수를 반환하는 함수를 작성하세요.
	//시작 번호는 항상 끝 번호보다 작습니다. 두 숫자 모두 음수 일 수도 있습니다!
	
	public static void main(String[] args) {
		returnValue(1,9);
		returnValue(4,17);
	}
	
	public static int returnValue(int start, int end) {
		int cnt = 0;
		
		for(int i = start; i <= end; i++) {
			if(!(Integer.toString(i).contains("5"))) {cnt++;}
		}
		
		System.out.println(cnt);
		
		return cnt;
	}
}
