import airplane.Plane;
import airplane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    @Before
    public void before(){
        plane = new Plane(PlaneType.HELICOPTER);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.HELICOPTER, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(2, plane.getCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(500, plane.getTotalWeight());
    }
}
