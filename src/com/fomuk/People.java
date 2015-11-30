package com.fomuk;

public class People {
    String name;
    String lastName;
    int age;

    Cat cat;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                '}';
    }
}

