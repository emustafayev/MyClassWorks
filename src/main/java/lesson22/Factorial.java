package lesson22;

public class Factorial {
    public static void main(String[] args) {
        int N = 5;//1,2,3,4,5
        System.out.println(factorial(N));
    }

    private static int factorial(int N) {
        int number=0;
        return factR(N,number);
    }

    private static int factR(int n, int number) {
        if(number>=n){
            return 1;
        }
        number++;
        return number * factR(n,number);
    }
}
