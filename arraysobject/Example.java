package com.arraysobject;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Example {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 20)
        };

        System.out.println("Original Array: " + Arrays.toString(persons));

        // Sort the array in ascending order by age
        Arrays.sort(persons, (o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println("Sorted in ascending order by age: " + Arrays.toString(persons));
        
        // Sort the array in descending order by age
        Arrays.sort(persons, (o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println("Sorted in descending order by age: " + Arrays.toString(persons));
        
        // Sort the array in ascending order by age and name
        Arrays.sort(persons, Comparator.comparing(Person::getAge)
                               .thenComparing(Person::getName));
        System.out.println("Sorted in ascending order by age and then name: " + Arrays.toString(persons));
        
        // Sort the array in descending order by age
        Arrays.sort(persons, Comparator.comparing(Person::getAge, Comparator.reverseOrder()));
        System.out.println("Sorted in descending order by age: " + Arrays.toString(persons));
    }
}
