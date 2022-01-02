package com.shpp.p2p.cs.nburianovata.assignment3;

import com.shpp.cs.a.console.TextProgram;


/**
 * If an integer is even, then divide it by 2.
 * If the positive integer is odd, then multiply by 3 and add 1.
 * Continue this process until it is 1
 */
public class Assignment3Part2 extends TextProgram {

    public void run() {

        isOddOrEven(enterNumber());
    }


    /**
     * The user enters  a number
     *
     * @return a positive integer
     */
    private int enterNumber() {
        int a = -1;
        try {
            a = readInt("Enter a positive integer: ");

        } catch (Exception e) {

            print("Please enter an integer \n");
        }
        return a;
    }

    /**
     * If the number is positive - check it even or odd
     */
    private void isOddOrEven(int x) {
        if (x > 0) {
            do {
                if (x % 2 == 0) {
                    print(x + " is even so I take half " + (x / 2) + "\n");
                    x = x / 2;
                } else {
                    print(x + " is odd so I make 3n + 1: " + (x * 3 + 1) + "\n");
                    x = x * 3 + 1;
                }
            } while (x > 1);
            print("End");
        } else {
            print("Enter a non-negative number");
        }
    }

}
