package day08.LV1;

public class BestParcie {
    public static String tripleTrouble(String s1, String s2, String s3) {
        StringBuilder sb = new StringBuilder(s1.length()*3);
        for (int i=0; i<s1.length(); i++) {
          sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
        }
        return sb.toString();
      }
}
