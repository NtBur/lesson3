package com.shpp.p2p.cs.nburianovata.assignment3;

import acm.util.RandomGenerator;
import com.shpp.cs.a.console.TextProgram;

/**
 * This is a casino game
 * The game ends when the first one earns $ 20 or more
 */

public class Assignment3Part5 extends TextProgram {

    public void run() {
        whenLuckyWins();
    }

    private void whenLuckyWins() {
        int lucky = 0;//lucky there is nothing
        int sweaty = 1;//sweaty puts 1 dollar
        int countGames = 0;//number of games played

        while (lucky < 20) {
            /**lucky man throws a coin */
            RandomGenerator rgen = RandomGenerator.getInstance();

            if (rgen.nextBoolean()) {
                /**If the eagle - then sweaty adds
                 * to the amount on the table just as much
                 */
                sweaty += sweaty;
            } else {
                /** If the tail - everything goes to the lucky */
                countGames++;
                lucky += sweaty;
                print("This game, you earned $" + sweaty + "\n");
                print("Your total is $" + lucky + "\n");
            }
        }
        print("It took " + countGames + " games to earn $20");
    }

}
