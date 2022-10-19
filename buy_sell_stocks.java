//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan&id=data-structure-i

package LeetCode.Arrays_q;

import java.util.Arrays;

public class buy_sell_stocks {
    public static void main(String[] args) {
        int[] prices = {3, 3};
        System.out.println(sell_stock(prices));
    }

    static int sell_stock(int[] prices) {
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {

            if (min < prices[i])
                max = Math.max(prices[i] - min, max);
            else
                min = prices[i];
        }
        return max;
    }
}





                                        //not so efficient
        /*
        int[] clone = prices.clone();
        Arrays.sort(clone);
        int min = clone[0];
        int i = 0;
        int j = 1;
        int temp = 0;
        while (i < prices.length-1 && j < prices.length){
            if (prices[i] == min && prices[j] >= min) {
                if (temp < prices[j]) {
                    temp = prices[j] - min;
                }
                j++;
            }
            else if(prices[i] != min){
                i++;
                j++;
            }
        }
        return temp;
    }
}*/
