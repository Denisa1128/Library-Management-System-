package com.itschool.library.utils.exam_recap;

public class WrapperClass {

    public static void main(String[] args) {
        // integer to string
        Integer number = 100;
        String numberStr = number.toString();
        System.out.println("Integer to String: " + numberStr);

        // String to Integer
        String str = "200";
        Integer strNumber = Integer.parseInt(str);
        System.out.println(" String to Integer: " + strNumber);
    }
}
