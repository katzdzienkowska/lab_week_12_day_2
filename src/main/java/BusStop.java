import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;


    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addToQueue(Person person1) {
        queue.add(person1);
    }

    public int lengthOfQueue() {
        return queue.size();
    }

    public Person removePassenger(Person person) {
        int index = queue.indexOf(person);
        return queue.remove(index);
    }
}
