import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Craig", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Craig", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
