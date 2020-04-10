package lesson22;

public class Fibonacci {

    public static void main(String[] args) {
        int N = 10000;//1,2,3,4,5  1,1,2,3,5,8,13,21
        System.out.println(fibonacci(N));
    }

    private static int fibonacci(int n) {
        if(n==1)return 1;
        if (n==2) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
