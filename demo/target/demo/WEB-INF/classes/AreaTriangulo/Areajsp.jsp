package AreaTraignulo;

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   
        <h1>Área Triángulo</h1>
        <%
        String n1=request.getParameter("base");
        String n2=request.getParameter("altura");
                 
        Triangulo t=new Triangulo(n1,n2);
        t.sacarArea();
        int area=t.getArea();
        %>
