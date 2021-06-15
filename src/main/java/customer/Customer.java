package customer;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Vehicle> ownedCars;

    public Customer(String name, int wallet, ArrayList ownedCars){
        this.name = name;
        this.wallet = wallet;
        this.ownedCars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public ArrayList<Vehicle> getOwnedCars() {
        return ownedCars;
    }
}
