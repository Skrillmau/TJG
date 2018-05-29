<%-- 
    Document   : homecliente
    Created on : May 27, 2018, 11:01:28 PM
    Author     : juanc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% HttpSession sesion;%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Cliente!</h1>
        <p> ${cliente.nombres} </p>
        <p> ${cliente.usuario} </p>
    </body>
     <form action="Catalogo" method="post">
            <input type="submit" class="btn btn-danger" id="boton1" value="Carrito" class="btn"/>

        </form>
</html>
