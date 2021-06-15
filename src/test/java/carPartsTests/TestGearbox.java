package carPartsTests;

import org.junit.Before;
import org.junit.Test;
import vehicles.carParts.Gearbox;
import vehicles.carParts.GearboxType;

import static org.junit.Assert.assertEquals;

public class TestGearbox {

    Gearbox automatic;
    Gearbox manual;

    @Before
    public void before(){
        automatic = new Gearbox(GearboxType.AUTOMATIC);
        manual = new Gearbox(GearboxType.MANUAL);
    }

    @Test
    public void testAutomatic(){
        assertEquals(GearboxType.AUTOMATIC, automatic.getGearboxType());
    }

    @Test
    public void testManual(){
        assertEquals(GearboxType.MANUAL, manual.getGearboxType());
    }
}
