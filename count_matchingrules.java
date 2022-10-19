package LeetCode;

import java.util.ArrayList;

public class count_matchingrules {
    public static void main(String[] args) {
        //items[i] = [typei, colori, namei]
        /*      ruleKey == "type" and ruleValue == typei.
                ruleKey == "color" and ruleValue == colori.
                ruleKey == "name" and ruleValue == namei.

        */
        String[][] items = {
                {"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}
        };
        String ruleKey = "type";
        String ruleValue = "phone";
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (ruleKey.equals("type")) {
                if (items[i][0].equals(ruleValue)) {
                    count++;
                }
            } else if (ruleKey.equals("color")) {
                if (items[i][1].equals(ruleValue)) {
                    count++;
                }
            } else if (ruleKey.equals("name")) {
                if (items[i][2].equals(ruleValue)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}



