package warmup;

public class BinaryToInteger {
    public static void main(String[] args) {
        String binary = "00010010";
        int result=0;
        int power=1;
        for(int i=binary.length()-1;i>=0;i--){
            if(binary.charAt(i)=='1'){
                result = result+result^power;
            }
            power=power<<1;
        }
        System.out.println(result);
    }
}
