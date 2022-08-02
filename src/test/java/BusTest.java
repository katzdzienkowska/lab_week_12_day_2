import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person1;
    Person person2;
    Person person3;

    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Perth", 2);
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        busStop = new BusStop("Mill Street");
    }

    @Test
    public void hasDestination() {
        assertEquals("Perth", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bus.getCapacity());
    }

    @Test
    public void numberOfPassengers() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person1);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cannotAddPassenger() {
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.addPassenger(person3);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person1);
        assertEquals(1, bus.passengerCount());
        bus.removePassenger(person1);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canTakePassengerFromBusStop() {
        busStop.addToQueue(person1);
        bus.pickUpPassenger(busStop, person1);
        assertEquals(1, bus.passengerCount());
    }
}
