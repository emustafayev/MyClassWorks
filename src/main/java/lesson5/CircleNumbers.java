package lesson5;

public class CircleNumbers {
    public static void main(String[] args) {
        int [][] arr = new int[12][12];
        int count=0;
        for(int i=0;i<=11;i++){
            for (int j = 0; j <= 11; j++) {
                if(j==count && i>=count){
                    arr[i][j] = count;
                    System.out.println("Here!");
                }

            }count++;
        }

        for(int i=0;i<arr[0].length-1;i++){
            for (int j = 0; j < arr[1].length-1; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
