package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    public static void main(String[] args) {
        System.out.println(cat);
    }

    public static class Cat{
        public String name;

        static {
            cat = new Cat();
            cat.name = "Barsik";
            System.out.println(cat.name);
        }
    }
}
