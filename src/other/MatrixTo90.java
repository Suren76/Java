package other;

import java.util.Arrays;

public class MatrixTo90 {
    public static void main(String[] args) {
        int[][][] matrixN = {
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {1, 1, 1, 1, 1},
                        {2, 2, 2, 2, 2},
                        {3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4},
                        {5, 5, 5, 5, 5}
                },
                {
                        {11, 12, 13, 14},
                        {21, 22, 23, 24},
                        {31, 32, 33, 34},
                        {41, 42, 43, 44}
                },
                {
                        {15, 43, 96, 68},
                        {76, 16, 63, 18},
                        {46, 75, 62, 72},
                        {38, 43, 66, 56}
                }

        };
        for (int[][] matrix: matrixN) {
            System.out.println("\n");

            for (int[] arr : matrix) System.out.println(Arrays.toString(arr));
            System.out.println();

            matrix = matrixTo90(matrix);
            for (int[] arr : matrix) System.out.println(Arrays.toString(arr));

        }
    }

    static int[][] matrixTo90(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i, temp; j < matrix.length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
            for (int j = 0, temp; j < matrix.length/2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-(1+j)];
                matrix[i][matrix.length-(1+j)] = temp;
            }

        }

        return matrix;
    }
}
