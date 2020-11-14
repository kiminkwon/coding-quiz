package kguru;

/**
	[4일차] Quiz.
	어떤 한 남자의 차는 $2000 입니다. 그가 사고 싶어 하는 차는 $8000 입니다. 
	그는 매달 $ 1000를 절약 할 수 있다고 생각하지만 그의 오래된 차와 새 차의 가격은 한 달에 1.5 % 하락합니다. 또한이 손실 비율은 2 개월마다 0.5 % 씩 증가합니다. 우리 남자는이 모든 계산을하기가 어렵다는 것을 알고 있습니다

	그가 원하는 차를 살 수있을만큼의 돈을 모으려면 몇 달이 걸리고 그가 남는 돈은 얼마나 될까요?

	Parameters and return of function:

	parameter (positive int or float, guaranteed) startPriceOld (Old car price)
	parameter (positive int or float, guaranteed) startPriceNew (New car price)
	parameter (positive int or float, guaranteed) savingperMonth 
	parameter (positive float or int, guaranteed) percentLossByMonth

	nbMonths(2000, 8000, 1000, 1.5) should return [6, 766] or (6, 766)

	Detail of the above example: 
	 end month 1: percentLoss 1.5 available -4910.0
	 end month 2: percentLoss 2.0 available -3791.7999...
	 end month 3: percentLoss 2.0 available -2675.964
	 end month 4: percentLoss 2.5 available -1534.06489...
	 end month 5: percentLoss 2.5 available -395.71327...
	 end month 6: percentLoss 3.0 available 766.158120825...
	return [6, 766] or (6, 766)

 다음의 함수를 작성하세요
	
 nbMonths(float startPriceOld, float startPriceNew,float savingperMonth,double percentLossByMonth) {
		
}
**/
public class Day4 {

	public static void main(String[] args) throws Exception{
		int[] returnValues = nbMonths(2000, 8000, 1000, 1.5);
		for(int value : returnValues) {
			System.out.println(value);
		}
	}
		
 
	public static int[] nbMonths(float startPriceOld, float startPriceNew,float savingperMonth,double percentLossByMonth) throws Exception{
		int month = 1; // month 는 0부터 시작입니다. 왜냐면 현재 상태에서 살 수 있는 지 부터 확인이 되어야 되기 떄문에 현재 살 수 있는지 확인하고, 살 수 없을때 부터 month += 1 해주면 됩니다.
		int changes= 0;
		boolean purchaseableYn = false;
		
		// 이 부분이 while 바디 밖으로 나와야 합니다. while 문을 반복하면서 해당 변수가 새로 정의 되므로 연산한 결과가 누적이 되지 않고, 계속 재정의만 되서 올바를 결과값을 얻을 수 없습니다.
		double savingAmt = month*savingperMonth;  
		double lossRatio = Math.floor(month/2)*0.5; 
		double priceOld = startPriceOld-(startPriceOld/100*(percentLossByMonth+lossRatio));
		double priceNew = startPriceNew-(startPriceNew/100*(percentLossByMonth+lossRatio));
		
		while(!purchaseableYn) { //구매할 수 있는지 여부
			// 다시 풀어 보세요 ~~~
//			System.out.println("손실비율 :" + lossRatio);
//			System.out.println(priceOld);
//			System.out.println(priceNew);
			if((savingAmt+priceOld)-priceNew>0) {
				purchaseableYn = true;
				changes = (int)((savingAmt+priceOld)-priceNew);
			}else {
				month++;
			}
		}
		int[] returnValues = {month, changes}; 
		return returnValues;
	}
	
}
