package lesson8;

import java.util.Random;

public class Point {
    Random rand = new Random();
    public int X;
    public int Y;
    public Point(){
        this.X=rand.nextInt(101);
        this.Y=rand.nextInt(101);
    }
}
