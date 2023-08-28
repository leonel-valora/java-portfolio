package com.leonelvalora.challenges;

public class EquationSolutionsCounter {

    /**
     * Solves a quadratic equation and returns the number of distinct real solutions.
     * @param a Coefficient of x².
     * @param b Coefficient of x.
     * @param c Constant.
     * @return The number of solutions to the equation.
     */
    public static int solutions(int a, int b, int c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            return 2; // Two distinct real solutions
        } else if (discriminant == 0) {
            return 1; // One real solution (repeated root)
        }

        return 0; // No real solutions
    }
}
