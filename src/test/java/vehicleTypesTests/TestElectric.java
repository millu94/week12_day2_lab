package vehicleTypesTests;

import org.junit.Before;
import org.junit.Test;
import vehicles.carParts.*;
import vehicles.types.Electric;
import vehicles.types.Petrol;

import static org.junit.Assert.assertEquals;

public class TestElectric {

    Electric electricCar;
    Tyres fatTyres;
    Gearbox manualGearbox;
    Engine electricEngine;

    @Before
    public void before(){
        fatTyres = new Tyres(TyreType.FAT);
        electricEngine = new Engine(1200, EngineType.ELECTRIC);
        manualGearbox = new Gearbox(GearboxType.MANUAL);
        electricCar = new Electric(4000, "Beige", electricEngine, fatTyres, manualGearbox);
    }

    @Test
    public void checkCarHasPrice(){
        assertEquals(4000, electricCar.getPrice());
    }

    @Test
    public void checkCarHasColour(){
        assertEquals("Beige", electricCar.getColour());
    }

    @Test
    public void checkCarHasEngine() {
        assertEquals(electricEngine, electricCar.getEngine());
    }

    @Test
    public void checkCarHasGearbox(){
        assertEquals(manualGearbox, electricCar.getGearbox());
    }

    @Test
    public void checkCarHasTyres(){
        assertEquals(fatTyres, electricCar.getTyres());
    }
}