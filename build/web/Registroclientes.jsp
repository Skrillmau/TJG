<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="es">

    <head>
        <title>Nuevo cliente</title>
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
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Login <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item">
                                <a href="loginEmpleados.jsp">Login Personal</a>
                            </li>
                            <li role="separator" class="divider"></li>
                            <li class="nav-item">
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
                        Registro clientes:
                    </h1>
                    <h3 style="color: whitesmoke;">
                        <b>
                            Porfavor Ingrese sus Datos
                    </h3>
                    <form action = "Registroc" method="post" class="form" id="formUsuario2">
                        <p><input type="text" name="user" placeholder="Usuario"/></p>
                        <p><input type="password" name="pass" placeholder="Contraseña"/></p>
                        <p><input type="text" name="cedula" placeholder="Cedula"/></p>
                        <p><input type="text" name="nombres" placeholder="Nombres"/></p>
                        <p><input type="text" name="correo" placeholder="Correo"/></p>
                        <p><input type="text" name="telefono" placeholder="Telefono"/></p>
                        <p><input type="text" name="direccion" placeholder="Direccion"/></p>
                        <p><input type="text" name="ciudad" placeholder="Ciudad"/></p>
                        <p><input type="text" name="mediocontatco" placeholder="Medio de Contacto"/></p>
                        <p><input type="submit" class="btn btn-success" value="Registrar" />

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
