<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Interfaz Usuario</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Css/background.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>

    <body>

        <nav class="navbar navbar-default fixed-top">
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <div class="navbar-header">
                    <img src="Css/imagenes/Logo_con_texto.png" class="Banner">
                    <a class="navbar-brand" href="index.jsp">The Journey Group</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="nav-item active">
                        <a href="homecliente.jsp">Home</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Acciones<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item active">
                                <form action="Catalogo" method="post">
                                    <input type="submit" class="btn-Menu" value="Catalogo" />
                                </form>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center" style="color: whitesmoke;">
                    <h1 class="mt-5">Catalogo</h1>
                </div>
                <div class="col-lg-12 text-center" style="color: whitesmoke; background: url('Css/imagenes/lineas.jpg'); background-size: cover; padding: 10px;">
                    <c:forEach items="${listaproductos}" var="producto" varStatus="status">
                        <div class="producto_img">
                            <img src="Productos/${producto.path}"/>
                        </div>
                        <p>${producto.nombreproducto}</p>  
                        <p>${producto.precio}</p>
                        <p>${producto.inventario}</p>
                        <p>${producto.idproducto}</p>
                        <form action="Carrito?precio=${producto.precio}&nombre=${producto.nombreproducto}&id=${producto.idproducto}" method="post">
                            <input type="submit" class="btn btn-success" value="Comprar" />
                        </form>
                    </c:forEach>
                </div>
                <div id="botones-Menu">
                    <a href="homecliente.jsp">
                        <br><input type="submit" class="btn-Menu" value="Home">
                    </a>
                </div>
            </div>
        </div>
    </body>

</html>