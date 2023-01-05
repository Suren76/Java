import java.util.Scanner;


public class Homework_4part1 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.println("եռանկյուն : " + ((a + b > c) && (a + c > b) && (b + c > a)));

        //    ձեր ուզած տարբեակը, երևի
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("եռանկյուն կդառնա");
        }
        else {
            System.out.println("եռանկյուն չի դառնա");
        }

    }
}
