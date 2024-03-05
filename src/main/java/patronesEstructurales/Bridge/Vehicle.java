package patronesEstructurales.Bridge;

public abstract class Vehicle {
    protected Workshop workshop;

    public Vehicle(Workshop workshop){
        this.workshop = workshop;
    }
    public abstract void repair();
}
