public class Dog extends Animal{
    private boolean hasBeenWalked;
    public Dog(String name, int age, boolean vaccinated, boolean hasBeenWalked) {
        super(name, age, vaccinated);
        this.hasBeenWalked = hasBeenWalked;
    }
    public boolean hasBeenWalked() {
        return hasBeenWalked;
    }
    public void walk() {
        System.out.println("Walked");
    }
}
