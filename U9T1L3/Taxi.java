public class Taxi extends Car{
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
        super(licensePlate, tollFee, passengers, isElectric);
        this.fareCollected = fareCollected;
    }
    public double getFareCollected() {
        return fareCollected;
    }
    public void printTaxi() {
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount applied? " + isDiscountApplied());
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
}
