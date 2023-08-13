package com.leonelvalora;

import com.leonelvalora.diabolical_square.DiabolicalSquare;
import com.leonelvalora.kaprekars_constant.KaprekarsContant;

import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
//            List<Integer> result = KaprekarsContant.routine(56);
//            result.forEach(System.out::println);
            int[][] square = {{4, 5, 16, 9}, {14, 11, 2, 7}, {1, 8, 13, 12}, {15, 10, 3, 6}};

            boolean result = DiabolicalSquare.isDiabolical(square);
            int magicConstact = DiabolicalSquare.getMagicConstant();

            System.out.println(result + " " + magicConstact);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}