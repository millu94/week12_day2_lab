package vehicleTypesTests;

import org.junit.Before;
import org.junit.Test;
import vehicles.carParts.*;
import vehicles.types.Hybrid;

import static org.junit.Assert.assertEquals;

public class TestHybrid {

    Hybrid hybridCar;
    Tyres slimTyres;
    Gearbox autoGearbox;
    Engine hybridEngine;

    @Before
    public void before(){
        slimTyres = new Tyres(TyreType.REGULAR);
        hybridEngine = new Engine(1800, EngineType.PETROL);
        autoGearbox = new Gearbox(GearboxType.MANUAL);
        hybridCar = new Hybrid(10000, "Silver", hybridEngine, slimTyres, autoGearbox);
    }

    @Test
    public void checkHybridCarHasPrice(){
        assertEquals(10000, hybridCar.getPrice());
    }

    @Test
    public void checkHybridCarHasColour(){
        assertEquals("Silver", hybridCar.getColour());
    }

    @Test
    public void checkHybridCarHasEngine() {
        assertEquals(hybridEngine, hybridCar.getEngine());
    }

    @Test
    public void checkHybridCarHasGearbox(){
        assertEquals(autoGearbox, hybridCar.getGearbox());
    }

    @Test
    public void checkHybridCarHasTyres(){
        assertEquals(slimTyres, hybridCar.getTyres());
    }
}

