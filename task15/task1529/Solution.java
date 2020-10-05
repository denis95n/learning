package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    static {
        reset();
        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String key = reader.readLine();

            if (key.equals(FlyAparat.HELICOPTER.getKey())){
                result = new Helicopter();
            } else if (key.equals(FlyAparat.PLANE.getKey())){
                result = new Plane(5);
            }

            reader.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public enum FlyAparat{
        HELICOPTER ("helicopter"),
        PLANE ("plane");

        private String key;

        FlyAparat(String key){
            this.key = key;
        }

        public String getKey() {
            return key;
        }
    }
}
