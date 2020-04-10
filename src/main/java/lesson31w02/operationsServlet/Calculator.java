package lesson31w02.operationsServlet;

import java.io.PrintWriter;
import java.util.Optional;

public class Calculator {
    static String doOperation(String p1, String p2, String op){
        if (Parse(p1).isPresent() && Parse(p2).isPresent()){
            int x = Parse(p1).get();
            int y = Parse(p2).get();


            switch (op){
                case "+": return String.format("%d + %d = %d",x,y,(x + y));
                case "-": return String.format("%d - %d = %d",x,y,(x - y));
                case "*": return String.format("%d * %d = %d",x,y,(x * y));
                case "/": return (y!=0)?String.format("%d / %d = %f",x,y,((float)x / (float)y)):"Invalid Operation";
                default:  return "Invalid op";
            }

        }else return "Cant parse params";
    }


    private static Optional<Integer> Parse(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
