package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

        inputStream.close();
        reader.close();
        scanner.close();
    }
}