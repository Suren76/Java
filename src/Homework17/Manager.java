package Homework17;

class Manager extends Employee {
    private String department;

    Manager(String name, String surname, int age, String address, String phoneNumber, String specialization, String salary, String department) {
        super(name, surname, age, address, phoneNumber, specialization, salary);
        this.department = department;
    }
}
