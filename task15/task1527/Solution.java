package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        char[] charArr = url.toCharArray();
        ArrayList<String> paramArr = new ArrayList<>();
        ArrayList<String> paramArrParse = new ArrayList<>();
        ArrayList<String> paramObj = new ArrayList<>();
        StringBuilder param = new StringBuilder();
        StringBuilder paramObjStr = new StringBuilder();
        boolean paramStart = false;
        boolean noNum = true;
        boolean haveObj = false;
        boolean isNum = true;
        boolean toNextObj = true;

        for(char ch : charArr){

            if (paramStart){
                if (ch == '&'){
                    paramArr.add(param.toString());
                    param = new StringBuilder();
                } else param.append(ch);
            }

            if (ch == '?'){
                paramStart = true;
            }
        }
        paramArr.add(param.toString());
        param = new StringBuilder();

        for(String str : paramArr){
            charArr = str.toCharArray();
            for(char ch : charArr) {

                if (!haveObj) {
                    if (Character.isLetter(ch)) {
                        param.append(ch);
                    } else {
                        paramArrParse.add(param.toString());
                        if (!param.toString().equals("obj")) {
                            param = new StringBuilder();
                            break;
                        }
                        noNum = true;

                        if (param.toString().equals("obj")) {
                            haveObj = true;
                        }
                    }
                }
                if (ch != '=' && haveObj) {
                    paramObjStr.append(ch);
                }

            }

            if (!noNum){
                if (param.length() > 0)
                paramArrParse.add(param.toString());
                param = new StringBuilder();
            }

            if (haveObj){
                paramObj.add(paramObjStr.toString());
                paramObjStr = new StringBuilder();
                param = new StringBuilder();
            }

            noNum = false;
            haveObj = false;
            toNextObj = true;
        }

        for (String str : paramArrParse){
            System.out.print(str + " ");
            if (str.equals("obj")){
                haveObj = true;
            }
        }

        if (haveObj) {
            for (String str : paramObj) {
                for (char ch : str.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        isNum = false;
                    }
                }
                if (isNum){
                    System.out.println();
                    alert(Double.parseDouble(str));
                } else {
                    System.out.println();
                    alert(str);
                }
            }
        }
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
