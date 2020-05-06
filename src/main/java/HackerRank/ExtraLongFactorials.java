package HackerRank;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        extraLongFactorial(30);
    }

    static void extraLongFactorial(int n){
        BigInteger res = new BigInteger(String.valueOf(2));
        System.out.println(extraLongFactorialR(n,res));
    }

    private static BigInteger extraLongFactorialR(int n, BigInteger res) {
        if (n==2) return new BigInteger(String.valueOf(2));
        return res.multiply(extraLongFactorialR(n-1,res));
    }
}
