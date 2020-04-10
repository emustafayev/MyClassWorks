package lesson8;

import java.util.ArrayList;
import java.util.Random;

enum Figures{
    Circle,TRIANGLE,RECTANGLE
}

public class GeometryWithRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int COUNT_OF_FIGURES=10;
        int TYPE_OF_FIGURES=3;
        int RADIUS_BOUND=20;
        ArrayList<Figure> figures = new ArrayList<>();
        int radius = rand.nextInt(RADIUS_BOUND+1);

        int n = rand.nextInt(COUNT_OF_FIGURES)+COUNT_OF_FIGURES;
        for(int i=0;i<n;i++){
            int choice = rand.nextInt(TYPE_OF_FIGURES);
            switch (choice){
                case 0:
                    figures.add(new Rectangle(new Point(),new Point()));
                    break;
                case 1:
                    figures.add(new Circle(new Point(),radius));
                    break;
                case 2:
                    figures.add(new Triangle(new Point(),new Point(),new Point()));
                    break;
            }
        }
        int total=0;
        for(Figure fig:figures){
            total+=fig.area();
            System.out.println(fig.toString());
        }
        System.out.println(total);
    }

}
