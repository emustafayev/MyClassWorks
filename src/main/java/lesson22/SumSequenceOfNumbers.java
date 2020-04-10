package lesson22;

public class SumSequenceOfNumbers {
    public static void main(String[] args) {
        int N = 5;//1,2,3,4,5
        System.out.println(sum(N));
    }

    private static int sum(int N) {
        int number=0;
        return sumr(N,number);
    }

    private static int sumr(int n, int number) {
        if(number>=n){
            return 0;
        }
        number++;
        return number + sumr(n,number);
    }
}
