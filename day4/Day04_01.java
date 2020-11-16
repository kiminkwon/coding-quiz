package Day04.project;

public class Day04_01 {
	// 어떤 한 남자의 차는 $2000 입니다. 그가 사고 싶어 하는 차는 $8000 입니다. 
	// 그는 매달 $ 1000를 절약 할 수 있다고 생각하지만 그의 오래된 차와 새 차의 가격은 한 달에 1.5 % 하락합니다. 
	// 또한이 손실 비율은 2 개월마다 0.5 % 씩 증가합니다. 우리 남자는이 모든 계산을하기가 어렵다는 것을 알고 있습니다
	// 그가 원하는 차를 살 수있을만큼의 돈을 모으려면 몇 달이 걸리고 그가 남는 돈은 얼마나 될까요?
	
	public static void main(String[] args) {
		nbMonths(2000, 8000, 1000, 1.5);
	}
	
	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
	    int month = 0;
	    int savingMoney = 0;
	    double dstartPriceOld = (double)startPriceOld;
	    double dstartPriceNew = (double)startPriceNew;
	    
	    while(dstartPriceNew > (savingMoney + dstartPriceOld)) {
	    	month ++;
	    	savingMoney = savingMoney + savingperMonth;
	    	
	    	if(month % 2 == 0) percentLossByMonth = percentLossByMonth + 0.5;
	    	dstartPriceOld = dstartPriceOld - (dstartPriceOld * 0.01 * percentLossByMonth);
	    	dstartPriceNew =  dstartPriceNew - (dstartPriceNew * 0.01 * percentLossByMonth);
	    }
	    
	    int[] returnValue = new int[]{month, (int)(savingMoney+dstartPriceOld-dstartPriceNew)};
	    System.out.println(returnValue[0] + "," + returnValue[1]);
	    
		return returnValue;
	}
}
