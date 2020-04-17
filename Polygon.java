import java.util.ArrayList;

public abstract class Polygon implements Shape {
    protected ArrayList<Double> sides;
    public Polygon() {
        sides = new ArrayList<Double>();
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public String toString() {
        return "poly\n";
    }

}