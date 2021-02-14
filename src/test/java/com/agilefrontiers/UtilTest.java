package com.agilefrontiers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilTest {
    @Test
    public void randomTest() {
        boolean[] values = new boolean[10];
        for(int i=0; i<1000; i++) {
            int rnd = Util.random(0, 10);
            assertTrue(rnd >= 0);
            assertTrue(rnd < 10);
            values[rnd] = true;
        }
        for(boolean value : values) {
            assertTrue(value);
        }
    }
}