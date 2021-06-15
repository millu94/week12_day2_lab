package carPartsTests;

import org.junit.Before;
import org.junit.Test;
import vehicles.carParts.Engine;
import vehicles.carParts.EngineType;

import static org.junit.Assert.assertEquals;

public class TestEngine {

    Engine petrolEngine;
    Engine hybridEngine;
    Engine electricEngine;

    @Before
    public void before(){
        petrolEngine = new Engine(1600, EngineType.PETROL);
        electricEngine = new Engine(1800, EngineType.ELECTRIC);
        hybridEngine = new Engine(1400, EngineType.HYBRID);
    }

    @Test
    public void testPetrolEngineHasCC(){
        assertEquals(1600, petrolEngine.getCcLevel());
    }

    @Test
    public void testPetrolEngineHasType(){
        assertEquals(EngineType.PETROL, petrolEngine.getEngineType());
    }

    @Test
    public void testElectricEngineHasCC(){
        assertEquals(1800, electricEngine.getCcLevel());
    }

    @Test
    public void testElectricEngineHasEngineType(){
        assertEquals(EngineType.ELECTRIC, electricEngine.getEngineType());
    }

    @Test
    public void testHybridEngineHasCC(){
        assertEquals(1400, hybridEngine.getCcLevel());
    }

    @Test
    public void testHybridEngineHasEngineType(){
        assertEquals(EngineType.HYBRID, hybridEngine.getEngineType());
    }
}
