package patronesEstructurales.Bridge;

public class Motorcicle extends Vehicle{

    public Motorcicle(Workshop workshop){
        super(workshop);
    }
    @Override
    public void repair() {
        System.out.println("Motorcicle: ");
        workshop.repair();
    }
}
