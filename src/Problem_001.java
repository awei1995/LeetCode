import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Problem_001 {
    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int target = 9;
        Solution Sol = new Solution();
        System.out.println(Arrays.toString(Sol.twoSum(input, target)));
    }
}

/**
 * HashMap
 */
class Solution {
    int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            hashmap.put(nums[i], i); //Key-Value
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashmap.containsKey(complement) && hashmap.get(complement) != i){
                return new int[] {i, hashmap.get(complement)};
            }
        }
        throw new IllegalArgumentException("No Solution");
    }
}



/**
 *  Brute Force
 */
/*class Solution {
    int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if ( nums[j] == complement) {
                    return new int[] { i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Solution");
    }
}*/

