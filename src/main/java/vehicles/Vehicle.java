package vehicles;

import vehicles.carParts.Engine;
import vehicles.carParts.Gearbox;
import vehicles.carParts.Tyres;

public abstract class Vehicle {

    private int price;
    private String colour;
    private Engine engine;
    private Tyres tyres;
    private Gearbox gearbox;

    public Vehicle(int price, String colour, Engine engine, Tyres tyres, Gearbox gearbox){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
        this.gearbox = gearbox;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }
}
