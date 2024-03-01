
public class DogTester {

    public static void main(String[] args) {
        System.out.println("Let\'s simulate a vet office.");
        Dog brady = new Dog(new LicenseName("Brady the Brindle", "Brady"), "Whippet", 39.6);
        System.out.println(brady);
    }
}

record LicenseName(String showName, String nickName) {

}

record Dog(LicenseName name, String breed, double weight) {

}
