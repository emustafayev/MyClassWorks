package warmup;

public class IntegerToBinary {
    public static void main(String[] args) {
        int value = 18;
        // your code should be written here
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int part = value>>(7-i);
            int bit = part & 0b00000001;
            System.out.println(part);
        }
        while(value>0){
            binary.append(value & 0b1);
            value=value>>1;
        }
        System.out.println(binary.reverse().toString()); // 00001100
    }
}
