package com.company;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<City> citySet = new HashSet<>();

        citySet.add(new City("Bishkek", 1, 160));
        citySet.add(new City("Osh", 2, 180));
        citySet.add(new City("Batken", 3, 51.8));
        citySet.add(new City("Jalal-Abad", 4, 24.6));
        citySet.add(new City("Naryn", 5, 40.51));
        citySet.add(new City("Kara-Suu", 6, 38.7));
        citySet.add(new City("Talas", 7, 13));
        citySet.add(new City("Tokmok", 8, 55.35));
        citySet.add(new City("Kara-kol", 9, 48.5));

        Set<City> cityCodechet = new TreeSet<>(citySet);
        Set<City> cityCodeNeChetn = new TreeSet<>(citySet);

        System.out.println("-------------Nechetnye goroda------------------");

        for (City city1 : cityCodechet) {
            if (city1.getCode() % 2 != 0) {
                cityCodechet.add(city1);
                System.out.println(city1);
            }
        }
        System.out.println("-------------Chetnye goroda------------------");
        for (City city2 : cityCodeNeChetn) {
            if (city2.getCode() % 2 != 1) {
                cityCodeNeChetn.add(city2);
                System.out.println(city2);
            }}
            System.out.println("-------------Nechetnye goroda cherez stream------------------");
            citySet.stream().filter(x->x.getCode()%2==1).sorted().forEach(System.out::println);// задача через stream

        System.out.println("-------------Chetnye goroda cherez stream------------------");
        citySet.stream().filter(x->x.getCode()%2==0).sorted().forEach(System.out::println);// задача через stream

    }
}
