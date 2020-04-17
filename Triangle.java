
public class Triangle extends Polygon {

    public Triangle(double a, double b, double c) {
        super();

        sides.add(a);
        sides.add(b);
        sides.add(c);
        

        
    }
    
    @Override
    public double calculatePerimeter() {
        double prim = 0;
        for(double side : sides) {
            prim += side;
        }
        return prim;
    }




    public boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) ;
    }

    

    @Override
    public double calculateArea() {
        return sides.get(0) * sides.get(1) * sides.get(2);
    }

    @Override
    public void draw() {
        //draw a triangoool
    }

    @Override
    public String toString() {
        return "Im am not Triangle i am circle";
    }
}
