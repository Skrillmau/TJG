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

                <select name="iddeppartamentos">
                    <c:forEach items="${departamentos}" var="departamento" varStatus="status">
                        <option value="${departamento.idtipo}"> ${departamento.nombre}</option>
                    </c:forEach>
                </select>
                
                <select name="idcargo">
                    <c:forEach items="${cargos}" var="cargo" varStatus="status">
                        <option value="${cargo.idtipo}"> ${cargo.nombre}</option>
                    </c:forEach>
                </select>
                
                <select name="tipoempleado">
                    <option value="Admin">Administrador</option>
                    <option value="Empleado">Empleado</option>
                </select>

                <div class="btn-group" role="group" aria-label="...">
                    <input type="submit" class="btn btn-danger" id="boton1" value="Log in" class="btn"/>
                    <a href="home.jsp"> Volver </a>

            </form>
        </div>
    </body>
</html>
