package birdsanctuary;


public class Penguin extends Bird implements Swimable{

    static  int count = 0;

    public Penguin(String id) {
        this.id = id;
    }

    @Override
    public void eat() {
        System.out.println("Penguin is Eating");
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
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}