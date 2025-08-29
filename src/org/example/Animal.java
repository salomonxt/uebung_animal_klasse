package org.example;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String makeNoise() {
        return "Animal sounds";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args)
    {
        System.out.println();
        
    }
    }




