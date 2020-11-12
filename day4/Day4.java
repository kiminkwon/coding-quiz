public class Day4{
	public static int[] nbMonths(double startPriceOld, double startPriceNew, double savingperMonth,double percentLossByMonth) {
		int resultArray[] = null; // 리턴 Array
		int month = 0;
		int money = 0;
		double result=0; //계산할 돈
		double percentLossByMonthTmp= percentLossByMonth * 0.01; //달에 내려가는 가격
		result = startPriceOld - startPriceNew; // 예전 차 - 새차  
		if (result > 0) {
			money = (int)result;
			resultArray = new int[]{ month , money };
			return resultArray;
		}else {
			month++;
			double startPriceOldTmp = startPriceOld - (startPriceOld * percentLossByMonthTmp); // 예전 차 비용(감가 포함)
			double startPriceNewTmp = startPriceNew - (startPriceNew * percentLossByMonthTmp); // 새 차 비용(감가 포함)
			while (true) {
				if (month % 2 == 0)  {// 2개월 마다 체크.
					percentLossByMonthTmp += 0.005;
				}
				if (month>1) {
					startPriceOldTmp = startPriceOldTmp - (startPriceOldTmp * percentLossByMonthTmp);
					startPriceNewTmp = startPriceNewTmp - (startPriceNewTmp * percentLossByMonthTmp);				
				}
				result = ((startPriceOldTmp + savingperMonth * month) - startPriceNewTmp); // 예전 차 + (저축금액 * 달 ) - 새차 
				if (result > 0) {
					money = (int)result;
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
}
