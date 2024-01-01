package com.Strings;

public class RemoveVowels {
    public static void main(String[] args) {
        String string = "youcandoit";
        String output = removeVowels(string);
        System.out.println(output);
    }

    public static String removeVowels(String string) {
        String res = "";
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char word = string.charAt(i);
            if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
                res += "";
            } else {
                res += word;
            }
        }
        return res;
    }
}
