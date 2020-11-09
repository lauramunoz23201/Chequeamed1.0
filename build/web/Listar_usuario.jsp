<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Lista de registros</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
        <meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
        <meta name="author" content="FreeHTML5.co" />



        <link href="https://fonts.googleapis.com/css?family=Raleway:100,300,400,700" rel="stylesheet">

        <!-- Animate.css -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Icomoon Icon Fonts-->
        <link rel="stylesheet" href="css/icomoon.css">
        <!-- Themify Icons-->
        <link rel="stylesheet" href="css/themify-icons.css">
        <!-- Bootstrap  -->
        <link rel="stylesheet" href="css/bootstrap.css">

        <!-- Magnific Popup -->
        <link rel="stylesheet" href="css/magnific-popup.css">

        <!-- Owl Carousel  -->
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">

        <!-- Theme style  -->
        <link rel="stylesheet" href="css/style.css">

        <!-- Modernizr JS -->
        <script src="js/modernizr-2.6.2.min.js"></script>
        <!-- FOR IE9 below -->
        <!--[if lt IE 9]>
        <script src="js/respond.min.js"></script>
        <![endif]-->
        <style>
            table {
                width: 55%;
                border: 1px solid #999;
                text-align: center;
                border-collapse: collapse;
                margin: 0 0 1em 0;
                caption-side: top;
                text-align: center;
            }

            th, td {
                border-bottom: 1px solid #999;
                text-align: center; 
            }

            #barra{
                position: fixed;
                padding-bottom: 10px;
            }
        </style>



    </head>
    <body>

        <div class="gtco-loader"></div>

        <div id="page">
            <nav class="gtco-nav" role="navigation" id="barra">
                <div class="gtco-container">	
                    <div class="row">
                        <div class="col-sm-2 col-xs-12">
                            <div id="gtco-logo"><a href="index.jsp"><img src="images/LogoChe.jpg" alt="Logo" width="50px"></a></div>
                        </div>
                        <div class="col-xs-10 text-right menu-1">
                            <ul>
                                <li><a href="index.jsp">Inicio</a></li>
                                <li><a href="maestras.jsp">Volver</a></li>
                            </ul>
                        </div>
                    </div>	
                </div>
            </nav>
            <header id="gtco-header" class="gtco-cover gtco-cover-xs gtco-inner" role="banner" style="height: 300px">
                <div class="gtco-container">
                    <div class="row">
                        <div class="col-md-12 col-md-offset-0 text-left">
                            <div class="display-t">
                                <div class="display-tc">
                                    <div class="row">
                                        <div class="col-md-8 animate-box">
                                            <h1 class="no-margin" style="position: relative; bottom: 80px; left: 40px;"><strong>Registrados en ChequeaMed</strong></h1>
                                            <h3 style="color: white; position: relative; bottom: 70px; left: 40px;">Recuerda que puedes: editar y eliminar usuarios.</h3>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
        </div>



    <center>
        <div>
            <h1 class="no-margin"><strong>Usuarios Registrados</strong></h1>
            <form action="ControladorPersona" method="POST">
                <input type="search" id="miBusqueda" name="q">
                <a href="" onClick= return><input type="button" value="Buscar"></a><br><br>
                <input type="submit" name="accion" value="Listar">
                <input type="submit" name="accion" value="Nuevo">
            </form>
        </div>
        <br>
        <div>   
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>PRIMER APELLIDO</th>
                        <th>SEGUNDO APELLIDO</th>
                        <th>CORREO</th>
                        <th>CARGO</th>
                        <th>CONTRASEÑA</th>
                        <th>DIRECCION</th>
                        <th>ACCIONES</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="datos" items="${datos}"> 	
                        <tr>    
                            <td style="text-align: center;">${datos.getId()}</td>   
                            <td style="text-align: center;">${datos.getNom()}</td>  
                            <td style="text-align: center;">${datos.getPri_ape()}</td> 
                            <td style="text-align: center;">${datos.getSeg_ape()}</td>   
                            <td style="text-align: center;">${datos.getCorreo()}</td>  
                            <td style="text-align: center;">${datos.getCargo()}</td>  
                            <td style="text-align: center;">${datos.getContra()}</td>   
                            <td style="text-align: center;">${datos.getDir()}</td>   
                            <td style="text-align: center;">
                                <form action="ControladorPersona" method="POST">
                                    <input type="hidden" name="id" value="${dato.getId()}">
                                    <input type="submit" name="accion" value="Editar">
                                    <input type="submit" name="accion" value="Eliminar">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>   
                    </body>
                    </center>      
                    <!-- jQuery -->
                <script src="js/jquery.min.js"></script>
                <!-- jQuery Easing -->
                <script src="js/jquery.easing.1.3.js"></script>
                <!-- Bootstrap -->
                <script src="js/bootstrap.min.js"></script>
                <!-- Waypoints -->
                <script src="js/jquery.waypoints.min.js"></script>
                <!-- Carousel -->
                <script src="js/owl.carousel.min.js"></script>
                <!-- Magnific Popup -->
                <script src="js/jquery.magnific-popup.min.js"></script>
                <script src="js/magnific-popup-options.js"></script>
                <!-- Main -->
                <script src="js/main.js"></script>

                </body>
                </html>
