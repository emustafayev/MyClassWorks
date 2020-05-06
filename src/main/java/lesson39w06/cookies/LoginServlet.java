package lesson39w06.cookies;

import org.eclipse.jetty.servlet.Source;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Arrays.stream(req.getCookies());
        String content = new BufferedReader(new FileReader(new File("./src/main/java/lesson39w06/template/loginForm.html"))).lines().
                collect(Collectors.joining("\n"));
        try (PrintWriter w = resp.getWriter()){
            w.write(content);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Cookie cookie = new Cookie("username",username);
        Cookie cookie1 = new Cookie("password",password);
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
        resp.sendRedirect("/calc/do/");
    }
}
