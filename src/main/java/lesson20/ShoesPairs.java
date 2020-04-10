package lesson20;

public class ShoesPairs {
    public int calc(String origin) {
        int numbers = 0;
        int interval=0;
        for(int i=0;i<origin.length();i++){
            if(origin.charAt(i)=='L') {
                interval++;
            }else {
                interval--;
            }
            if(interval==0){
                numbers++;
            }
        }
        return numbers;
    }
}
//