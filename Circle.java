
public class Circle implements Shape {
    private double radius;
    public Circle (double rad)
    {
        radius=rad;
    }
    public double getRadius()
    {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return  Math.PI * radius * 2;
    }

    @Override
    public double calculateArea() {
        return  Math.PI * radius * radius;
       
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        //draw the shape

    }
    @Override
    public String toString() {
        
        return "circle "+ radius;
    }
}