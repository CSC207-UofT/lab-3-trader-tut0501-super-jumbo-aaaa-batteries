public class Turtle implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Turtle() {
        this.maxSpeed = 5;
    }

    @Override
    public String sound() {
        return "squirtle!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 900;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
