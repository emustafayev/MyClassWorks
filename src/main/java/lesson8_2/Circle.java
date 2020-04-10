package lesson8_2;

public class Circle extends Figure {
    private int radius;
    private Point center;

    public static Circle rand() {
        return new Circle(Point.rand(),Extra.rand());
    }

    public Circle(Point center, int radius){
        this.center=center;
        this.radius=radius;
    }
}
