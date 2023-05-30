package Homework26;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("456 465 010 120 301 559"));
        System.out.println(reverseWords("abc derf ggff").equals("cba fred ffgg"));
    }

    static String reverseWords (String text) {
        for (String word: text.split(" ")) {
            text = text.split(" ")[0].equals(word)? reverseWord(word): text+" "+reverseWord(word);
        }
        return text;
    }

    private static String reverseWord(String word){
        for (String ch : (" "+word).split("")) {
            word = ch + word;
        }
        return word.split(" ")[0];
    }
}
