import java.util.List;
import java.util.HashSet;

public class Solution {
    public static int solve(final List<List<Integer>> data) {
        int tot = 1;
        for (List<Integer> l:data) {
            tot *= new HashSet<>(l).size();
        }
        return tot;
    }
}