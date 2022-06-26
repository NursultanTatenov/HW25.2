package com.company;

import java.util.Comparator;

public class City implements Comparable<City>{

    String name;
    int code;
    double area;

    public City(String name, int code, double area) {
        this.name = name;
        this.code = code;
        this.area = area;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", area=" + area +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return this.getCode()-o.code;

    }

}
