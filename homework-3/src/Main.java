public class Main {
    public static void main(String[] args) {
        // ######################  part 1  ########################################
        int x = 45;
        int y = 5;

        System.out.println(x/y*1.0 == x/(y*1.0));


        // ######################  part 2  ########################################
        int a = 51;
        int b = 62;
        int c = 73;
        int d = 91;
        int e = 82;
        int f = 43;

        System.out.println((int) ((a+b+c*1.0)/3+(d+e+f*1.0)/3));


        // ######################  part 3  ########################################
        double n = 63.406;

        System.out.println(n%1);
        System.out.println(n-((int) n));
        // 3.2
        System.out.println(n*1000%1000/1000);


    }
}