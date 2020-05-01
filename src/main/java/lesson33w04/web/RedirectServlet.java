package lesson33w04.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectServlet extends HttpServlet {

  private final String redirectTo;

  public RedirectServlet(String redirectTo) {
    this.redirectTo = redirectTo;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    if (
        // you can do more sophisticated checks here
        true
    ) {
      resp.sendRedirect(redirectTo);
    }
  }
}
