package lesson33w04.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8080);
    ServletContextHandler handler = new ServletContextHandler();

    // Service creation
    Calculator calc = new Calculator();
    // the only task is to MAP the SERVLET to the PATH
    //                                                     OS file location / URL part of mapping
    handler.addServlet(new ServletHolder(new StaticServlet("css")), "/css/*");
    handler.addServlet(new ServletHolder(new StaticServlet("js")), "/js/*");
    handler.addServlet(new ServletHolder(new StaticServlet("images")), "/images/*");

    handler.addServlet(new ServletHolder(new CalcServlet(calc)), "/calc/*");
    handler.addServlet(new ServletHolder(new LoginServlet(calc)), "/login/*");

    handler.addServlet(new ServletHolder(new RedirectServlet("/login")), "/*");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
