<%-- 
    Document   : CrearProducto
    Created on : May 28, 2018, 1:59:36 AM
    Author     : juanc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Modelo.Tipos"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% HttpSession sesion;%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="formulario">
            <h1>Crear Producto</h1>
            <form action = "Registrop" method="post" class="form" enctype="multipart/form-data">
                <input type="text" class="campos" name="idproducto" placeholder="ID producto"/>
                <input type="text" class="campos" name="nombre" placeholder="Nombre del producto"/>
                <input type="number" class="campos" name="inventario" placeholder="Inventario"/>
                <input type="number" class="campos" name="precio"placeholder="Precio" />

                <c:forEach items="${proveedores}" var="proveedor" varStatus="status">
                    <select name="idproveedor">
                        <option value="${proveedor.idtipo}"> ${proveedor.nombre}</option>


                    </select>
                </c:forEach>
                <input type="file" name="imagenp">

                <div class="btn-group" role="group" aria-label="...">
                    <input type="submit" class="btn btn-danger" id="boton1" value="Crear Producto" class="btn"/>

            </form>
            <a href="home.jsp"> Volver </a>

    </body>
</html>
