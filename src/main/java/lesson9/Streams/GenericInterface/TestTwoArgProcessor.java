package lesson9.Streams.GenericInterface;

public class TestTwoArgProcessor {
    public static void main(String[] args) {
        TwoArgsProcessor<Integer> intProcess = new TwoArgsProcessor<Integer>() {
            @Override
            public Integer process(Integer arg1, Integer arg2) {
                return arg1*arg2;
            }
        };
        TwoArgsProcessor<String > stringProcess = new TwoArgsProcessor<String>() {
            @Override
            public String process(String arg1, String arg2) {
                return arg1+arg2;
            }
        };
        TwoArgsProcessor<Double> doubleProcess = new TwoArgsProcessor<Double>() {
            @Override
            public Double process(Double arg1, Double arg2) {
                return arg1+arg2;
            }
        };
        System.out.println(intProcess.process(2,4));
        System.out.println(stringProcess.process("Hello ","World"));
        System.out.println(doubleProcess.process(3d,4d));

        TwoIntProcess intprocess2 = Integer::sum;//MAGIC HAPPENED HERE
    }
}
