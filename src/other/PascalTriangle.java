package other;

import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args){
        long[][] triangle = buildPascalTriangleNotFormula(88);
//        int[][] triangle = buildPascalTriangle(8);

        for (int i = 0; i < triangle.length; i++) System.out.println(" ".repeat((triangle.length-i)+(triangle.length-i)/2)+Arrays.toString(triangle[i]));
    }
    
    static long[][] buildPascalTriangleNotFormula(int n){
        long[][] array = new long[n][];
        for (int i = 0; i < n; i++) {
            array[i] = new long[i+1];

            for (int j = 0; j <= (i/2); j++) {
                if (i == 0 || j ==0){
                    array[i][j] = 1;
                    array[i][i] = 1;
                    continue;
                }
                array[i][j]= array[i-1][j]+ array[i-1][j-1];
                array[i][i-j] = array[i-1][j]+ array[i-1][j-1];
            }
        }

        return array;
    }

    static int[][] buildPascalTriangle(int n){
        int[][] array = new int[n][];

        for (int i = 0; i < n; i++) {
            array[i] = new int[i+1];
            for (int j = 0; j <= (i/2); j++) {
                array[i][j] = combination(i, j);
                array[i][i-j] = combination(i, j);
            }
        }

        return array;
    }

    static int combination(int a, int b){
        return factorial(a)/(factorial(b)*factorial((a-b)));
    }

    static int factorial(int n) {
        int tempN = 1;
        for (int i = 2; i <= n; i++) tempN *= i;
        return tempN;
    }
}
