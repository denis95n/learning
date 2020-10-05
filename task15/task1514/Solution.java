package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(5.6, "L");
        labels.put(6.6, "L");
        labels.put(7.6, "L");
        labels.put(8.6, "L");
        labels.put(9.6, "L");
    }
}
