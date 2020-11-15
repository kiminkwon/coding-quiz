package kguru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
[5일차] Quiz.
정수 배열이 주어질 것입니다.
당신의 임무는 그 배열을 가져 와서 N의 왼쪽에있는 정수의 합이
N의 오른쪽에있는 정수의 합과 같은 인덱스 N을 찾는 것입니다.
이런 일을 할 수있는 인덱스가 없다면,- 1을 반환합니다.

For example:
{1,2,3,4,3,2,1} = 3
※ (1 + 2+ 3) = (3 + 2 + 1) 이므로 4의 인덱스 3을 반환

{20,10,-80,10,10,15,35} = 0
※ 인덱스 0에서 왼쪽은 {}입니다.
오른쪽은 { 10,-80,10,10,15,35 }입니다.
둘 다 추가되면 0과 같습니다. (빈 배열은이 문제에서 0과 같습니다)
인덱스 0은 왼쪽과 오른쪽이 같은 곳입니다.

Input
작성할 함수는 매개변수는 0 < arr < 1000 의 정수 배열입니다.

Output
N의 왼쪽이 N의 오른쪽과 같은 가장 낮은 인덱스 N입니다.
이러한 규칙에 맞는 인덱스를 찾지 못하면 -1을 반환합니다.

만약 배열에서 답이 복수로 나올경우 가장 작은 인덱스가 정답입니다.
  
 **/

public class Day5 {
	public static void main(String[] args) {
		int[] array = {20,10,-80,10,10,15,35};
		
		int result = arrayLeftRightSumEquals(array);
		
		System.out.println("결과값:"+result);
	}
	public static int arrayLeftRightSumEquals(int[] array) {
		Map<Integer, Integer> leftMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> rightMap = new HashMap<Integer, Integer>();
		List<String> index = new ArrayList<>(); // 
		int count = 0;
		int result = 0;
		
		for(int i = 0; i < array.length; i++) {
			//그리고 각각 인덱스의 왼쪽에 있는 녀석, 오른쪽에 있는 녀석들의 합계를 구하겠지
			int leftSum = 0; //대상 인덱스의 왼쪽에 위치한 요소들의 합계
			int rightSum = 0;//대상 인덱스의 오른쪽에 위치한 요소들의 합계
			
			if(i == 0) { //인덱스가 0이면
				//왼쪽에 있는 녀석의 합계는 왼쪽 인덱스 그 자체에 있는 값
				leftSum = 0;
				
				//해당 인덱스 오른쪽 값들의 합계
				for(int k = i+1; k < array.length; k++) {
					rightSum +=array[k];
				}

				leftMap.put(i, leftSum);
				rightMap.put(i, rightSum);
			} else if(i == array.length-1) { // 인덱스 i에 대한 조건 분기라면 if 로만 구성하는 것보다 if else if else 로 그룹을 지어주는 것이 좋습니다.
				for(int j = 0; j < i; j++) {
					leftSum += array[j];
				}
				leftMap.put(i, leftSum);
				rightMap.put(i, rightSum);
			} else if(!(i == 0)&& !( i == array.length - 1)) { // !(i == 0) 이랑 i != 0 이랑 머가 다를까요????
				//해당 인덱스 왼쪽 값들의 합계
				for(int j=i-1; j>=0;j--) {
					leftSum += array[j];
				}
				//해당 인덱스 오른쪽 값들의 합계
				for(int k = i+1; k < array.length; k++) {
					rightSum += array[k];
				}

				leftMap.put(i, leftSum);
				rightMap.put(i, rightSum);
			}
			if(rightMap.get(i) == leftMap.get(i)) {
				index.add(Integer.toString(i));
				count++;
			}
		}
		if(count == 0) {
			result = -1;
		}else {
			result = Integer.parseInt(index.get(0));
		}
		return result;
	}
	
}
