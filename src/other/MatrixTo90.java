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
                }

        };

        int[][] matrix = matrixN[1];

        for (int i = 0; i < matrix.length; i++) {
            if (i == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][(matrix[i].length - 1) - j] = matrix[j][i];
                }
                continue;
            }
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrix[i - 1][j] + 1;
            }

        }


        for (int[] arr : matrix) System.out.println(Arrays.toString(arr));
    }
}
