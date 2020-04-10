package lesson8_2;

public class Rectangle extends Figure {
    Point p1;
    Point p2;

    public static Figure rand(){
        return new Rectangle(Point.rand(), Point.rand());
    }

    public Rectangle(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }
}
