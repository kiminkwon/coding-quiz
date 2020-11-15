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
		int month = 0;
		int changes= 0;
		boolean purchaseableYn = false;
		double savingAmt = month * savingperMonth; // 적당한 띄어쓰기는 가독성을 높여 줍니다.
		
		// 질문?? 왜 looping 전에 미리 차 값이 줄어들까요?? 퀴즈에서는 현재 자산을 가지고 새차를 살 수 있는지를 판별 하는것인거 같은데.. 1달이 가기 전부터 차가 썩었다????
		startPriceOld -= ((startPriceOld / 100) * percentLossByMonth); // 여러 연산이 묶인 경우 순서대로 연산이 되기는 하지만 적절히 괄호를 넣어주면 가독성이 높아 집니다.
		startPriceNew -= ((startPriceNew / 100) * percentLossByMonth);
		
		double lossRatio = 0;
		
		if(startPriceOld + savingAmt - startPriceNew>0) {
			purchaseableYn = true;
		}else {
			month++;
			lossRatio = Math.floor( month/2 ) * 0.5;
		}

		savingAmt = month * savingperMonth;
		
		while(!purchaseableYn) {
			if((savingAmt + startPriceOld) - startPriceNew>0) { 
				purchaseableYn = true;
				changes = (int)((savingAmt+startPriceOld)-startPriceNew);  // 퀴즈에 명시를 못해드렸습니다. 이건 제 실수 입니다. 반올림 해주세요.. ㅜㅜ
			}else {
				month++;
			}
			lossRatio = Math.floor( month/2 ) * 0.5;
			startPriceOld -= (startPriceOld / 100 * (percentLossByMonth + lossRatio)); 
			startPriceNew -= (startPriceNew / 100 * (percentLossByMonth + lossRatio));
			savingAmt = month * savingperMonth;
		}
		int[] returnValues = {month, changes}; 
		return returnValues;
	}
	
}
