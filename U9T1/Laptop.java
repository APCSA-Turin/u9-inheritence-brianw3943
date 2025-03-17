public class Laptop extends Device {
    private int numKeys;
    public Laptop (String modelName, double price, int numKeys) {
        super(modelName, price);
        this.numKeys = numKeys;
    }
    public int getNumKeys() {
        return numKeys;
    }
    
}
