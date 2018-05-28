<%-- 
    Document   : Registroclientes
    Created on : May 27, 2018, 9:35:05 PM
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
        <div class="formulario">
                <h1>Crear Usuario Clientes</h1>
                <form action = "Registroc" method="post" class="form">
                    <input type="text" class="campos" name="user" placeholder="Usuario"/>
                    <input type="password" class="campos" name="pass" placeholder="Contraseña"/>
                    <input type="text" class="campos" name="cedula" placeholder="Cedula"/>
                    <input type="text" class="campos" name="nombres" placeholder="Nombres"/>
                    <input type="text" class="campos" name="correo" placeholder="Correo"/>
                    <input type="text" class="campos" name="telefono" placeholder="Telefono"/>
                    <input type="text" class="campos" name="direccion" placeholder="Direccion"/>
                    <input type="text" class="campos" name="ciudad" placeholder="Ciudad"/>
                    <input type="text" class="campos" name="mediocontatco" placeholder="Medio de Contacto"/>
                    <div class="btn-group" role="group" aria-label="...">
                    <input type="submit" class="btn btn-danger" id="boton1" value="Log in" class="btn"/>
                    <a href="/check.html" class="link">¿Olvidó su contraseña?</a>
                    <a href="/Panificadorapp/registro.jsp" class="link">Registrarse <a/>
                </form>
            </div>
    </body>
</html>
