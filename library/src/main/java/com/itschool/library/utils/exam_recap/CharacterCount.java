package com.itschool.library.utils.exam_recap;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "Hello Word"; // input.toCharArray = { 'H' , 'e','l','l'....}
        char character = 'l';

        int count = 0;
        for (char ch : input.toCharArray()) {
            if (ch == character) {
                count++;
            }
        }
        System.out.println("Occurrences: " + count);
    }
}
