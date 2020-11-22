package day07.LV1;

public class BestPractice2 {
    public static String getMiddle(String word) {
        String s = "";
        int length = word.length();
        int half = length/2;
    
        if (length % 2 == 0) {
          
          s = word.substring(half - 1, half + 1);
          
        } else {
          
          s = word.substring(half, half + 1);
        
        }
        
        return s;
      }
}
