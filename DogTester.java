
import java.util.*;

public class DogTester {

    public static void main(String[] args) {
        Dog brady = new Dog(new LicenseName("Brady the Blue Brindle", "Brady"), "Whippet", 46.7);
        Cat sweetie = new Cat("Sweetie", "Siamese", 7.5);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(brady);
        animals.add(sweetie);

        for (Animal a : animals) {
            switch (a) {
                //uses rule switch with lambda
                case Dog(LicenseName name, _, _) ->
                    System.out.println(name.nickname());

                case Cat(String name, _, _) ->
                    System.out.println(name);
            }
        }
    }
}

sealed interface Animal permits Dog, Cat {
}

record LicenseName(String fullName, String nickname) {

}

record Dog(LicenseName name, String breed, double weight) implements Animal {

}

record Cat(String name, String Breed, double weight) implements Animal {

}
