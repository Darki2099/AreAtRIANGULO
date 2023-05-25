<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.TrianguloBean"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado - Área Triángulo</h1>
        <%
        String n1=request.getParameter("base");
        String n2=request.getParameter("altura");
                 
        TrianguloBean bean = (TrianguloBean)request.getAttribute("Resultado");
        %>
        <h3>
            <%= bean.getArea() %>
        </h3>
    </body>
</html>