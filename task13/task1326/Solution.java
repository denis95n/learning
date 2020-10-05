package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        FileInputStream inputStream = new FileInputStream(path);
        //FileInputStream inputStream = new FileInputStream("C:\\\\Users\\\\Денис\\\\Desktop\\\\file.txt");
        Scanner scan = new Scanner(inputStream);

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scan.hasNext()){
            int data = Integer.parseInt(scan.next());
            if (data%2 == 0) {
                arrayList.add(data);
            }
        }

        Collections.sort(arrayList);
        for(int num: arrayList) {
            System.out.println(num);
        }
        inputStream.close();
        scan.close();
    }
}
