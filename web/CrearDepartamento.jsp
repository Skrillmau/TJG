<%-- 
    Document   : CrearDepartamento
    Created on : 28/05/2018, 08:24:58 PM
    Author     : mate_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="formulario">
            <h1>Crear Departamento</h1>
            <form action = "Registrodep" method="post" class="form">
                <input type="text" class="campos" name="nombre" placeholder="Nombre del departamento"/>
                <input type="text" class="campos" name="descripcion" placeholder="Descripcion"/>               
                <div class="btn-group" role="group" aria-label="...">
                    <input type="submit" class="btn btn-danger" id="boton1" value="Crear Producto" class="btn"/>

            </form>
            <a href="home.jsp"> Volver </a>


    </body>
</html>
