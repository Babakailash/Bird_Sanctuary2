package birdsanctuary;
import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {

    Set<Bird> birdList = new HashSet<>();

    private static BirdSanctuaryManager instance;

    public static BirdSanctuaryManager getInstance() {
        if (instance == null) {
            instance = new BirdSanctuaryManager();
        }
        return instance;
    }

    private BirdSanctuaryManager() {
    }

    public void addBird(Bird bird) {
        try{
            if(bird == null){
                throw new BirdSanctuaryException("Bird Entered Null!!");
            } else {
                birdList.add(bird);
                bird.incrementCount();
            }
        } catch (BirdSanctuaryException e) {
            e.printStackTrace();
        }
    }

    public void removeBird(Bird bird) throws BirdSanctuaryException {
        if(birdList.contains(bird)) {
            birdList.remove(bird);
            bird.decrementCount();
        } else {
            throw new BirdSanctuaryException("Did not find bird!!");
        }
    }

    public int getAllCount() {
        return birdList.size();
    }

    public void printEatable() {
        birdList.stream().forEach(Bird::eat);
    }

    public void printFlyable() {
        birdList.stream().filter(bird-> bird instanceof Flyable).forEach(bird -> ((Flyable) bird).fly());
    }

    public void printSwimable() {
        birdList.stream().filter(bird-> bird instanceof Swimable).forEach(bird -> ((Swimable) bird).swim());
    }
}


