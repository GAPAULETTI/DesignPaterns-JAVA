package patronesCreacionales.builder;

public class HawaianaPizzaBuilder extends PizzaBuilder{
    @Override
    public void buildMasa() {
        pizza.setMasa("suave");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("dulce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("anana + jamon");
    }
}
