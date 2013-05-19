/*
 * BowlingGame.java
 * Date: 19.05.13
 * Time: 22:21
 *
 * @author Marcin Deryło, marcinderylo@gmail.com
 */
package com.blogspot.marcinderylo.kata;

public class BowlingGame {
    private int score;

    public int score() {
        return score;
    }

    public void roll(int pins) {
        score += pins;
    }
}
