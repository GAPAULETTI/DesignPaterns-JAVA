package patronesEstructurales.Bridge;

import org.apache.ibatis.logging.stdout.StdOutImpl;

public class Car extends Vehicle{

    public Car(Workshop workshop) {
        super(workshop);
    }

    @Override
    public void repair() {
        System.out.println("Automovil: ");
        workshop.repair();
    }
}
