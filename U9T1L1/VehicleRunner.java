public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle myBicycle = new Bicycle("Bicycle", 2, 5);
        System.out.println(myBicycle.getName()); 
        System.out.println(myBicycle.getWheels());
        System.out.println(myBicycle.getGearCount());
        myBicycle.move(30);
        myBicycle.turn();
        myBicycle.brake();
        myBicycle.ringBell();

        Train myTrain = new Train("Train1", 32, 8);
        System.out.println(myTrain.getName()); 
        System.out.println(myTrain.getWheels());
        System.out.println(myTrain.getNumCars());
        myTrain.move(30);
        myTrain.turn();
        myTrain.brake();
        myTrain.honkTrainHorn();
    }
}