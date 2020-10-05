package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //double numDouble1 = Math.abs(Double.parseDouble(reader.readLine()));
        //double numDouble2 = Math.abs(Double.parseDouble(reader.readLine()));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        int divNum = 0;

        if ((num1 > 0) && (num2 > 0)) {

            for (int i = Math.min(num1, num2); i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    divNum = i;
                    break;
                }
            }

            System.out.println(divNum);

        } else {
            throw new Exception();
        }
    }
}
