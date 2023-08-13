package com.leonelvalora.diabolical_square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DiabolicalSquare {
    private static int magicConstat = 0;
    private static ArrayList square = new ArrayList();

    public static boolean isEsoteric() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        return true;
    }

    public static boolean isDiabolical(int[][] square) {
        // Calculate the sum of the main diagonals
        int rightMainDiagonalSum = 0;
        int leftMainDiagonalSum = 0;

        for (int i = 0, j = (square.length - 1); i < square.length; i++, j--) {
            rightMainDiagonalSum += square[i][i];
            leftMainDiagonalSum += square[i][j];
        }

        // Calculate the sum of each row, column, and check if they match the main diagonal sum
        int rowSum = 0;
        int colSum = 0;
        for (int i = 0; i < square.length; i++) {

            rowSum = 0;
            colSum = 0;

            for (int j = 0; j < square.length; j++) {
                rowSum += square[i][j];
                colSum += square[j][i];
            }

            if(rowSum != colSum || colSum != rightMainDiagonalSum || rightMainDiagonalSum != leftMainDiagonalSum){
                magicConstat = 0;
                return false;
            }

        }

        magicConstat = colSum;

        return true;
    }

    public static int[][] read(int size) {
        Scanner scanner = new Scanner(System.in);

        int[][] square = new int[size][size];
        int squareArea = size * size;
        int row = 0;
        int col = 0;


        System.out.println("Enter number(s)");

        while (squareArea > 0) {
            String input = scanner.next();
            String[] numbers = input.split("\\s+");

            // Use filter to remove non-numeric values and collect the parsed doubles
            int[] parsedNumbers = Arrays.stream(numbers)
                    .filter(s -> s.matches("-?\\d+")) // Regular expression for numbers
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int number : parsedNumbers) {
                square[row][col] = number;
                col++;

                if (col >= size) {
                    col = 0;
                    row++;
                }

                squareArea--;

                if (squareArea == 0) {
                    break;
                }
            }
        }

        scanner.close();
        return square;

    }

    public static int getMagicConstant() {
        return magicConstat;
    }
}
