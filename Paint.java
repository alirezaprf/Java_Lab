import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes;

    public Paint() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawAll() {
        for(Shape shape : shapes) {

            shape.draw();

        }
    }

    public void printAll() {
        for(Shape shape : shapes) {

            System.out.println(shape.toString());
        }
    }

    public void describeEqualSides() {
        for(Shape shape : shapes) {
            if(shape instanceof Triangle) {


                Triangle triangle = (Triangle) shape;
                if(triangle.isEquilateral())
                    System.out.println(triangle.toString());
            } 
            
            
            else if(shape instanceof Rectangle){


                Rectangle rect = (Rectangle) shape;
                if(rect.isSquare())
                    System.out.println(rect.toString());
            }
        }
    }
}