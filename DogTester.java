
public class DogTester {
    public static void main (String [] args) {
        System.out.println ("Let\'s simulate a vet office.");
        Dog brady = new Dog ("Brady", "Whippet", 39.6);
        System.out.println (brady);
    }
}

record Dog (String name, String breed, double weight) {
}

