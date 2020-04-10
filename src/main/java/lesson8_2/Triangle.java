package lesson8_2;

public class Triangle extends Figure {
    Point p1;
    Point p2;
    Point p3;

    public static Figure rand(){
        return new Triangle(Point.rand(), Point.rand(), Point.rand());
    }

    public Triangle(Point p1, Point p2, Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
}
