//https://leetcode.com/problems/decompress-run-length-encoded-list/

package LeetCode.Arrays_q;

import java.util.Arrays;

public class decompress_runlength {
    public static void main(String[] args) {
       int[] nums = {1,1,2,3};
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }

        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        System.out.println(Arrays.toString(result));
    }
}







                                            //not so efficient
       /*
       int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0){
                count += nums[i];
            }
        }
        int[] ans = new int[count];
        int var = 0;
        int k = 0;
        int i = 0;
        while( i < nums.length-1){
            int j = i + 1;
            if (nums[i] != var) {
                ans[k] = nums[j];
                var++;
                k++;
            } else {
                var = 0;
                i = i+2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
*/