import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person1;

    @Before
    public void before() {
        busStop = new BusStop("Mill Street");
        person1 = new Person();
    }

    @Test
    public void hasStopName(){
        assertEquals("Mill Street", busStop.getName());
    }

    @Test
    public void canAddToQueue(){
        busStop.addToQueue(person1);
        assertEquals(1, busStop.lengthOfQueue());
    }

    @Test
    public void canRemoveFromQueue(){
        busStop.addToQueue(person1);
        busStop.removePassenger(person1);
        assertEquals(0, busStop.lengthOfQueue());
    }
}
