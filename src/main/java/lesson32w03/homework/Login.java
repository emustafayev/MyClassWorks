package lesson32w03.homework;

public class Login {
    AuthDao dao = new AuthDao();
    public String login(String username, String password){
        return !dao.authenticate(username,password)?"Username or password are wrong":"Logged in successfully!";
    }
}
