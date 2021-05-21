package birdsanctuary;

public class BirdFactory {
    public Bird getBird(String birds,String name) {

        switch (birds) {
            case "Parrot":
                return new Parrot(name);

            case "Duck":
                return  new Duck(name);

            case "Penguin":
                return  new Penguin(name);

            case "Crow":
                return  new Crow(name);
            default:
                return null;
        }
    }
}
