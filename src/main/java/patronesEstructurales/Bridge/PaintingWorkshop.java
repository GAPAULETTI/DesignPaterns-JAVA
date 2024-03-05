package patronesEstructurales.Bridge;

public class PaintingWorkshop implements Workshop{
    @Override
    public void repair() {
        System.out.println("Pintura realizada");
    }
}
