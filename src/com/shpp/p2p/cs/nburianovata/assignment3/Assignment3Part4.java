package com.shpp.p2p.cs.nburianovata.assignment3;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;


/**
 * Pyramid of bricks. Each row contains 1 brick less.
 * The pyramid should be centered horizontally
 * and lie on the "bottom" of the window.
 */

public class Assignment3Part4 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;

    public static final int BRICK_HEIGHT = 10;
    public static final int BRICK_WIDTH = 7;
    public static final int BRICKS_IN_BASE = 20;

    public void run() {
        /** centered horizontally , lies on the "bottom" of the window */
        putBrick(getWidth() / 2 - BRICKS_IN_BASE * BRICK_WIDTH / 2, getHeight() - BRICK_HEIGHT);
    }

    /**
     * Builds a pyramid of BRICKS
     *
     * @param x the initial position of the pyramid horizontally
     * @param y the initial position of the pyramid vertically
     */
    private void putBrick(int x, int y) {
        int a = BRICKS_IN_BASE;

        /** Create  bricks */
        for (int i = 0; i < BRICKS_IN_BASE; i++) {
            /** reduce the number of bricks in each row */
            a--;

            for (int j = 0; j < a; j++) {
                GRect res = new GRect(
                        /** shift to half-bricks */
                        x + (i * BRICK_WIDTH) + j * BRICK_WIDTH / 2,
                        y - (j * BRICK_HEIGHT),
                        BRICK_WIDTH,
                        BRICK_HEIGHT);

                res.setColor(Color.BLACK);
                add(res);
            }
        }
    }
}
