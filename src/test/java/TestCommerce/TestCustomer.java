package TestCommerce;
import customer.Customer;
import org.junit.Before;
import vehicles.Vehicle;

import java.util.ArrayList;


public class TestCustomer {

    Customer joshua;

    @Before
    public void before(){
        ArrayList ownedCars = new ArrayList<Vehicle>();
        joshua = new Customer("Joshua", 100000, ownedCars);
    }
}
