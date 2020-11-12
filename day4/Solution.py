def nbMonths(startPriceOld, startPriceNew, savingperMonth, percentLossByMonth):
    monthCount = 1

    while 1:
        startPriceOld *= (100 - percentLossByMonth) / 100
        startPriceNew *= (100 - percentLossByMonth) / 100

        if startPriceOld - startPriceNew + (savingperMonth * monthCount) > 0:
            return [monthCount, int(startPriceOld - startPriceNew + (savingperMonth * monthCount))]

        if monthCount % 2 == 1:
            percentLossByMonth += 0.5
        monthCount += 1
        
    return -1