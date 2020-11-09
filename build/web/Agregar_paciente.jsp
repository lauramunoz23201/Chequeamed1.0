<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>

            #barra{
                position: fixed;
                padding-bottom: 10px;
            }
            .btn-submit {
                margin: auto;
            }

            .relleno {
                margin-bottom: 100px;
                margin-top: 100px;
                background-color: white;
            }

            #form-lora {
                margin: auto;
                width: 150%;
                height: 760px;
                max-width: 900px;
                max-height: 1000px;
                background: #3dcdbc;
                border-radius: 10px;

            }
            .form-title2 {
                background: #33a2bd;
                padding: 20px;
                text-align: center;
                border-bottom: 5px solid white;
                font-family: sans-serif;
                color: white;
            }

            #inputs2 {
                margin-bottom: 15px;
                padding: 15px;
                font-size: 16px;
                border-radius: 3px;
                border: 1px solid orange;
                border: none;
                outline: none;
                border-bottom: 2px solid white;
                color: #fff;
                font-family: sans-serif;
                background: #33a2bd;
            }

            .btn-submit2 {
                color: #fff;
                font-family: sans-serif;
                margin: auto;
                padding: 10px 40px;
                font-size: 17px;
                transition: all .3s ease;
                cursor: pointer;
                background: #154360;
                border: none;
                outline: none;
            }

            .btn-submit2:hover {
                background: #f29718;
                border: groove darkgoldenrod;
            }

            .espacio {
                margin-bottom: 100px;
            }
        </style>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Registro</title>

        <!-- Animate.css -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <link rel="stylesheet" href="css/animate.css">
        <!-- Icomoon Icon Fonts-->
        <link rel="stylesheet" href="css/icomoon.css">

        <!-- Magnific Popup -->
        <link rel="stylesheet" href="css/magnific-popup.css">

        <!-- Theme style  -->
        <link rel="stylesheet" href="css/style.css">

        <!-- Modernizr JS -->
        <script src="js/modernizr-2.6.2.min.js"></script>
    </head>

    <body>

        <div class="gtco-loader"></div>

        <div id="page">

            <nav class="gtco-nav" role="navigation" id="barra">
                <div class="gtco-container">

                    <div class="row">
                        <div class="col-sm-2 col-xs-12">
                            <div id="gtco-logo">
                                <a href="index.jsp"><img src="images/LogoChe.jpg" alt="Logo" width="50px"></a>
                            </div>
                        </div>
                        <div class="col-xs-10 text-right menu-1">
                            <ul>
                                <li><a href="index.jsp">Inicio</a></li>
                                <li><a href="login.jsp">Iniciar Sesión</a></li>
                            </ul>
                        </div>
                    </div>

                </div>
            </nav>

            <header id="gtco-header" class="gtco-cover gtco-cover-xs gtco-inner" role="banner" style="height: 400px">
                <div class="gtco-container">
                    <div class="row">
                        <div class="col-md-12 col-md-offset-0 text-left">
                            <div class="display-t">
                                <div class="display-tc">
                                    <div class="row">
                                        <div class="col-md-8 animate-box">
                                            <h1 style="padding-top: 200px"><strong>Registrarse</strong></h1>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <div class="espacio">
                <h3 class="espacio">Completa todos los campos</h3>
            </div>
            <!-- 
                            Nombre
                            Apellido
                            Correo
                            Cargo (Enfermera,Familiar)
                            Contraseña
                            Confirma contraseña
                            id
            -->

            <form id="form-lora" action="ControladorPaciente" method="POST">
                <h2 class="form-title2"><span>Registrar Paciente</span></h2>
                <div class="contenedor-inputs">
                    <input type="text" id="inputs2" class="form-input" placeholder="Identificación" required name="txtidp">
                    <input type="text" id="inputs2" class="form-input" placeholder="Nombre" required name="txtnomp">
                    <input type="text" id="inputs2" class="input-48" placeholder="Primer apellido" required name="txtpri_apep">
                    <input type="text" id="inputs2" class="input-48" placeholder="Segundo apellido" name="txtseg_apep">
                    <select name="txtsexop" id="inputs2" class="form-input" required>
                        <option disabled selected>Selecciona un sexo</option>
                        <option value="1">Femenino</option> 
                        <option value="2">Masculino</option>
                    </select>
                    <input type="text" id="inputs2" class="form-input" placeholder="Fecha nacimiento" required name="txtfechap">

                    <input type="submit" class="btn-submit2" name="accion1" value="Registrar">
                </div>
            </form>
            <br>
            <div class="espacio">
                <h3 class="espacio">...</h3>
            </div>



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
