public class Device {
    private String modelName;
    private double price;
    public Device(String modelName, double price) {
        this.modelName = modelName;
        this.price = price;
    }
    public String getPrice() {
        return "$" + price;
    }
    public String getModelName() {
        return modelName;
    }
    public void chargeBattery() {
        System.out.println("Battery has been charged to full.");
    }
    
}
