import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> clients;
    public Vet(String vetName) {
        this.vetName = vetName;
        clients = new ArrayList<>();
    }
    public boolean addClient(Animal client) {
        if (clients.indexOf(client) == -1) {
            clients.add(client);
            System.out.println("Welcome to " + vetName + "'s office, " + client.getName());
            return true;
        } else {
            System.out.println(client.getName() + " is already a client of " + vetName);
            return false;
        }
    }
    public void printClientList() {
        for (Animal client : clients) {
            System.out.println(client.getName() + ": " + client.getClass());
        }
    }
}
