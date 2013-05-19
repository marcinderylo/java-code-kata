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

    public void testGutterGame() throws Exception {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals("score", 0, game.score());
    }

}
