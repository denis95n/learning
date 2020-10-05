package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();

        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                int numSeconds2 = numSeconds;
                Thread current = Thread.currentThread();
                while (!current.isInterrupted()) {
                    while (numSeconds > 0) {
                        System.out.print(numSeconds + " ");
                        numSeconds--;
//                        if ((double) numSeconds2 > 3.5 && numSeconds == 0)
//                            System.out.print("Прервано!" + "\n");

                        Thread.sleep(1000);

                        //if (current.isInterrupted()) System.out.print("Прервано!" + "\n");
                    }
                }
                System.out.print("Марш!" + "\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //add your code here - добавь код тут
        }
    }
}

