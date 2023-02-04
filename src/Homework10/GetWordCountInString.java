package Homework10;

public class GetWordCountInString {
    public static void main(String[] args){
        System.out.println(wordCount("gvbdjbn_ad_vhav_ad_fdjn_ad_string","ad"));
    }

    static int wordCount(String text, String word){
        if (text.length() == 0 || word.length() == 0) return -2;
        if (!text.contains(word)) return -1;
        return (text.length() - text.replace(word,"").length())/word.length();
    }

    static int stringCount(String text){
        if (text.length() == 0) return -2;
        if (!text.contains("string")) return -1;
        return (text.length() - text.replace("string","").length())/"string".length();
    }
}
