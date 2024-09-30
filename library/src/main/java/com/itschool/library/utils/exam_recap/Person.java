package com.itschool.library.utils.exam_recap;

public class Person {

    private String firstName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Alice");
        person.setAge(27);

        System.out.println(person.getFirstName() + " " + person.getAge());
    }
}