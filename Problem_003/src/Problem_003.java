import java.util.HashMap;
import java.util.Map;

public class Problem_003 {
    public static void main(String[] args) {
        String input = "abcabcbb";
        Solution_003 Sol = new Solution_003();
        System.out.println(Sol.lengthOfLongestSubstring(input));
    }

}

class Solution_003 {
    int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0, pointer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                pointer = Math.max(pointer, map.get(s.charAt(i)) + 1);
            }
            res = Math.max(res, i - pointer + 1); //case: one element
            map.put(s.charAt(i), i);
        }
        return res;
    }
}
