package vehicleTypesTests;

import org.junit.Before;
import org.junit.Test;
import vehicles.carParts.*;
import vehicles.types.Petrol;

import static org.junit.Assert.assertEquals;

public class TestPetrol {

    Petrol petrolCar;
    Tyres regTyres;
    Gearbox manualGearbox;
    Engine petrolEngine;

    @Before
    public void before() {
        regTyres = new Tyres(TyreType.REGULAR);
        petrolEngine = new Engine(2000, EngineType.PETROL);
        manualGearbox = new Gearbox(GearboxType.MANUAL);
        petrolCar = new Petrol(1480, "Pink", petrolEngine, regTyres, manualGearbox);
    }

    @Test
    public void checkCarHasPrice(){
        assertEquals(1480, petrolCar.getPrice());
    }

    @Test
    public void checkCarHasColour(){
        assertEquals("Pink", petrolCar.getColour());
    }

    @Test
    public void checkCarHasEngine() {
        assertEquals(petrolEngine, petrolCar.getEngine());
    }

    @Test
    public void checkCarHasGearbox(){
        assertEquals(manualGearbox, petrolCar.getGearbox());
    }

    @Test
    public void checkCarHasTyres(){
        assertEquals(regTyres, petrolCar.getTyres());
    }
}
