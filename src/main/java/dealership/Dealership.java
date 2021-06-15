package dealership;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private int till;

    public Dealership(ArrayList stock, int till){
        this.stock = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public int getTill() {
        return till;
    }

    public void addToStock(Vehicle vehicle){
        this.stock.add(vehicle);
    }
}
