package com.shpp.p2p.cs.nburianovata.assignment3;

import com.shpp.cs.a.console.TextProgram;

/**
 * The program counts the number of minutes spent
 * in the last seven days on exercise
 */

public class Assignment3Part1 extends TextProgram {
    public static final int MINUTES_AEROBIC = 30;
    public static final int MINUTES_FOR_BLOOD = 40;
    public static final int DAY_AEROBIC = 5;
    public static final int DAY_BLOOD_PRESSURE = 3;

    public void run() {

        int[] arr = howManyMinutesSpent();

        whatCardiovascularHealth(arr);
        whatBlood(arr);


    }

    /**
     * The user enters how many minutes
     * are spent on exercises each day of the week
     *
     * @return an array of minutes for each day
     */
    private int[] howManyMinutesSpent() {
        int[] arr = new int[8];
        try {
            for (int i = 1; i < 8; i++) {

                arr[i] = readInt("How many minutes did you do on day " + i + " ? ");
            }
        } catch (Exception e) {

            print("Enter an integer number of minutes\n");
        }
        return arr;
    }

    /**
     * Checks whether enough time is spent on exercise
     * for cardiovascular health
     *
     * displayed: how many days of classes (more than 30 minutes)
     * are not enough for the recommended schedule (5 days a week)
     */
    private void whatCardiovascularHealth(int[] arr) {
        int day = howManyDayGoodTrain(MINUTES_AEROBIC, arr);
        print("Cardiovacular health:\n");
        if (day >= DAY_AEROBIC) {
            print("Great job! You've done enough exercise for cardiovacular health.\n");
        } else {
            print("You needed to train hard for at least " + (DAY_AEROBIC - day) + " more day(s) a week!\n");
        }
    }

    /**
     * Determines whether there are enough minutes
     * for the required training
     *
     * @return number of days with sufficient preparation
     */
    private int howManyDayGoodTrain(int minutes, int[] arr) {
        int res = 0;
        for (int num : arr) {
            if (num >= minutes) res++;
        }
        return res;
    }


    /**
     * Determines whether there is enough exercise
     * to lower blood pressure
     *
     * displayed: how many days of classes (more than 40 minutes)
     * not enough for the recommended schedule (3 days a week)
     */
    private void whatBlood(int[] arr) {
        int day = howManyDayGoodTrain(MINUTES_FOR_BLOOD, arr);
        print("Blood pressure:\n");

        if (day >= DAY_BLOOD_PRESSURE) {
            print(" Great job! You've done enough exercise to keep a low blood pressure.\n");
        } else {
            print("You needed to train hard for at least " + (DAY_BLOOD_PRESSURE - day) + " more day(s) a week!\n");
        }
    }
}
