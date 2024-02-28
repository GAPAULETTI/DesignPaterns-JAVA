import patronesCreacionales.Prototype.Shape;
import patronesCreacionales.abstractFactory.Application;
import patronesCreacionales.abstractFactory.MacOsFactory;
import patronesCreacionales.abstractFactory.WindowsFactory;
import patronesCreacionales.builder.Cocinero;
import patronesCreacionales.builder.HawaianaPizzaBuilder;
import patronesCreacionales.builder.Pizza;
import patronesCreacionales.builder.PizzaBuilder;

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
        /*
        Application app;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            app = new Application(new MacOsFactory());
        } else {
            app = new Application(new WindowsFactory());
        }
        app.clickButton();
        */
        //Builder Design Pattern
        /*
        Cocinero cocinero = new Cocinero();
        PizzaBuilder hawaiana = new HawaianaPizzaBuilder();

        cocinero.setPizzaBuilder(hawaiana);
        cocinero.construirPizza();
        Pizza pizza = cocinero.getPizza();
        System.out.println(pizza.getMasa() + " " + pizza.getSalsa() + " " + pizza.getTopping());*/
        Shape shape = new Shape();
        shape.setType("Rectangle");
        Shape formaClone = (Shape) shape.clonar();

        System.out.println(formaClone);
    }
}
