package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat {
        private static String name;

        public static String getName(){
           return name;
       }

       public static Cat getChild(){
            return new Cat();
       }
    }

    public static class Dog {
        private static String name;

        public static String getName(){
            return name;
        }

        public static Dog getChild(){
            return new Dog();
        }
    }

}
