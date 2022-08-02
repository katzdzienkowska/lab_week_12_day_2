import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int passengerCount() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        if (passengerCount() < capacity) {
            passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        int index = passengers.indexOf(person);
        passengers.remove(index);
    }

    public void pickUpPassenger(BusStop busStop, Person person) {
        busStop.removePassenger(person);
        passengers.add(person);
    }
}
