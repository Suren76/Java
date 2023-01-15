package Homework7;

public class printFirstLast {
    public static void main(String[] args) {
        int[][] array = {
                {5,6,7,3,55,21,5,7},
                {55,21,5,7,35,6,47,4},
                {4,8,2,1,59,32,18,16}};

        for (int[] tempArray: array) {
            System.out.println(tempArray[0]+" "+tempArray[tempArray.length-1]);
        }
    }
}
