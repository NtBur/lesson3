package com.shpp.p2p.cs.nburianovata.assignment3;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;


/**
 * A program about a caterpillar that
 * tries to crawl to an apple but doesn't have enough time
 */
public class Assignment3Part6 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 350;
    private static final int DIAMETER_CIRCLE = 50;
    private static final int COUNT_CIRCLES = 11;
    private static final int POSITION_FIRST_CIRCLE_X = 20;
    private static final int POSITION_FIRST_CIRCLE_Y = 150;
    private static final double COUNT_FRAMES = 24;
    private static final double PAUSE_TIME = 1000.0 / COUNT_FRAMES;
    private static final double TIME_ANIMATION = 6;
    private static final int DIAMETER_APPLE = 150;


    private static final int STEP_CIRCLE_DX = 3;

    public void run() {

        GOval[] arr = createCaterpillar();//movie hero
        createApple();//unattainable goal
        giveAnimationTime(arr);//little time

    }

    /**
     * calculate the animation time
     *
     * @param arr array of ovals caterpillar
     */
    private void giveAnimationTime(GOval[] arr) {
        /* number of frames per animation period */
        double count = COUNT_FRAMES * TIME_ANIMATION;

        for (int j = 0; j < (count / arr.length); j++) {
            for (int i = 0; i < arr.length; i++) {
                arr[i].move(STEP_CIRCLE_DX, 0);
                pause(PAUSE_TIME);
            }
        }
    }

    /**
     * Create caterpillar from ovals
     *
     * @return array of ovals
     */
    private GOval[] createCaterpillar() {
        GOval c = createOval(POSITION_FIRST_CIRCLE_X, POSITION_FIRST_CIRCLE_Y);
        GOval[] arr = new GOval[COUNT_CIRCLES];
        for (int i = 0; i < COUNT_CIRCLES; i++) {
            int step = DIAMETER_CIRCLE / 2;
            if (i % 2 == 0) {
                /** circle get up */
                c = createOval(c.getX() + step, c.getY() - step);
                add(c);

                arr[i] = c;
            } else {
                /** circle get down*/
                c = createOval(c.getX() + step, c.getY() + step);
                add(c);

                arr[i] = c;
            }
        }
        return arr;
    }

    /**
     * Create a colored oval with positions x, y
     */
    private GOval createOval(double x, double y) {
        GOval res = new GOval(x, y, DIAMETER_CIRCLE, DIAMETER_CIRCLE);
        setColorOval(res, Color.RED);
        fillOval(res, Color.GREEN);
        return res;
    }

    /**
     * Create a red apple on the right side
     */
    private void createApple() {
        GOval res = new GOval(getWidth() - DIAMETER_APPLE,
                getHeight() / 2 - DIAMETER_APPLE / 2,
                DIAMETER_APPLE, DIAMETER_APPLE);
        res.setFillColor(Color.RED);
        res.setFilled(true);
        add(res);
    }

    /**
     * Internal color of the oval
     */
    private void fillOval(GOval res, Color color) {
        res.setFillColor(color);
        res.setFilled(true);
    }

    /**
     * Color of the oval shell
     */
    private void setColorOval(GOval res, Color color) {
        res.setColor(color);
    }
}
