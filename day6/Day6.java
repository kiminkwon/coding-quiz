import java.util.Arrays;

public class Day6{
	public static int missingValues(int[] arr) {
		int one = 0;//한번만 나타나는 요소
		int two = 0;//두번만 나타나는 요소
		
		for (int i = 0; i < arr.length; i++) {
			int temp=arr[i]; //비교할 값
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if (temp==arr[j]) { //비교하는 값이 같을 때
					count++;
				}
			}
			if (count==2) { //두번만 나타났을 때
				two=temp;
			} else if (count==1) { // 한번만 나타났을 때
				one=temp;
			}
		}
			
		
		return one * one * two;
	}
}
