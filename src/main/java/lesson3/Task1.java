package lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Height: ");
        final int height = sc.nextInt();
        System.out.println("Width: ");
        final int width = sc.nextInt();
        double tan = ((double) width)/height;
        System.out.println(tan);
        StringBuilder envelope = new StringBuilder();

        for (int i=1;i<=height;i++){
            for(int j=1;j<=width;j++){
                if(isShouldBeFilled(i,j,height,width,tan)){
                    envelope.append("*");
                }else{
                    envelope.append(" ");
                }
            }envelope.append("\n");
        }
        System.out.println(envelope);
    }
    private static boolean isShouldBeFilled(int i,int j, int height, int width, double tan) {
        return i==1 || j==1 || i==height ||j==width || j == (int)(i*tan) || width-j == (int)Math.round(i*tan);
    }
}
