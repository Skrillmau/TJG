<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <c:forEach items="${listaproductos}" var="producto" varStatus="status">
                <p>${producto.nombreproducto}</p>  
                <p>${producto.precio}</p>
                <p>${producto.idproducto}</p>
                 <form action="Carrito?precio=${producto.precio}&nombre=${producto.nombreproducto}&id=${producto.idproducto}" method="post">
            <input type="submit" class="btn btn-danger" id="boton1" value="Comprar" class="btn"/>

        </form>
            </c:forEach>
        </div>
    </body>
</html>
