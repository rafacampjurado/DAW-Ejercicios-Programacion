<%-- 
    Document   : index
    Created on : 16-feb-2018, 8:24:58
    Author     : rafa
--%>

<%@page import="objeto.perro.Perro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Año del Perro</title>
    </head>
    <body>
        <h1>Año chino del Perro</h1>
        <%
          Perro Kuki = new Perro("Kuki", "Hembra", "kuki.jpg");
          Perro Vicky = new Perro("Vicky", "Hembra", "vicky.jpg");
          Perro Chicho = new Perro("Chicho", "Macho", "chicho.jpg");

          out.print(Kuki);
          out.print(Vicky);
          out.print(Chicho);
          
          Kuki.ladrar();
          
        %>
    </body>
</html>
