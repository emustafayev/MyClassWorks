package lesson8;

public class Triangle extends Figure {
    private Point p1,p2,p3;
    public Triangle(Point point1, Point point2, Point point3){
        p1=point1;
        p2=point2;
        p3=point3;
    }

    @Override
    public int area(){
        return  Math.abs((int) (p1.X*(p2.Y-p3.Y) + p2.X*(p3.Y-p1.Y)+p3.X * (p1.Y-p2.Y))/2);
    }
    @Override
    public String toString(){
        return "Triangle!";
    }

}
