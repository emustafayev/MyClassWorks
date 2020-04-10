package lesson31w02.operationsServlet;

import org.eclipse.jetty.servlet.Source;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class OperationApp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter w = resp.getWriter()){
            String x = req.getParameter("x");
            String y =  req.getParameter("y");
            String op = req.getParameter("op");
            String s = Calculator.doOperation(x, y, op);
            w.write(s);
        }
    }



}
