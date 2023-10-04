public class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double CalculateArea() {
        return Math.PI * radius * radius;
    }
}

