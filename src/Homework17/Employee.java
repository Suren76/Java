package Homework17;

class Employee extends Person {
    private String specialization;
    private String salary;

    Employee(String name, String surname, int age, String address, String phoneNumber, String specialization, String salary) {
        super(name, surname, age, address, phoneNumber);
        this.specialization = specialization;
        this.salary = salary;
    }
}
