<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Departamento nuevo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
                        <a href="home.jsp">Home</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Crear<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item">
                                <form action="CrearEmpleado" method="post">
                                    <input type="submit" class="btn btn-success" value="Crear Empleado" />
                                </form>
                            </li>
                            <li role="separator" class="divider"></li>
                            <li class="nav-item">
                                <form action="CrearCargo" method="post">
                                    <input type="submit" class="btn btn-success" value="Crear Cargo" />
                                </form>
                            </li>
                            <li role="separator" class="divider"></li>
                            <li class="nav-item">
                                <form action="CrearDepartamento" method="post">
                                    <input type="submit" class="btn btn-success" value="Crear Departamento" />
                                </form>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> Acciones <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item">
                                <form action="Catalogoe" method="post">
                                    <br><input type="submit" class="btn btn-success" value="Catalogo" />
                                </form>
                            </li>
                            <li role="separator" class="divider"></li>
                            <li class="nav-item">
                                <a href="CrearProveedor.jsp">Registro Proveedor</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h1 style="color: whitesmoke;">
                        Registro Departamento:
                    </h1>
                    <form id="formUsuario">
                        <h3>
                            <b>
                                <br>Porfavor Ingrese los Datos</b>
                        </h3>
                        <form action = "Registrodep" method="post" class="form">
                            <input type="text" class="campos" name="nombre" placeholder="Nombre del departamento"/>
                            <input type="text" class="campos" name="descripcion" placeholder="Descripcion"/>
                            <br></br><input type="submit" class="btn btn-success" value="Crear Producto" />
                        </form>
                    </form>
                    <div id="botones-Menu">
                        <a href="home.jsp">
                            <br><input type="submit" class="btn-Menu" value="Home">
                        </a>
                    </div>
                </div>
            </div>
    </body>

</html>