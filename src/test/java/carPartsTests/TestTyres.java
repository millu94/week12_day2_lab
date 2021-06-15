package carPartsTests;

import org.junit.Before;
import org.junit.Test;
import vehicles.carParts.TyreType;
import vehicles.carParts.Tyres;

import static org.junit.Assert.assertEquals;

public class TestTyres {

    Tyres slim;
    Tyres regular;
    Tyres fat;

    @Before
    public void before(){
        slim = new Tyres(TyreType.SlIM);
        regular = new Tyres(TyreType.REGULAR);
        fat = new Tyres(TyreType.FAT);
    }

    @Test
    public void testSlimTyres(){
        assertEquals(TyreType.SlIM, slim.getTyreType());
    }

    @Test
    public void testRegularTyres(){
        assertEquals(TyreType.REGULAR, regular.getTyreType());
    }

    @Test
    public void testFatTyres(){
        assertEquals(TyreType.FAT, fat.getTyreType());
    }

}
