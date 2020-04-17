
public class Main {
    public static void main(String[] args) {
         Circle circle1 = new Circle(10);
        Shape circle2 = new Circle(3);
         Rectangle rect1 = new Rectangle(1,4,1,4);
        Polygon rect2 = new Rectangle(8, 5, 8, 5);
         Rectangle rec3 = new Rectangle(6,6,6,6);
        Polygon tri1 = new Triangle(2, 2, 2);
        Triangle tri2 = new Triangle(4, 4, 6);
        Shape tri3 = new Triangle(2, 2, 2);

        circle1 = (Circle)circle2;
        rect2 = (Rectangle)rec3;
        tri1 = (Triangle)tri3;
        //cricle2 = (Sh)tri3;
        tri3 = tri2;
        //rect3 = new Shape(2, 3, 2);
        System.out.println(tri1.toString());
    }
}