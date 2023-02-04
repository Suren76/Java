package Homework10;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class GetWordCountInString {
    public static void main(String[] args){
        System.out.println(wordCount("gvbdjbn ad vhav ad fdjn ad string","ad"));
        System.out.println(stringCount("gvbdjbn ad vhav ad fdjn ad string"));
    }

    static int wordCount(String text, String word){
        if (text.length() == 0 || word.length() == 0) return -2;
        int count = 0;
        for (String wordToCompare:text.split(" ")) if (wordToCompare.equals(word)) count++;
        return count==0 ? -1: count;
    }

    static int stringCount(String text){
        if (text.length() == 0) return -2;
        int count = 0;
        for (String wordToCompare:text.split(" ")) if (wordToCompare.equals("string")) count++;
        return count==0 ? -1: count;
    }
}