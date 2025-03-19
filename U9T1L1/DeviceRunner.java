public class DeviceRunner {
    public static void main(String[] args) {
        Device myDevice = new Device("Model I", 89.99);
        System.out.println(myDevice.getPrice());
        System.out.println(myDevice.getModelName());
        myDevice.chargeBattery();

        Laptop myLaptop = new Laptop("Model IV", 349.99, 85);
        System.out.println(myLaptop.getPrice());
        System.out.println(myLaptop.getModelName());
        myLaptop.chargeBattery();
        System.out.println(myLaptop.getNumKeys());

        Phone myPhone = new Phone("Model X", 419.99, "Apple");
        System.out.println(myPhone.getPrice());
        System.out.println(myPhone.getModelName());
        myPhone.chargeBattery();
        System.out.println(myPhone.getBrand());
        myPhone.text("Hello", "Mom");
    }
}
