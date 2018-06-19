<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Home</title>
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
                <div class="col-lg-12 text-center" style="color: whitesmoke;">
                    <h1 class="mt-5">¿Quienes somos?</h1>
                    <p class="mt-5">
                        En The Journey Group nos dedicamos día a día a crear las mejores experiencias para cada uno de nuestros clientes. Creamos esta empresa porque queremos formar parte de todas esas historias que quieres contar, de esos momentos inolvidables y de los recuerdos
                        invaluables para ti, tu familia, tu empresa y todo tu círculo social. Buscamos también, formar parte de tus planes para tu presente y futuro y ayudarte a cumplir todos tus sueños. Comparte con nosotros qué experiencia quieres vivir,
                        estamos a tu servicio.
                    </p>
                </div>
            </div>
            <div class="row">
                <div id="menuLinea" class="col-lg-12">
                    <h1 class="mt-3 text-center" style="color: aliceblue;font: bold 48px 'Roboto', sans-serif;">EXPERIENCE</h1>
                    <h3 style="color: aliceblue">--------------------------------------------------------------------------------------------------------------------------------------------</h3>
                    <nav>
                        <ul id="menu" class="list-inline">
                            <li class="list-inline-item">
                                <p class="TJG">TJG</p>
                                <p class="line">SOFT</p>
                                <p class="def">SOFTWARE </p>
                                <p class="def">Administración de Software, Aplicativos móviles & Ventas</p>
                            </li>
                            <li class="list-inline-item">
                                <p class="TJG">TJG</p>
                                <p class="line">TOP HILL</p>
                                <p class="def">INVERSIONES</p>
                                <p class="def">Búsqueda de inversiones & Administración Proyectos</p>
                            </li>
                            <li class="list-inline-item">
                                <p class="TJG">TJG</p>
                                <p class="line">FT.U</p>
                                <p class="def">EVENTOS</p>
                                <p class="def">Planeación, estructuración y manejo de eventos sociales</p>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
            <div id="redes">
                <a href="https://www.facebook.com/thejourneygroup/">
                    <img src="https://blog.transparentcareer.com/wp-content/uploads/2017/01/facebook2.png" alt="facebook" style="width:42px;height:42px;border:0">
                </a>
                <a href="https://www.instagram.com/tjgexperience/?hl=es">
                    <img src="https://images.vexels.com/media/users/3/137197/isolated/preview/fb944c570182b6e89eb21f41f8c4522b-instagram-silueta-colorida-by-vexels.png" alt="instagram" style="width:42px;height:42px;border:0;">
                </a>
            </div>
        </div>
    </body>
</html>