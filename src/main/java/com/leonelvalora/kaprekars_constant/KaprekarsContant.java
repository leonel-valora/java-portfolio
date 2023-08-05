package com.leonelvalora.kaprekars_constant;

import com.leonelvalora.kaprekars_constant.exceptions.KaprekarsConstantException;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KaprekarsContant {
    static final int VALUE = 6174;

    public static List<Integer> routine(int number) throws KaprekarsConstantException {
        List<Integer> result = new ArrayList<>();

        String strNumber = formatNumber(number);

        validateInput(strNumber); //Exception

        StringBuilder stringBuilder = new StringBuilder();
        int ascNum = 0;
        int descNum = 0;

        do {
            char[] chars = strNumber.toCharArray();
            Arrays.sort(chars);

            stringBuilder.replace(0, stringBuilder.length(), new String(chars));

            ascNum = Integer.parseInt(stringBuilder.toString());
            descNum = Integer.parseInt(stringBuilder.reverse().toString());

            strNumber = formatNumber(descNum - ascNum);

            result.add(Integer.parseInt(strNumber));

        } while (Integer.parseInt(strNumber) != VALUE);

        return result;
    }

    private static String formatNumber(int number) {
        return String.format("%1$4s", number)
                .replace(' ', '0');
    }

    private static void validateInput(String number) throws KaprekarsConstantException {
        if( !Pattern.matches("\\d+", number))
            throw new KaprekarsConstantException("La entrada debe ser un numero");
        else if(number.length() > 4)
            throw new KaprekarsConstantException("El numero debe contener solo 4 digitos");
        else if(number.chars().distinct().count() < 2)
            throw new KaprekarsConstantException("El numero debe contener al menos dos digitos diferentes");
    }
}
