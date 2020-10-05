package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        String input = "";
        while (!input.equals("exit")){
            input = reader.readLine();
            writer.write(input + "\n");
        }

        writer.close();
        reader.close();
    }
}
