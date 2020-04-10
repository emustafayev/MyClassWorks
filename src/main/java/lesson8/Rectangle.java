package lesson8;

public class Rectangle extends Figure {
    private Point p1;
    private Point p2;
    public Rectangle(Point point1, Point point2){
        this.p1=point1;
        this.p2 = point2;
    }
    @Override
    public int area(){
        return (p2.X-p1.X)*(p2.Y-p1.Y);
    }
    @Override
    public String toString(){
        return "Rectangle!";
    }
}
