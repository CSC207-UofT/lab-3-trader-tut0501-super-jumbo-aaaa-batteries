/* A sample class that implements the given interfaces.
 */
public class Cow implements Domesticatable, Tradable {
    private int maxSpeed;

    public Cow() {
        this.maxSpeed = 2;
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (The Max speed equals " + this.maxSpeed +")";
    }
}
