package patronesCreacionales.builder;

public class Pizza {
    private String masa = "";
    private String salsa = "";
    private String topping = "";

    // Getter agregados para ver el ejemplo pero no estan en el ejemplo original
    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String getTopping() {
        return topping;
    }
    //Setter

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
