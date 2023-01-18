package Homework7;

public class extraHomework_binToDecimal {
    public static void main(String[] args) {
        int[] binArray = {1,0,1,0,0,1,1,1,0};
        int numDecimal = 0;
        // v1
        for (int i = 0; i < binArray.length; i++) {
            numDecimal += Math.pow(2,i) * binArray[binArray.length-(i+1)];
            System.out.println(binArray[i]+" "+Math.pow(2,i)+" "+numDecimal);
        }

        System.out.println(numDecimal);

        // v2
        numDecimal = 0;

        for (int i = 0; i < binArray.length; i++) {
            int numDecimalTemp = 0;
            for (int j = 0; j < i; j++){
                numDecimalTemp = numDecimalTemp==0?2:numDecimalTemp*2;
            }
            numDecimal += numDecimalTemp * binArray[binArray.length-(i+1)];
        }

        System.out.println(numDecimal);
    }
}
