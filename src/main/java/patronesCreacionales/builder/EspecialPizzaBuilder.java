package patronesCreacionales.builder;

public class EspecialPizzaBuilder extends PizzaBuilder{
    @Override
    public void buildMasa() {
        pizza.setMasa("Piedra");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Salada");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Mozzarella + Jamon");
    }
}
