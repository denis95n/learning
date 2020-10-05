package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] mas = new int[4];
            int num = mas[5];

        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();

        } catch (IOException e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException ();

        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }

        try {
            throw new RuntimeException();

        } catch (RuntimeException e) {
            exceptions.add(e);
        }

        try {
            throw new IndexOutOfBoundsException();

        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            throw new NumberFormatException();

        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            throw new ClassCastException();

        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayStoreException();

        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            throw new NegativeArraySizeException();

        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
