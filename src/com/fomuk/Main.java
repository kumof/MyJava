package com.fomuk;

import com.fomuk.devcat.Cat;
import com.fomuk.devpeople.People;

public class Main {

    static Cat cat = new Cat();
    static People people=new People();

    public static void main(String[] args) {
        cat.setName("Barsic");
        cat.setBreed("Buldog");
        cat.setAge(5);

        people.setName("Andrew");
        people.setLastName("Fomuk");
        people.setAge(43);
        people.setCat(cat);

        System.out.println(people);
        cat.say();
        people.getCat().say();

    }
}
