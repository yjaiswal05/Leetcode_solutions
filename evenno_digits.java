//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package LeetCode;

public class evenno_digits {
    public static void main(String[] args) {
        int[] arr = {437,315,322,431,686,264,442};
        int count = 0;
        int fi = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != 0){
                arr[i] = arr[i] / 10;
            count++;
        }
            if (count%2 ==0)
                fi++;
            count = 0;
        }
        System.out.println(fi);
    }
}
