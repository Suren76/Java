package Homework20;

class SchoolDirector extends Teacher {
    SchoolDirector (String name, String surname, int salary) {
        super(name, surname, salary);
    }

    SchoolDirector (Teacher obj) {
        super(obj.getName(), obj.getSurname(), obj.getSalary());
    }
}
