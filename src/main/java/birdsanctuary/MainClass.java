package birdsanctuary;

public class MainClass {
public static void main (String[] args) throws Exception {

        BirdFactory birdFactory = new BirdFactory();
        Bird parrot = birdFactory.getBird("parrot", "parrot");
        Bird crow = birdFactory.getBird("crow", "crow");
        Bird penguin = birdFactory.getBird("penguin", "penguin");
        Bird duck = birdFactory.getBird("duck", "duck");

        System.out.println("Welcome to Bird Sanctuary!!\n");

        BirdSanctuaryManager.getInstance().addBird(parrot);
        BirdSanctuaryManager.getInstance().addBird(crow);
        BirdSanctuaryManager.getInstance().addBird(penguin);
        BirdSanctuaryManager.getInstance().addBird(duck);

        BirdSanctuaryManager.getInstance().printEatable();
        BirdSanctuaryManager.getInstance().printFlyable();
        BirdSanctuaryManager.getInstance().printSwimable();

        System.out.println("Number of Parrots are: " + parrot.getCount());
        System.out.println("Number of Penguins are: " + penguin.getCount());
        System.out.println("Number of Ducks are: " + duck.getCount());
        System.out.println("Number of Crows are: " + crow.getCount());
        System.out.println("Total Birds = " + BirdSanctuaryManager.getInstance().getAllCount());

        BirdSanctuaryManager.getInstance().removeBird(duck);
        BirdSanctuaryManager.getInstance().removeBird(crow);

        System.out.println("Number of Parrots are: " + parrot.getCount());
        System.out.println("Number of Penguins are: " + penguin.getCount());
        System.out.println("Number of Ducks are: " + duck.getCount());
        System.out.println("Number of Crows are: " + crow.getCount());
        System.out.println("Total Birds = " + BirdSanctuaryManager.getInstance().getAllCount());
        }
        }
