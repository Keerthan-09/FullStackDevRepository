package com.gentech.practice;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class CallByreference {
    public static void main(String[] args) {
        Person p = new Person("Krishna");
        System.out.println(p.name);
        modifyPerson(p);
        System.out.println(p.name); // Output: Radha
    }

    public static void modifyPerson(Person person) {
        person.name = "Radha"; // This change affects the original object
    }
}


