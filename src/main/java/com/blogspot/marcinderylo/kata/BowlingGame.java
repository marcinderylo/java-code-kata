/*
 * BowlingGame.java
 * Date: 19.05.13
 * Time: 22:21
 *
 * @author Marcin Deryło, marcinderylo@gmail.com
 */
package com.blogspot.marcinderylo.kata;

public class BowlingGame {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public int score() {
        int sum = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum += rolls[i];
        }
        return sum;
    }

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }
}
