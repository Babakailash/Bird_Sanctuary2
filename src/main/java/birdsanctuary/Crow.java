package birdsanctuary;


public class Crow extends Bird implements Flyable {

    static int count = 0;

    public Crow(String id) {
        this.id = id;
    }
    @Override
    public void eat() {
        System.out.println("Crow is Eating");
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    void decrementCount() {
        count--;
    }

    @Override
    public void fly() {
        System.out.println("Crow is Flying");
    }
}