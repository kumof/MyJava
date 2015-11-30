package com.fomuk;

public class Main {

    static  Cat cat = new Cat();
    static People people=new People();

    public static void main(String[] args) {
        cat.name="Barsic";
        cat.breed="Buldog";
        cat.age=5;

        people.name="Andrew";
        people.lastName="Fomuk";
        people.age=43;
        people.cat=cat;

        System.out.println(people);
        cat.say();
        people.cat.say();

    }
}
