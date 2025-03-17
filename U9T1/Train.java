public class Train extends Vehicle{
    private int numCars;
    public Train (String name, int wheels, int numCars) {
        super(name, wheels);
        this.numCars = numCars;
    }
    public int getNumCars() {
        return numCars;
    }
    public void honkTrainHorn() {
        System.out.println("honk");
    }
}
