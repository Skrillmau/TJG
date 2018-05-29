<%-- 
    Document   : CatalogoE
    Created on : May 28, 2018, 3:47:11 AM
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

        <c:forEach items="${listaproductos}" var="producto" varStatus="status">
            <div class="producto_img">
                <img src="Productos/${producto.path}"/>
            </div>
            <p>${producto.nombreproducto}</p>  
            <p>${producto.precio}</p>
            <p>${producto.inventario}</p>
            <p>${producto.idproducto}</p>
            <form action="Eliminar?id=${producto.idproducto}" method="post">
                <input type="submit" class="btn btn-danger" id="boton1" value="Eliminar" class="btn"/>

            </form>

        </c:forEach>
        <a href="home.jsp"> Volver </a>
    </body>
</html>
