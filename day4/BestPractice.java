public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
      int month = 1;
      int savings = 0;
      double startPriceOldD = (double) startPriceOld;
      double startPriceNewD = (double) startPriceNew;
      while (startPriceNewD > (startPriceOldD + savings)) {
        if (month % 2 == 0) percentLossByMonth += .5d;
        startPriceOldD *= (1 - percentLossByMonth / 100);
        startPriceNewD *= (1 - percentLossByMonth / 100);
        savings += savingperMonth;
        month++;
      }
      return new int[] { --month, (int) Math.round((startPriceOldD + savings) - startPriceNewD) };
    }
  }