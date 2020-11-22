package day10.LV1;

public class BestPractice {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
      }
}
