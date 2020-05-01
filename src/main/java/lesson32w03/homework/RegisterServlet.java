package lesson32w03.homework;

import org.eclipse.jetty.servlet.Source;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.stream.Collectors;

public class RegisterServlet extends HttpServlet {
    Register register;

    public RegisterServlet(Register register) {
        this.register=register;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String htmlRegister = new BufferedReader(new FileReader(new File("content/register.html"))).lines()
                .collect(Collectors.joining("\n"));
        try(PrintWriter writer = resp.getWriter()){
            writer.write(htmlRegister);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        try(PrintWriter writer = resp.getWriter()){
            writer.write(register.register(username,password));
        }
    }
}
