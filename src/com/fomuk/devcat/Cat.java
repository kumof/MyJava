package com.fomuk.devcat;

public class Cat {
    private int age;
    private String breed;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  say(){
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
