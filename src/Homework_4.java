import java.util.Scanner;


public class Homework_4 {
    public static void main(String[] args) {
        System.out.println("Homework_4");

        int a, b, c;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.println("եռանկյուն : " + ((a + b > c) && (a + c > b) && (b + c > a)));

        System.out.println("Input range: 1-12");
        int number = input.nextInt();

        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(number + ", " + 31);
                break;

            case 2:
                System.out.println(number + ", " + 28);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(number + ", " + 30);
                break;

            default:
                System.out.println("Մեծարգո օգտատեր ձեզ տրվել էր արջեքային սահմանափակում այդ իսկ պատճառով \n  իդի գուդի բիգուդի");
        }
    }
}
