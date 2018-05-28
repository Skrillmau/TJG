<%-- 
    Document   : Carrito
    Created on : May 28, 2018, 4:46:26 AM
    Author     : juanc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Modelo.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<Producto> comprados = new ArrayList();%>
<% HttpSession sesion; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EL Carrito aletoso!</h1>
        <div>

            <div class="principal">
                <%  sesion = request.getSession(false);
                    if (sesion.getAttribute("carritocompras") != null) {%>
                <table> <tr><th>codigo</th><th>Nombre</th><th>Precio </th>

                        <% ArrayList<Producto> Lista = (ArrayList<Producto>) sesion.getAttribute("carritocompras");
                            for (int i = 0; i < Lista.size(); i++) {%>  
                    <tr>
                        <td><%=Lista.get(i).getIdproducto()%></td>
                        <td><%=Lista.get(i).getNombreproducto()%> </td>
                        <td><%=Lista.get(i).getPrecio()%></td>
                    <form action = "Compra" method="post">  
                        <td><input type="text" class="campos" name="cantidad<%=Lista.get(i).getIdproducto()%>" placeholder="insertecantidad<%=i%>"/></td>
                        <td><a href="eliminarproducto?productoid=0"> ELIMINAR </a></td>
                        </tr>

                        <%} %>


                        <%}%>
                </table>





            </div>
        </div>

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
        <% ArrayList<Producto> Lista= (ArrayList<Producto>)sesion.getAttribute("carritocompras"); %>
           <%  request.getSession().setAttribute("comprados", Lista);%>
            <input type="submit" class="btn btn-danger" id="boton1" value="Comprar" class="btn"/>
        </form>






    </body>
</html>
