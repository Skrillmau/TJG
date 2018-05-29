<%-- 
    Document   : CrearCargo
    Created on : 28/05/2018, 11:16:55 PM
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
            <h1>Crear Cargo</h1>
            <form action = "Registrocar" method="post" class="form">
                <input type="text" class="campos" name="idcargo" placeholder="ID del cargo"/>
                <input type="text" class="campos" name="objetivo" placeholder="Objetivo ventas"/>    
                <input type="text" class="campos" name="comisiones" placeholder="Comisiones"/>               
                <input type="text" class="campos" name="memorandos" placeholder="Memorandos"/>               
                <input type="text" class="campos" name="nombre" placeholder="Nombre del cargo"/>               
            
                <div class="btn-group" role="group" aria-label="...">
                    <input type="submit" class="btn btn-danger" id="boton1" value="Crear Cargo" class="btn"/>

            </form>
            <a href="home.jsp"> Volver </a>
    </body>
</html>
