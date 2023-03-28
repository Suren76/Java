package Homework20;

class Teacher {
    private String name;
    private String surname;
    private int salary;

    Teacher (String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    int getSalary() {
        return this.salary;
    }

    String getName() {
        return this.name;
    }

    String getSurname() {
        return this.surname;
    }

}
