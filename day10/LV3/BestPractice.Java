import java.util.*;
import java.util.stream.Collectors;

public class Mixing {
    public static String mix(String s1, String s2) {
    
        List<String> finalStr = new ArrayList();

        for (char c = 'a'; c <= 'z'; c++) {
            String s1_char = s1.replaceAll("[^"+c+"]+","");
            String s2_char = s2.replaceAll("[^"+c+"]+","");

            int s1_length = s1_char.length();
            int s2_length = s2_char.length();

            if(s1_length>1 || s2_length>1){
                if(s1_length == s2_length){
                    finalStr.add("=:"+s1_char);
                }
                if(s1_length>s2_length){
                    finalStr.add("1:"+s1_char);
                }
                if(s1_length<s2_length){
                    finalStr.add("2:"+s2_char);
                }
            }
        }
        Comparator<String> length = (x,y) -> y.length()-x.length();
        Comparator<String> type_value = (x,y) -> Character.compare(x.charAt(0),y.charAt(0));

        return finalStr.stream().sorted(length.thenComparing(type_value)).collect(Collectors.joining("/"));
    }

}