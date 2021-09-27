import org.junit.*;

import static org.junit.Assert.*;

/**
 * test rock
 */
public class pet_rock_test {
    // rock
    pet_rock rockie;

    /**
     * set up rock
     */
    @Before
    public void setUp() throws Exception {
        rockie = new pet_rock();
    }

    /**
     * test rock speed
     */
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(0, rockie.getMaxSpeed());
    }

    /**
     * test rock sound
     */
    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("...", rockie.sound());
    }

    /**
     * test rock speed
     */
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        rockie.upgradeSpeed();
        assertEquals(1, rockie.getMaxSpeed());
    }

    /**
     * test rock speed
     */
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        rockie.downgradeSpeed();
        assertEquals(-1, rockie.getMaxSpeed());
    }

    /**
     * test rock price
     */
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(999999999, rockie.getPrice());
    }
}
