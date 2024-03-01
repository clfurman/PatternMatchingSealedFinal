
import java.util.*;

public class DogTester {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Let\'s simulate a vet office.");
        Dog brady = new Dog(new LicenseName("Brady the Brindle", "Brady"), "Whippet", 39.6);
        Cat mittens = new Cat("Mittens", "Siamese", 8.2);
        animals.add(brady);
        animals.add(mittens);
        System.out.println(animals);
    }
}

sealed interface Animal permits Dog, Cat {
}

record LicenseName(String showName, String nickName) {

}

record Dog(LicenseName name, String breed, double weight) implements Animal {

}

record Cat(String name, String breed, double weight) implements Animal {

}
