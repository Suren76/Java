package Homework17;

class Person {
    String name;
    String surname;
    int age;
    String address;
    String phoneNumber;

    public Person(String name, String surname, int age, String address,String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

}

class Employee extends Person {
    String specialization;
    String salary;

    Employee(String name, String surname, int age, String address,String phoneNumber, String specialization, String salary) {
        super(name, surname, age, address, phoneNumber);
        this.specialization = specialization;
        this.salary = salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, String surname, int age, String address,String phoneNumber, String specialization, String salary, String department) {
        super(name, surname, age, address,phoneNumber, specialization, salary);
        this.department = department;
    }
}

public class Inheritance {
    public static void main(String[] args) {
    }
}
