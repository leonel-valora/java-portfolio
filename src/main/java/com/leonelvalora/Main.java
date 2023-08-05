package com.leonelvalora;

import com.leonelvalora.kaprekars_constant.KaprekarsContant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            //KaprekarsContant.read();
            List<Integer> result = KaprekarsContant.routine(56);
            result.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}