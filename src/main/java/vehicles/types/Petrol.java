package vehicles.types;

import vehicles.Vehicle;
import vehicles.carParts.Engine;
import vehicles.carParts.Gearbox;
import vehicles.carParts.Tyres;

public class Petrol extends Vehicle {
    public Petrol(int price, String colour, Engine engine, Tyres tyres, Gearbox gearbox) {
        super(price, colour, engine, tyres, gearbox);
    }
}
