package patronesEstructurales.Bridge;

public class MechanicalWorkshop implements Workshop{
    @Override
    public void repair() {
        System.out.println("Reparacion realizada");
    }
}
