/*
 * BowlingKataTest.java
 * Date: 19.05.13
 * Time: 22:18
 *
 * @author Marcin Deryło, marcinderylo@gmail.com
 */
package com.blogspot.marcinderylo.kata;

import junit.framework.TestCase;

public class BowlingKataTest extends TestCase {

    private BowlingGame game;

    @Override
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertScoreIs(0);
    }

    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        assertScoreIs(20);
    }

    public void testOneSpare() throws Exception {
        rollSpare();
        roll(3);
        rollMany(17, 0);
        assertScoreIs(16);
    }

    public void testOneStrike() throws Exception {
        rollStrike();
        roll(5);
        roll(3);
        rollMany(16, 0);
        assertScoreIs(26);
    }

    private void roll(int pins) {
        game.roll(pins);
    }

    private void rollStrike() {
        roll(10);
    }

    private void rollSpare() {
        roll(6);
        roll(4);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            roll(pins);
        }
    }

    private void assertScoreIs(int expectedScore) {
        assertEquals("score", expectedScore, game.score());
    }
}
