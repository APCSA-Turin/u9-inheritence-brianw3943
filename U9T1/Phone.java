public class Phone extends Device {
    private String brand;
    public Phone (String modelName, double price, String brand) {
        super(modelName, price);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void text(String message, String receiver) {
        System.out.println("Your message \"" + message + "\" has been delivered to " + receiver + ".");
    }
}
