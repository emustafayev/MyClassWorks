package lesson23;

public class GCDApp {
    private int numbers=2;
    public int gcd(int a, int b){
        if (b%a==0)  return a;
        if (a%b==0) return b;

        if(numbers>a || numbers>b) return 1;

        if(a % numbers==0 && b % numbers==0){
            return numbers * gcd(a/numbers,b/numbers);
        }else {
            numbers++;
            return gcd(a,b);
        }
    }
}
