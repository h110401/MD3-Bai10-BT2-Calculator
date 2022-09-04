package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Calculator;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculation")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(request.getParameter("first"));
        float secondOperand = Float.parseFloat(request.getParameter("second"));
        String operator = request.getParameter("operator");

        PrintWriter writer = response.getWriter();
        writer.println("<html><h1>");
        try {
            float result = Calculator.calculate(firstOperand, secondOperand, operator);
            writer.println(result);
        } catch (ArithmeticException e) {
            writer.println(e.getMessage());
        }
        writer.println("</h1></html>");

    }
}
