/**
 * ROck. drive. DOmestic. Tarde.
 */
public class pet_rock implements Drivable, Domesticatable, Tradable {
    // speedie rockie
    private int max_speed;

    /**
     * creatie rockie
     */
    public pet_rock() {
        this.max_speed = 0;
    }

    /**
     * speakie rockie
     *
     * @return ...
     */
    @Override
    public String sound() {
        return "...";
    }

    /**
     * fast rockie
     */
    @Override
    public void upgradeSpeed() {
        this.max_speed++;
    }

    /**
     * slow rockie
     */
    @Override
    public void downgradeSpeed() {
        this.max_speed--;
    }

    /**
     * how fast rockie?
     *
     * @return speed
     */
    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }

    /**
     * pay money plz
     *
     * @return $$$$$$
     */
    @Override
    public int getPrice() {
        return 999999999;
    }

    /**
     * is rockie.
     *
     * @return rock
     */
    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.max_speed +")";
    }
}
