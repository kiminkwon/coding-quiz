package Day05.project;

public class Day05_01 {
	//정수 배열이 주어질 것입니다.
	//당신의 임무는 그 배열을 가져 와서 N의 왼쪽에있는 정수의 합이
	//N의 오른쪽에있는 정수의 합과 같은 인덱스 N을 찾는 것입니다.
	//이런 일을 할 수있는 인덱스가 없다면,- 1을 반환합니다.
	
	//Input
	//작성할 함수는 매개변수는 0 < arr < 1000 의 정수 배열입니다.

	//Output
	//N의 왼쪽이 N의 오른쪽과 같은 가장 낮은 인덱스 N입니다.
	//이러한 규칙에 맞는 인덱스를 찾지 못하면 -1을 반환합니다.
	
	public static void main(String[] args) {
		int returnValue1[] = {1,2,3,4,3,2,1};
		findSumIndex(returnValue1);
		
		int returnValue2[] = {10, -80,10,10,15,35};
		findSumIndex(returnValue2);
	}
	
	public static int findSumIndex(int arr[]) {
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			int leftSum = leftSum(arr, i);
			int rightSum = rightSum(arr,i);
			if(leftSum == rightSum) index = i;
		}
		System.out.println(index);
		return index;
	}
	
	public static int leftSum(int arr[], int index) {
		int leftSum = 0;
		for(int i=0; i<index; i++) {
			leftSum = leftSum + arr[i];
		}
		return leftSum;
	}
	
	public static int rightSum(int arr[], int index) {
		int rightSum = 0;
		for(int i=arr.length -1; i>index; i--) {
			rightSum = rightSum + arr[i];
		}
		return rightSum;
	}
}
