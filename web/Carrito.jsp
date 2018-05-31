<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Modelo.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<Producto> comprados = new ArrayList();%>
<% HttpSession sesion; %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Carrito de Compras</title>
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
                            <li class="nav-item">
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
                    <h1 class="mt-5">Carrito de Compras</h1>
                </div>
                <div id="formUsuario1">
                    <form action = "Compra" method="post">
                        <%  sesion = request.getSession(false);
                            if (sesion.getAttribute("carritocompras") != null) {%>
                        <table class="table table-hover"> 
                            <tr><th> Codigo </th><th> Nombre </th><th> Precio </th><th> Cantidad </th><th> Eliminar </th>

                                <% ArrayList<Producto> Lista = (ArrayList<Producto>) sesion.getAttribute("carritocompras");
                                    for (int i = 0; i < Lista.size(); i++) {%>  
                            <tr>
                                <td><%=Lista.get(i).getIdproducto()%></td>
                                <td><%=Lista.get(i).getNombreproducto()%> </td>
                                <td><%=Lista.get(i).getPrecio()%></td>
                                <td><input type="number" class="campos" name="cantidad<%=Lista.get(i).getIdproducto()%>" placeholder="insertecantidad<%=i%>" required="required"  /></td>
                                <td><a href="eliminarproducto?productoid=<%=Lista.get(i).getIdproducto()%>"> ELIMINAR </a></td>
                            </tr>

                            <%} %>
                            <%}%>
                        </table>
                        <p>METODO DE PAGO</p>

                        <c:forEach items="${metodos}" var="metodo" varStatus="status">
                            <select name="idmetodo">

                                <option value="${metodo.idtipo}"> ${metodo.nombre}</option>
                            </select>
                        </c:forEach>


                        <p>METODO DE ENTREGA</p>

                        <c:forEach items="${metodosen}" var="metodoen" varStatus="status">
                            <select name="idmetodoen">

                                <option value="${metodoen.idtipo}"> ${metodoen.nombre}</option>
                            </select>
                        </c:forEach>
                        <% ArrayList<Producto> Lista = (ArrayList<Producto>) sesion.getAttribute("carritocompras"); %>
                        <%  request.getSession().setAttribute("comprados", Lista);%>
                        <br></br><input type="submit" class="btn btn-success" value="Comprar" /><br></br>
                    </form>
                </div>
                <br>
                <div id="botones-Menu">
                    <form action="Catalogo" method="post">
                        <input type="submit" class="btn-Menu" value="Regresar" />
                    </form><br>
                    <a href="homecliente.jsp">
                        <input type="submit" class="btn-Menu" value="Home">
                    </a>
                </div>
            </div>
        </div>
    </body>

</html>
