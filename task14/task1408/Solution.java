package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        //Hen hen = HenFactory.getHen(Country.BELARUS);
        Hen hen = HenFactory.getHen(Country.RUSSIA);
        System.out.println(hen.getDescription());
        //Hen hen = HenFactory.getHen(Country.MOLDOVA);
        //Hen hen = HenFactory.getHen(Country.UKRAINE);

        /*if (hen instanceof BelarusianHen) {
            System.out.println(((BelarusianHen) hen).getDescription());
        } else if (hen instanceof RussianHen) {
            System.out.println(((RussianHen) hen).getDescription());
        } else if (hen instanceof MoldovanHen) {
            System.out.println(((MoldovanHen) hen).getDescription());
        } else if (hen instanceof UkrainianHen) {
            System.out.println(((UkrainianHen) hen).getDescription());
        }*/
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;

            if (country.equals(Country.RUSSIA)){
                hen = new RussianHen();
            } else if (country.equals(Country.UKRAINE)){
                hen = new UkrainianHen();
            } else if (country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
            } else if (country.equals(Country.BELARUS)){
                hen = new BelarusianHen();
            }
            //напишите тут ваш код
            return hen;
        }
    }
}
