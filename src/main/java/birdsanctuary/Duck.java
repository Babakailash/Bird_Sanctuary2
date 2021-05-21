package birdsanctuary;


public class Duck extends Bird implements Flyable, Swimable {

    static int count = 0;

    public Duck(String id) {
        this.id = id;
    }

    @Override
    public void eat() {
        System.out.println("Duck is Eating");
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    void decrementCount() {
        count--;
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    public void fly() {
        System.out.println("Duck is Flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}