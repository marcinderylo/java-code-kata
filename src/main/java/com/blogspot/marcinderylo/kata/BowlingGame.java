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
            if (isStrike(firstInFrame)) {
                score += 10 + strikeBonus(firstInFrame);
                firstInFrame += 1;
            } else if (isSpare(firstInFrame)) {
                score += 10 + spareBonus(firstInFrame);
                firstInFrame += 2;
            } else {
                score += sumOfBallsInFrame(firstInFrame);
                firstInFrame += 2;
            }
        }
        return score;
    }

    private int strikeBonus(int firstInFrame) {
        return rolls[firstInFrame + 1] + rolls[firstInFrame + 2];
    }

    private boolean isStrike(int firstInFrame) {
        return rolls[firstInFrame] == 10;
    }

    private int spareBonus(int firstInFrame) {
        return rolls[firstInFrame + 2];
    }

    private int sumOfBallsInFrame(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1];
    }

    private boolean isSpare(int firstInFrame) {
        return sumOfBallsInFrame(firstInFrame) == 10;
    }

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }
}
