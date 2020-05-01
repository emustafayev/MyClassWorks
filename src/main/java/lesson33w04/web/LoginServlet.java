package lesson33w04.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.stream.Collectors;

public class LoginServlet extends HttpServlet {

  private Calculator calc;

  public LoginServlet(Calculator calc) {
    this.calc = calc;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String content = new BufferedReader(new FileReader(new File("content/login.html"))).lines()
        .collect(Collectors.joining("\n"));

    try (PrintWriter writer = resp.getWriter()) {
      writer.write(content);
    }
  }

}
