package day5;

public class Day5 {

	public static int getIndex(int[] arr) {
		int answer=-1;
		int idx=0;
		while (idx<arr.length) {
			int left=0; //왼쪽 합
			int right=0; //오른쪽 합
			if (idx == 0) { // 0일 때
				for (int i=idx+1;i<arr.length;i++) {
					right+=arr[i];
				}
			}else if (idx==arr.length-1) { //끝까지 갔을때
				for (int i=arr.length-2;i>=0;i--) {
					left +=arr[i];
				}
			}else {
				for (int i=0;i<idx;i++) { // left 계산
					left+=arr[i];
				}
				for (int i=idx+1;i<arr.length;i++) { //right 계산
					right+= arr[i];
				}
			}
			if (left == right && (answer == -1 || idx < answer)) {
				answer = idx;
			}
		idx++;
		}
		return answer;
	}

}
