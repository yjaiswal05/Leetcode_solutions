//https://leetcode.com/problems/build-array-from-permutation/
package LeetCode;

import java.util.Arrays;

public class array_from_permu {
    public static void main(String[] args) {
        int[] arr  = {0,2,1,5,3,4};
        int[] ans = new int[arr.length] ; // making an array of same length as above
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];           // putting elements of arr in ans
            System.out.print(ans[i] + " ");
        }
    }
}

