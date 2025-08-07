package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstStr = req.getParameter("first");
        String secondStr = req.getParameter("second");
        String operator = req.getParameter("operator");

        if (firstStr != null && secondStr != null && operator != null) {
            double first = Double.parseDouble(firstStr);
            double second = Double.parseDouble(secondStr);

            double result = 0;
            switch (operator) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    result = first / second;
                    break;
            }

            req.setAttribute("first", first);
            req.setAttribute("second", second);
            req.setAttribute("operator", operator);
            req.setAttribute("result", result);
        }

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}

