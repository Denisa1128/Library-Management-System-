package com.itschool.library.utils.exam_recap;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice"); //0
        names.add("Joe");//1
        names.add("Bob");//2

        for (int index = 0; index < names.size(); index++) {
            System.out.println(names.get(index));
        }
    }
}
