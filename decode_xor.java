//https://leetcode.com/problems/decode-xored-array/

package LeetCode.Arrays_q;

import java.util.Arrays;

public class decode_xor {
    public static void main(String[] args) {
       int[] encoded = {1,2,3};
       int first = 1;
       int[] arr = new int[encoded.length+1];
       //arr[i+1], then arr[i+1] = encoded[i] XOR arr[i]
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i+1] = encoded[i] ^ arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
