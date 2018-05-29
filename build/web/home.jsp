<%-- 
    Document   : home
    Created on : May 27, 2018, 7:43:19 PM
    Author     : juanc
--%>

<%@page import="Modelo.Tipos"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% HttpSession sesion;%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p> ${empleado .nombres} </p>
        <p> ${empleado.usuario} </p>
        <p> ${empleado.eps} </p>
        <p> ${empleado.arl} </p>
        <p> ${empleado.rh} </p>
        <p> ${empleado.cj} </p>
        <p> ${empleado.fp} </p>
        <p> ${empleado.idepartamento} </p>
        <form action="Producto" method="post">
            <input type="submit" class="btn btn-danger" id="boton1" value="Productos" class="btn"/>

        </form>
        <form action="CrearEmpleado" method="post">
            <input type="submit" class="btn btn-danger" id="boton1" value="Crear Empleado" class="btn"/>

        </form>
        <form action="Catalogoe" method="post">
            <input type="submit" class="btn btn-danger" id="boton1" value="Catalogo" class="btn"/>

        </form>
        <form action="CrearDepartamento" method="post">
            <input type="submit" class="btn btn-danger" id="boton1" value="Crear Departamento" class="btn"/>

        </form>
        </form>
        <form action="CrearCargo" method="post">
            <input type="submit" class="btn btn-danger" id="boton1" value="Crear Cargo" class="btn"/>

        </form>
    </body>
</html>
