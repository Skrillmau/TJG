<%-- 
    Document   : RegistroEmpleados
    Created on : May 27, 2018, 11:09:53 PM
    Author     : juanc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="formulario">
            <h1>Crear Usuario Empleado</h1>
            <form action = "Registroe" method="post" class="form">
                <input type="text" class="campos" name="user" placeholder="Usuario"/>
                <input type="password" class="campos" name="pass" placeholder="Contraseña"/>
                <input type="text" class="campos" name="cedula" placeholder="Cedula"/>
                <input type="text" class="campos" name="nombres" placeholder="Nombres"/>
                <input type="text" class="campos" name="duracion" placeholder="Duracion"/>
                <input type="text" class="campos" name="eps" placeholder="EPS"/>
                <input type="text" class="campos" name="arl" placeholder="ARL"/>
                <input type="text" class="campos" name="rh" placeholder="RH"/>
                <input type="text" class="campos" name="caja" placeholder="Caja"/>
                <input type="text" class="campos" name="fondo" placeholder="Fondo de pension"/>
                
                <c:forEach items="${departamentos}" var="departamento" varStatus="status">
                    <select name="iddeppartamentos">
                        <option value="${departamento.idtipo}"> ${departamento.nombre}</option>
                    </select>
                </c:forEach>

                <div class="btn-group" role="group" aria-label="...">
                    <input type="submit" class="btn btn-danger" id="boton1" value="Log in" class="btn"/>
                    <a href="/check.html" class="link">¿Olvidó su contraseña?</a>
                    <a href="/Panificadorapp/registro.jsp" class="link">Registrarse <a/>
                        </form>
                </div>
                </body>
                </html>
