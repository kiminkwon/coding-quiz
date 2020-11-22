package day10.LV2;

import java.util.*;

public class BestPractice {
    public static String numericals(String s) {
        StringBuilder ret = new StringBuilder();
        Map<String,Integer> map = new HashMap<>();
        for (String c : s.split("")) {
          map.put(c, 1 + map.getOrDefault(c,0));
          ret.append(map.get(c));
        }
        return ret.toString();
      }
}
