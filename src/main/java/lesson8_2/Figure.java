package lesson8_2;

public class Figure {

    public static Figure rand(){
        switch((int)(Math.random()*3)){
            case 0: return Rectangle.rand();
            case 1: return Triangle.rand();
            default:; return Circle.rand();
        }
    }
    public int area(){ throw new IllegalArgumentException("Not Impl");}
}
// Created random Point, Created random Figures objects. Called randomly figures.
