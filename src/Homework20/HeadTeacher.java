package Homework20;

class HeadTeacher extends Teacher {
    HeadTeacher(String name, String surname, int salary, float coefficient) {
        super(name, surname, coefficient >= 1.5f || coefficient <= 2f? ((int) (salary*coefficient)): salary);
        if (!(coefficient >= 1.5 || coefficient <= 2)) { System.exit(1); }
    }
}
