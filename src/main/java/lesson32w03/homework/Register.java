package lesson32w03.homework;

public class Register {
    AuthDao dao = new AuthDao();
    public String register(String username, String password) {
        return dao.addUser(username, password) ?"User registered successfully!":"User already exists";
    }
}
