/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class DonkeyTest {
    Donkey d;

    @Before
    public void setUp() throws Exception {
        d = new Donkey();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Hee-Haw!", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(2, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(2, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(6, d.getPrice());
    }

}
}