package lesson8;

public class Circle extends Figure {
     private Point p1;
     private int radius;
     public Circle(Point point, int radius){
         this.p1=point;
         this.radius=radius;
     }

     @Override
     public int area(){
         return (int) (Math.PI*Math.pow(this.radius,2));
     }

    @Override
    public String toString(){
        return "Circle!";
    }
}
