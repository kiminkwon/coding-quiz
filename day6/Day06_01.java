package Day06.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Day06_01 {
	//한 번만 나타나는 요소 (x라고합시다)와 두 번만 나타나는 요소 (y라고합시다)를 제외하고 모든 요소가 세 번 나타나는 양의 정수 배열이 제공됩니다.
	//당신의 임무는 x * x * y를 찾는 것입니다.
	public static void main(String args[]) {
		int arr1[] = {1, 1, 1, 2, 2, 3};
		missingValues(arr1);
		
		int arr2[] = {6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200};
		missingValues(arr2);
	}
	
	public static int missingValues(int arr[]) {
		int x = 0;
		int y = 0;
		int returnValue = 0;
		
		HashMap<String,Integer> sortMap =sortingMap(arr);
		List<String> keyList = new ArrayList<>(sortMap.keySet());
		
		for(int i=0; i<sortMap.size(); i++) {
			if(sortMap.get(keyList.get(i)) == 1) x = Integer.parseInt(keyList.get(i));
			if(sortMap.get(keyList.get(i)) == 2) y = Integer.parseInt(keyList.get(i));
		}
		
		returnValue = x * x * y;
		
		System.out.println(returnValue);
		return returnValue;
	}
	
	public static HashMap<String,Integer> sortingMap(int arr[]){
		HashMap<String,Integer> sortMap =new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(sortMap.containsKey(Integer.toString(arr[i]))) {
				sortMap.put(Integer.toString(arr[i]), sortMap.get(Integer.toString(arr[i])) + 1);
			}else {
				sortMap.put(Integer.toString(arr[i]), 1);
			}
		}
		
		return sortMap;
	}
}
