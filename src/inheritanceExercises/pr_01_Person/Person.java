package com.company.pr_01_Person;

/**
 * Created by Typer on 11/9/2016.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    protected void setAge(int age) {
        if (age < 1){
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.length() < 3){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s, Age: %d",this.name, this.age));
        return sb.toString();
    }
}
