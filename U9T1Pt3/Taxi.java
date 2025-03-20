public class Taxi extends Car{
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
        super(licensePlate, tollFee, passengers, isElectric);
        this.fareCollected = fareCollected;
    }
    public double getFareCollected() {
        return fareCollected;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Total fare collected: " + fareCollected);
    }
    public void setFareCollected(double newFareCollected) {
        fareCollected = newFareCollected;
    }
    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        setFareCollected(fareCollected + farePerRider * numRiders);
        if (isDiscountApplied() == false && getPassengers() >= 4) {
            setTollFee(getTollFee() * 0.5);
            setDiscountApplied(true);
        }
    }
    public boolean chargeAndDropOffRiders(double farePerRider) {
        int numRiders = getPassengers() - 1;
        double fare = numRiders * farePerRider;
        fareCollected += fare;
        return dropOffPassengers(numRiders);
    }
    public void washVehicle() {
        if (getPassengers() <= 1) {
            System.out.println("Washed");
        } else {
            System.out.println("Wait until all passengers have been dropped off.");
        }
    }
}
