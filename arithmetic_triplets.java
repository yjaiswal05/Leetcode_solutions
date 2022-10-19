//https://leetcode.com/problems/number-of-arithmetic-triplets/

package LeetCode.Arrays_q;

import java.util.HashSet;

public class arithmetic_triplets {
    public static void main(String[] args) {
      int[] nums = {0,1,4,6,7,10};
      int diff = 3;
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count = 0;
        for(int i : set) {
            int j = i+diff;
            if (set.contains(j) && set.contains((j + diff))){
                count++;
            }
        }
        System.out.println(count);
    }
}
