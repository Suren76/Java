package Homework16;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String words = "Random words in one sentence";
        String[] wordsList = words.split(" ");

        for (int i = 0; i < wordsList.length; i++) {
            char[] arrayOfChars = wordsList[wordsList.length-(i+1)].toCharArray();
            for (int j = 0; j < arrayOfChars.length/2; j++) {
                char temp = arrayOfChars[i];
                arrayOfChars[i] = arrayOfChars[arrayOfChars.length-(i+1)];
                arrayOfChars[arrayOfChars.length-(i+1)] = temp;
            }
            wordsList[wordsList.length-(i+1)] = String.valueOf(arrayOfChars);
        }

        System.out.println(Arrays.toString(wordsList));
    }
}
