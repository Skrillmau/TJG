<%-- 
    Document   : index
    Created on : May 27, 2018, 6:00:02 PM
    Author     : juanc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="formulario">
                <h1>Iniciar sesión Empleado</h1>
                <form action = "login" method="post" class="form">
                    <input type="text" class="campos" name="user" placeholder="Usuario"/>
                    <input type="text" class="campos" name="pass" placeholder="Contraseña"/>
                    <div class="btn-group" role="group" aria-label="...">
                    <input type="submit" class="btn btn-danger" id="boton1" value="Log in" class="btn"/>
                    <a href="/check.html" class="link">¿Olvidó su contraseña?</a>
                    <a href="/Panificadorapp/registro.jsp" class="link">Registrarse <a/>
                </form>
            </div>
    </body>
</html>
