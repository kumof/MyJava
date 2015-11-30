package com.fomuk;

public class Cat {
    int age;
    String breed;
    String name;

    void  say(){
        System.out.println("Miau!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
