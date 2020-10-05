package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
        threads.get(0).start();
        threads.get(1).start();
        threads.get(2).start();
        threads.get(3).start();
        threads.get(4).start();

    }

    public static class Thread1 extends Thread{

        @Override
        public void run() {
            while (true){

            }
        }
    }

    public static class Thread2 extends Thread{

        @Override
        public void run() {
            try{
                while(true){
                    throw new InterruptedException();
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread{

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    sleep(500);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static class Thread4 extends Thread implements Message{

        @Override
        public void run() {
                while (!isInterrupted()) {
                }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class Thread5 extends Thread{

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String str = "";
                int sum = 0;
                while (!str.equals("N")){
                    str = reader.readLine();
                    if (!Character.isLetter(str.charAt(0)))
                    sum += Integer.parseInt(str);
                }
                System.out.println(sum);
                reader.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}