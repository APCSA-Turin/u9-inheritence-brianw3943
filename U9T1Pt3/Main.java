public class Main {
    public static void main(String args[]) {
        Car car = new Car("ABCDEF", 5, 2, false);
        Truck truck = new Truck("ABC123", 6, 3, 4, true);
        Vehicle vehicle = new Vehicle("QWERTY", 5, 3);
        Taxi taxi = new Taxi("ASDFGH", 6, 4, false, 10.00);
        vehicle.washVehicle();
        truck.washVehicle();
        car.washVehicle();
        taxi.washVehicle();
    }
}
