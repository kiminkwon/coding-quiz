public class Day4{
	public static int[] nbMonths(float startPriceOld, float startPriceNew, float savingperMonth,float percentLossByMonth) {
		int resultArray[] = null; // 리턴 Array
		int month = 1;
		int money = 0;
		float result=0; //계산할 돈
		float percentLossByMonthTmp=(float) (percentLossByMonth * 0.01); //달에 내려가는 가격
		float startPriceOldTmp = (float)(startPriceOld - (startPriceOld * percentLossByMonthTmp)); // 예전 차 비용(감가 포함)
		float startPriceNewTmp = (float)(startPriceNew - (startPriceNew * percentLossByMonthTmp)); // 새 차 비용(감가 포함)
		while (true) {
			if (month % 2 == 0)  {// 2개월 마다 체크
				percentLossByMonthTmp += 0.005;
			}
			if (month>1) {
				startPriceOldTmp = (float)(startPriceOldTmp - (startPriceOldTmp * percentLossByMonthTmp));
				startPriceNewTmp = (float)(startPriceNewTmp - (startPriceNewTmp * percentLossByMonthTmp));				
			}
			result = (float)((startPriceOldTmp + savingperMonth * month) - startPriceNewTmp); // 예전 차 + (저축금액 * 달 ) - 새차 
			if (result > 0) {
				money = (int) result;
				break;
			}
			else {
				month++;	
			}
		}
		resultArray = new int[]{ month , money };
		return resultArray;
	}
}
