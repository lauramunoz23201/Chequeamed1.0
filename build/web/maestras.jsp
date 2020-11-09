<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Administrador</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
  <meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
  <meta name="author" content="FreeHTML5.co" />

    <!-- Facebook and Twitter integration -->
  <meta property="og:title" content=""/>
  <meta property="og:image" content=""/>
  <meta property="og:url" content=""/>
  <meta property="og:site_name" content=""/>
  <meta property="og:description" content=""/>
  <meta name="twitter:title" content="" />
  <meta name="twitter:image" content="" />
  <meta name="twitter:url" content="" />
  <meta name="twitter:card" content="" />

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
            <div id="gtco-logo"><a href="index.jsp"><img src="images/LogoChe.jpg" alt="Logo" width="50"></a></div>
          </div>
          <div class="col-xs-10 text-right menu-1">
              <form action="ControladorPersona">
            <ul>
              <li class="active"><a href="index.jsp">Inicio</a></li>
              <li><a href="index.jsp">Cerrar Sesion</a></li>
            </ul>
           </form>
          </div>
        </div>
        
      </div>
    </nav>

    <header id="gtco-header" class="gtco-cover" role="banner">
      <div class="gtco-container">
        <div class="row">
          <div class="col-md-12 col-md-offset-0 text-left">
            <div class="display-t">
              <div class="display-tc">
                <div class="row">
                  <div class="col-md-7 copy animate-box">
                    <h1 style="position: relative; bottom: -20px; left: 40px;"><strong>Hola Administrador!</strong></h1>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </header>
    <!-- END #gtco-header -->


    <div class="gtco-section gtco-products">
        <div class="row row-pb-sm">
        <div class="row row-pb-md">   
            
            <div class="col-md-12 text-center">
          <p><a href="Listar_paciente.jsp" target="_blank" class="btn btn-special" style=" background-image: url(images/img_3.jpg)">Ver lista de pacientes</a></p>
          </div>
            <div class="col-md-12 text-center">
          <p><a href="Agregar_paciente.jsp" target="_blank" class="btn btn-special" style=" background-image: url(images/img_3.jpg)">Crear nuevo paciente</a></p>
          </div>
            <div class="col-md-12 text-center">
          <p><a href="Listar_usuario.jsp" target="_blank" class="btn btn-special" style=" background-image: url(images/img_3.jpg)">Ver lista de usuarios</a></p>
          </div>
            <div class="col-md-12 text-center">
          <p><a href="reporte.jsp" target="_blank" class="btn btn-special" style=" background-image: url(images/img_3.jpg)">Ver reporte</a></p>
          </div>
        </div>
      </div>
    </div>
    <!-- END .gtco-products -->


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
