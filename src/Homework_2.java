public class Homework_2 {
    public static void main(String[] args) {

        System.out.println("Part 1"); // ################################### part 1 ####################################
        int c;
        int a = 5;
        int b = 15;

        c = a*a + b*b;
        System.out.print("Var: c \nvalue: " + c);
        System.out.println("\n\n");



        System.out.println("Part 2"); // ################################### part 2 ####################################
        double S;
        a = 2;
        b = 8;
        c = 5;

        S = (b+a)/2.0 * c;
        System.out.println("S: "+S);
        System.out.println("\n\n");



        System.out.println("Part 3"); // ################################### part 3 ####################################
        int n = 354;

        System.out.println(n/100%10);
        System.out.println(n/10%10);
        System.out.println(n%10);


    }
}