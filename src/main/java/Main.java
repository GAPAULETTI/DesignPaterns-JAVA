import patronesCreacionales.abstractFactory.Application;
import patronesCreacionales.abstractFactory.MacOsFactory;
import patronesCreacionales.abstractFactory.WindowsFactory;

public class Main {
    public static void main(String[] args) {

        //Factory Method example
        /*
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.createAnimal("Dog");
        dog.Speak();
        Animal cat = animalFactory.createAnimal("Cat");
        cat.Speak();
        */
        //Abstract Factory example
        Application app;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            app = new Application(new MacOsFactory());
        } else {
            app = new Application(new WindowsFactory());
        }
        app.clickButton();
    }
}
