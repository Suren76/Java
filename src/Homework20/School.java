package Homework20;

public class School {
    public static void main(String[] args) {
        Teacher person1 = new Teacher("Areg", "Poxosyan", 80000);
        Teacher person2 = new HeadTeacher("Arega", "Poxosyan", 80000, 1.7f);
        Teacher person3 = new SchoolDirector("Karen", "Muradyan", 80000);

//        Teacher person3 = new Teacher("Karen", "Muradyan", 80000);
//        person3 = new SchoolDirector(person3);

        System.out.printf("Teacher %s, Headteacher %s, School director %s", person1.getSalary(), person2.getSalary(), person3.getSalary());


    }
}
