package lesson32w03.homework;

import java.util.HashMap;
import java.util.Map;

public class AuthDao {
    private static Map<String,String> users = new HashMap<>();

    public boolean addUser(String username, String password){
        if (!checkUser(username)){
            users.put(username,password);
            return true;
        }
        return false;
    }

    public boolean checkUser(String username){
        return users.containsKey(username);
    }

    public boolean authenticate(String username, String password){
        return users.get(username).equals(password);
    }
}
