public class GamingDesktop extends Desktop {
    private String graphicsCard;
    public GamingDesktop(int screenSize, int memory, String graphicsCard) {
        super(screenSize, memory, true);
        this.graphicsCard = graphicsCard;
    }
    public String getGraphicsCard() {
        return graphicsCard;
    }
    public void updateDrives() {
        System.out.println("Updated");
    }
}
