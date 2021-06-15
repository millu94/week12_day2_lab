package TestCommerce;

import customer.Customer;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import vehicles.Vehicle;
import vehicles.carParts.*;
import vehicles.types.Electric;
import vehicles.types.Hybrid;
import vehicles.types.Petrol;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestDealership {

    Dealership dealership;

    Electric electricCar;
    Petrol petrolCar;
    Hybrid hybridCar;

    Gearbox manualGearbox;
    Gearbox autoGearbox;

    Engine electricEngine;
    Engine hybridEngine;
    Engine petrolEngine;

    Tyres slimTyres;
    Tyres regTyres;
    Tyres fatTyres;

    Customer joshua;

    @Before
    public void before(){
    slimTyres = new Tyres(TyreType.REGULAR);
    regTyres = new Tyres(TyreType.REGULAR);
    fatTyres = new Tyres(TyreType.FAT);

    autoGearbox = new Gearbox(GearboxType.MANUAL);
    manualGearbox = new Gearbox(GearboxType.MANUAL);

    petrolEngine = new Engine(2000, EngineType.PETROL);
    hybridEngine = new Engine(1800, EngineType.PETROL);
    electricEngine = new Engine(1200, EngineType.ELECTRIC);

    petrolCar = new Petrol(1480, "Pink", petrolEngine, regTyres, manualGearbox);
    hybridCar = new Hybrid(10000, "Silver", hybridEngine, slimTyres, autoGearbox);
    electricCar = new Electric(4000, "Beige", electricEngine, fatTyres, manualGearbox);

    ArrayList stock = new ArrayList<Vehicle>();
    dealership = new Dealership(stock, 1000);

    ArrayList ownedCars = new ArrayList<Vehicle>();
    joshua = new Customer("Joshua", 100000, ownedCars);
    }

    @Test
    public void canGetTill(){
        assertEquals(1000, dealership.getTill());
    }

    @Test
    public void canGetStock(){
        assertEquals(0, dealership.getStock());
    }

    @Test
    public void canAddToStock(){
        dealership.addCar(petrolCar);

        dealership.addCar(hybridCar);
        dealership.addCar(electricCar);
        assertEquals(3, dealership.getStock());
    }

    @Test
    public void customerCanBuyCar(){
        dealership.addCar(petrolCar);
        dealership.addCar(hybridCar);
        dealership.addCar(electricCar);
        dealership.sellCar(petrolCar);
        assertEquals(2, dealership.getStock());
        assertEquals(1, joshua.getOwnedCars().size());
    }


}
