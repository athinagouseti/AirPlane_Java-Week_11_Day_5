import org.junit.Before;
import org.junit.Test;
import staff.CabinCrewRank;
import staff.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Steve", CabinCrewRank.CAPTAIN, "CODECLAN");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Steve", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(CabinCrewRank.CAPTAIN, pilot.getCabinCrewRank());
    }

    @Test
    public void pilotHasLicenceNumber(){
        assertEquals("CODECLAN", pilot.getLicenceNumber());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Flying the plane", pilot.flyPlane());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Get ready for takeoff", pilot.relayMessage("takeoff"));
    }
}
