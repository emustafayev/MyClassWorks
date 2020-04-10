package lesson8_2;

public class Point {
    int x;
    int y;

    public static Point rand(){
        return new Point(Extra.rand(), Extra.rand());
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
