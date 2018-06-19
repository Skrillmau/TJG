<%@page import="Modelo.Tipos"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<% HttpSession sesion;%>
<html lang="en">

    <head>
        <title>Interfaz Empleado Admin</title>
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
                        <a href="homeEmpleado.jsp">Home</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> Acciones <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item">
                                <form action="Catalogoe" method="post">
                                    <br><input type="submit" class="btn btn-success" value="Catalogo" />
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
                    <h1 class="mt-5">Bienvenido</h1>
                    <form id="formUsuario">
                        <h2><b>Nombre: </b> ${empleado .nombres} </h2>
                        <h2><b>Usuario: </b> ${empleado.usuario} </h2>
                        <h2><b>EPS: </b> ${empleado.eps} </h2>
                        <h2><b>ARL: </b> ${empleado.arl} </h2>
                        <h2><b>RH: </b> ${empleado.rh} </h2>
                        <h2><b>Caja compensacion: </b> ${empleado.cj} </h2>
                        <h2><b>Fondo pension: </b> ${empleado.fp} </h2>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>