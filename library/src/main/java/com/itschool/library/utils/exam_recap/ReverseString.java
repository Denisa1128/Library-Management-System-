package com.itschool.library.utils.exam_recap;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed string: " + reversed);

    }
}
