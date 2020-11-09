
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <style>
             #barra{
                 position: fixed;
             }
         </style>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Iniciar Sesión</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
        <meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
        <meta name="author" content="FreeHTML5.co" />



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
            .btn-submit {
                margin: auto;
            }
            
            .relleno {
                margin-bottom: 100px;
                margin-top: 100px;
                background-color: white;
            }
            
            .form-register {
                    margin: auto;
                    width: 100%;
                    height: 350px;
                    max-width: 800px;
                    max-height: 1000px;
                    background: #3dcdbc;
                    border-radius: 10px;
            
            }
            .form-title {
            background: #33a2bd;
    padding: 20px;
    text-align: center;
    border-bottom: 5px solid white;
    font-family: sans-serif;
    color: #3dcdbc;
}

#inputs {
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

.btn-submit {
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

.btn-submit:hover {
    background: #f29718;
    border: groove darkgoldenrod;
}

.espacio {
    margin-bottom: 100px;
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
                            <div id="gtco-logo">
                                <a href="index.jsp"><img src="images/LogoChe.jpg" alt="Logo" width="50px"></a>
                            </div>
                        </div>
                        <div class="col-xs-10 text-right menu-1">
                            <ul>
                                <li><a href="index.jsp">Inicio</a></li>
                                <li><a href="Agregar.jsp">Registrarse</a></li>
                            </ul>
                        </div>
                    </div>

                </div>
            </nav>

            <header id="gtco-header" class="gtco-cover gtco-cover-xs gtco-inner" role="banner" style="height: 400px"> <!--id: Define el color-->
                <div class="gtco-container">
                    <div class="row">
                        <div>
                            <div class="display-t"> <!--Letras del baner-->
                                <div class="display-tc"> <!--Letras del baner-->
                                    <div class="row">
                                        <div class="col-md-8 animate-box">
                                            <h1 style="padding-top: 160px"><strong>Iniciar sesión</strong></h1>
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

            <form class="form-register" action="ControladorIniciosesion" method="POST">
                <h2 class="form-title"><span>Iniciar sesión</span></h2>
                <div class="contenedor-inputs">
                    <input type="text" id="inputs" class="input-48" placeholder="Identificación" name="txtid" required>
                    <input type="password" id="inputs" class="input-48" placeholder="Contraseña" name="txtcontra" required>
                    <select name="txtcargo" id="inputs" class="form-input" required>
                        <option disabled selected>Selecciona un cargo</option>
                        <option value="1">Enfermera</option> 
                        <option value="2">Familiar</option>
                        <option value="3">Administrador</option>
                    </select>
                    <input type="submit" class="btn-submit" name="accion4" value="Ingresar">  
                </div>
            </form>
            
            
            <br>
            <div class="relleno">
                
                
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

            <!-- Google Map -->
            <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
            <script src="js/google_map.js"></script>

            <!-- Main -->
            <script src="js/main.js"></script>

    </body>
</html>
