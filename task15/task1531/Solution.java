package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());

        if (input <= 150) {
            System.out.println(factorial(input));
        }

        reader.close();
    }

    public static String factorial(int n) {
        //add your code here
        if (n < 0){
            return "0";
        } else if (n == 0){
            return "1";
        }

        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            BigInteger bigI = BigInteger.valueOf(i);
            factorial = factorial.multiply(bigI);
        }

        return factorial.toString();
    }
}
