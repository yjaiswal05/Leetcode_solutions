//https://leetcode.com/problems/concatenation-of-array/
package LeetCode;

import java.util.Arrays;

public class array_concatenation {
    public static void main(String[] args) {
        int [] arr = {1,3,2,1};
        int [] dob = new int[2 * (arr.length)];

        //Method 1
        /*int i = 0;
        int j = 0;
        while (i < arr.length){
            dob[i] = arr[i];
            i++;
        }
        while(j < arr.length) {
                dob[j + (arr.length)] = arr[j];
                j++;
        }*/

        //Method 2
        for (int i =0 ; i<arr.length; i++){
            dob[i] = arr[i];
            dob[i+arr.length]= arr[i];
        }
        System.out.println(Arrays.toString(dob));
    }
}
