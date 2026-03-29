package com.mokshith.oops;

class Employee3 {
    private String name;
    private int id;

    static int counter = 1000;

    Employee3(String name) {
        this.name = name;
        counter++;
        id = counter;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

public class EmployeeIDGenerator {
    public static void main(String[] args) {

        Employee3 e1 = new Employee3("Rahul");
        Employee3 e2 = new Employee3("Priya");
        Employee3 e3 = new Employee3("Arjun");

        e1.display();
        System.out.println("-----");
        e2.display();
        System.out.println("-----");
        e3.display();
    }
}