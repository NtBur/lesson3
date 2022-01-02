package com.shpp.p2p.cs.nburianovata.assignment3;

import com.shpp.cs.a.console.TextProgram;

/**
 * Raised to the power
 */

public class Assignment3Part3 extends TextProgram {

    public void run() {

        raiseToPower(enterBase(), enterExponent());
    }

    /**
     * Calculates the value of the first parameter (base)
     * raised to the power of parameter 2 (exponent)
     *
     * @param base     a number that is raised to the power
     * @param exponent can be not only positive but also negative
     *
     * displayed: result of raised to the power
     */
    private void raiseToPower(double base, int exponent) {

        double res = base;
        if (exponent > 0) {
            for (int i = 0; i < (exponent - 1); i++) {
                res *= base;
            }
        }
        if (exponent < 0) {
            for (int i = 0; i < ((exponent * (-1)) - 1); i++) {
                res *= base;
            }
            res = 1 / res;
        }
        if (exponent == 0 && base > 0) res = 1;

        print("Result of raised to the power " + res);

    }

    /**
     * Enter the number that we will raise to the power
     */
    private double enterBase() {
        double a = 0;
        try {
            a = readInt("Enter number for base ");
        } catch (Exception e) {
            print("Please enter an double \n");
        }
        return a;
    }

    /**
     * Enter the number of the exponent to which we will raise
     */
    private int enterExponent() {
        int a = 0;
        try {
            a = readInt("Enter integer for exponent ");
        } catch (Exception e) {
            print("Please enter an integer \n");
        }
        return a;
    }

}