package lesson32w03.homework;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();

        Login login = new Login();
        Register register = new Register();

        handler.addServlet(new ServletHolder(new LoginServlet(login)),"/login/");
        handler.addServlet(new ServletHolder(new RegisterServlet(register)),"/register/");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
