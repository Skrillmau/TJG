<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <head>
        <title>Ingreso clientes</title>
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
                    <li class="nav-item">
                        <a href="index.jsp">Home</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle active" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Login <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item">
                                <a href="loginEmpleados.jsp">Login Personal</a>
                            </li>
                            <li role="separator" class="divider"></li>
                            <li class="nav-item active">
                                <a href="loginClientes.jsp">Login Clientes</a>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a href="Registroclientes.jsp">Registro Clientes</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h1 style="color: whitesmoke;">
                        Portal de clientes
                    </h1>
                    <form action = "loginc" method="post" id="formUsuario">
                        <h3>
                            <b>
                                <br>Ingrese sus credenciales</b>
                        </h3>
                        <p>Nombre de Usuario:
                            <br>
                            <input type="text" name="user" maxlength="30" required="required" placeholder="Nombre" />
                        </p>
                        <p>Contraseña:
                            <br>
                            <input type="password" name="pass" maxlength="30" required="required" placeholder="Contraseña" />
                        </p>
                        <br>
                        <p>
                            <input type="submit" class="btn btn-success" value="Log in">
                        </p>
                        <br>
                    </form>

                </div>
                <div id="botones-Menu">
                    <a href="index.jsp">
                        <br><input type="submit" class="btn-Menu" value="Home">
                    </a>
                </div>
            </div>
        </div>
    </body>

</html>