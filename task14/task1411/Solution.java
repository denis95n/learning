package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while(true)
        {
            //создаем объект, пункт 2
            key = reader.readLine();
            if (key.equals(Keys.USER.key)){
                person = new Person.User();
            } else if (key.equals(Keys.LOSER.key)){
                person = new Person.Loser();
            } else if (key.equals(Keys.CODER.key)){
                person = new Person.Coder();
            } else if (key.equals(Keys.PROGER.key)){
                person = new Person.Proger();
            } else break;

                doWork(person); //вызываем doWork
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User){
            ((Person.User) person).live();
        } else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        } else if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
    }

    public enum Keys{
        USER ("user"),
        LOSER ("loser"),
        CODER ("coder"),
        PROGER ("proger");

        public String key;

        Keys(String key){
            this.key = key;
        }
    }
}
