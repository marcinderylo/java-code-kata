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
        int score = 0;
        int firstInFrame = 0;
        for (int frame = 0; frame < 10; frame++) {
            score += rolls[firstInFrame] + rolls[firstInFrame + 1];
            firstInFrame += 2;
        }
        return score;
    }

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }
}
