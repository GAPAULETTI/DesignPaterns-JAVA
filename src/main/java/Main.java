import patronesCreacionales.factoryMethod.Animal;
import patronesCreacionales.factoryMethod.AnimalFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.createAnimal("Dog");
        dog.Speak();
    }
}
