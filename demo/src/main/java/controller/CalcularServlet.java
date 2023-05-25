package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.CalculadoraArea;
import model.TrianguloBean;

@WebServlet(name="CalcularServlet", urlPatterns={ "/servlets/CalcularServlet" })
public class CalcularServlet extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    /*
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    PrintWriter out = response.getWriter();
    */

    String operation = request.getParameter("operation");
    float base = Float.parseFloat(request.getParameter("base"));
    float altura = Float.parseFloat(request.getParameter("altura"));
    float result = 0;

    switch(operation)
    {
      case "AREA":
        CalculadoraArea calculadora = new CalculadoraArea();
        TrianguloBean bean = new TrianguloBean();

        bean.setArea(calculadora.obtenerAreaTriangulo(base, altura));

        request.setAttribute("Resultado", bean);
        operation = "*";
        break;
    }

    request.getRequestDispatcher("../view/resultado.jsp").forward(request, response);
  /*
    String html = String.join("\n", "<!DOCTYPE html>",
      "<html lang=\"es\">",
      " <head>",
      "  <meta charset=\"UTF-8\">",
      "  <title>" + getServletName() + "</title>",
      " </head>",
      " <body>",
      "  <h1>" + getServletName() + "</h1>",
      "  <p>" + String.format(Locale.ROOT, "%.0f %s %.0f = %.1f", base, operation, altura, result) + "</p>",
      " </body>",
      "</html>"
    );
    out.println(html);
  */
  }
}
