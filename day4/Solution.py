def nbMonths(startPriceOld, startPriceNew, savingperMonth, percentLossByMonth):
    monthCount = 0

    while startPriceOld - startPriceNew + (savingperMonth * monthCount) < 0:
        if monthCount % 2 == 1:
            percentLossByMonth += 0.5

        monthCount += 1

        startPriceOld *= (100 - percentLossByMonth) / 100
        startPriceNew *= (100 - percentLossByMonth) / 100        
        
    return [monthCount, int(startPriceOld - startPriceNew + (savingperMonth * monthCount))]