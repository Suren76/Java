package Homework11;


import java.util.Arrays;

public class AsciiOfCharArray {
    public static void main(String[] args){
        char[] arrayOfChars = {'s','t','r'};

        System.out.println(Arrays.toString(convertToAscii(arrayOfChars)));
        System.out.println(Arrays.toString(convertToChar(convertToAscii(arrayOfChars))));
    }

    static int[] convertToAscii(char[] array) {
        int[] asciiCodeArray = new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            asciiCodeArray[i] = array[i];
        }

        return asciiCodeArray;
    }

    static char[] convertToChar(int[] array) {
        char[] charsArray = new char[array.length];

        for (int i = 0; i < array.length ; i++) {
            charsArray[i] = (char) array[i];
        }

        return charsArray;
    }
}
