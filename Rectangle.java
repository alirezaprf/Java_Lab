
public class Rectangle extends Polygon {

    public Rectangle(double a, double b, double c, double d) {
        super();

        sides.add(a);
        sides.add(b);
        sides.add(c);
        sides.add(d);

        
    }
    @Override
    public double calculatePerimeter() {
        double prim = 0;
        for(double side : sides) {
            prim += side;
        }
        return prim;
    }




    public boolean isSquare() {
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) && sides.get(2).equals(sides.get(3));
    }

    

    @Override
    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }

    @Override
    public void draw() {
        //draw a rectangoool
    }

    @Override
    public String toString() {
        return "Im am not Recangle";
    }
}
