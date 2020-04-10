package lesson9.Streams.StaticMethodsInterfaces;

public class Main {
    public static void main(String[] args) {
        StringProcessor toLower = new StringProcessor() {
            @Override
            public String process(String s) {
                return s.toLowerCase();
            }
        };
        StringProcessor toUpper = new StringProcessor() {
            @Override
            public String process(String s) {
                return s.toUpperCase();
            }
        };

        String s = toLower.process("DDAJHDJLAHSDJAHSAHSJ");
        System.out.println(s);
        System.out.println("Lower: "+StringProcessor.isLowerCase(s));
        System.out.println("Upper: "+StringProcessor.isUpperCase(s));
    }
}
