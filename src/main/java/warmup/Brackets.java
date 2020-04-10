package warmup;
import java.util.Stack;

public class Brackets {
    public int calc(String origin) {
        Stack<Character> stack = new Stack<>();
        char[] arr = origin.toCharArray();
        int level=0;
        int temp = 0;
        for (char c : arr) {
            if(c==')'){
                temp=stack.size();
                stack.pop();
            }else{
                stack.push(c);
            }////////////////////////
            if(temp>level){
                level=temp;
            }
        }
        return level;
    }
}
