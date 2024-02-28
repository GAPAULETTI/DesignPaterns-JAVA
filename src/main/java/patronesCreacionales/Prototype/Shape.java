package patronesCreacionales.Prototype;

public class Shape implements IShape {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public IShape clonar() {
        IShape shapeClone = null;
        try {
           shapeClone = (Shape) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return shapeClone ;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }
}
