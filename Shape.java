public interface Shape {
    public double calculatePerimeter();
    public double calculateArea();
    public void draw();
    @Override
    boolean equals(Object obj);
    public String toString();
}
