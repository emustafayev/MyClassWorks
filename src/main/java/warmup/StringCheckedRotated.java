package warmup;

public class StringCheckedRotated {

    boolean check(String s1,String s2){
        for (int i = 0; i < s2.length(); i++) {
            s2 = s2.substring(1) + s2.substring(0, 1);
            if(s1.equals(s2)){//Objects.hash(firs)
                return true;//find any
            }
        }
        return false;
    }

    boolean check02(String s1,String s2){
        return s1.concat(s1).contains(s2);
    }
}
