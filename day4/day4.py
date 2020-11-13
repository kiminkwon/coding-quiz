def nbMonths(startPriceOld, startPriceNew, savingPerMonth, percentLossByMonth):
    savingMoney = 0
    totalMoney = 0
    nowPriceOld = startPriceOld
    nowPriceNew = startPriceNew
    month = 0
    
    while(totalMoney < nowPriceNew):
        month += 1
        if month % 2 == 0:
            percentLossByMonth += 0.5
        nowPriceOld -= nowPriceOld*percentLossByMonth/100
        nowPriceNew -= nowPriceNew*percentLossByMonth/100
        savingMoney += savingPerMonth
        
        totalMoney = nowPriceOld + savingMoney
    return (month,(int)(totalMoney-nowPriceNew))


print(nbMonths(2000,8000,1000,1.5))