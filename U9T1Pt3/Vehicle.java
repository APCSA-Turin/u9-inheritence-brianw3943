public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
      this.licensePlate = licensePlate;
      this.tollFee = tollFee;
      this.passengers = passengers;
    }
  
    public String getLicensePlate() {
      return licensePlate;
    }
  
    public double getTollFee() {
      return tollFee;
    }
  
    public int getPassengers() {
      return passengers;
    }
  
    public double calculateTollPrice() {
      return tollFee * passengers;
    }
    public void setPassengers(int newPassengers) {
      passengers = newPassengers;
    }
    public void setTollFee(double newTollFee) {
      tollFee = newTollFee;
    }
    public void printInfo() {
      System.out.println("License plate: " + getLicensePlate());
      System.out.println("Toll fee: " + getTollFee());
      System.out.println("Passengers: " + getPassengers());
    }
    public void washVehicle() {
      System.out.println("Washed");
    }
  }