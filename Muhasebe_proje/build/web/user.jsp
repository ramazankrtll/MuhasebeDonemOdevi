<%-- 
    Document   : user
    Created on : 08.Ara.2020, 01:48:00
    Author     : ramaz
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="assets/img/favicon.png">
            <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
            <title>
                Kullanici profili
            </title>
            <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
            <!--     Fonts and icons     -->
            <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
            <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
                <!-- CSS Files -->
                <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
                <link href="assets/css/now-ui-dashboard.css?v=1.5.0" rel="stylesheet" />
                <!-- CSS Just for demo purpose, don't include it in your project -->
                <link href="assets/demo/demo.css" rel="stylesheet" />
                </head>

                <body class="user-profile">
                <div class="wrapper ">
                    <div class="sidebar" data-color="orange">
                        <!--
                          Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red | yellow"
                        -->
                        <div class="logo">
                            <a href="dashbord.jsp" class="simple-text logo-normal">
                                Muhasebe
                            </a>
                        </div>
                        <div class="sidebar-wrapper" id="sidebar-wrapper">
                            <ul class="nav">
                                <li class="active ">
                                    <a href="dashbord.jsp">
                                        <i class="now-ui-icons design_app"></i>
                                        <p>Anasayfa</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="user.jsp">
                                        <i class="now-ui-icons users_single-02"></i>
                                        <p>Admin profili</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="Tables.jsp">
                                        <i class="now-ui-icons design_bullet-list-67"></i>
                                        <p>Kullanici listesi</p>
                                    </a>
                                </li> 
                                <li>
                                    <a href="bills.jsp">
                                        <i class="now-ui-icons files_paper"></i>
                                        <p>Faturalar</p>
                                    </a>
                                </li> 
                            </ul>
                        </div>
                    </div>
                    <div class="main-panel" id="main-panel">
                        <!-- Navbar -->
                        <nav class="navbar navbar-expand-lg navbar-transparent  bg-primary  navbar-absolute">
                            <div class="container-fluid">
                                <div class="navbar-wrapper">
                                    <div class="navbar-toggle">
                                        <button type="button" class="navbar-toggler">
                                            <span class="navbar-toggler-bar bar1"></span>
                                            <span class="navbar-toggler-bar bar2"></span>
                                            <span class="navbar-toggler-bar bar3"></span>
                                        </button>
                                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                                            <span class="navbar-toggler-bar navbar-kebab"></span>
                                            <span class="navbar-toggler-bar navbar-kebab"></span>
                                            <span class="navbar-toggler-bar navbar-kebab"></span>
                                        </button>
                                    </div>
                                    </nav>
                                    <!-- End Navbar -->
                                    <div class="panel-header panel-header-sm">
                                    </div>
                                    <div class="content">
                                        <div class="row">
                                            <div class="col-md-8">
                                                <div class="card">
                                                    <div class="card-header">
                                                        <h5 class="title">Admin Bilgileri</h5>
                                                    </div>
                                                    <div class="card-body">
                                                        <div class="row">
                                                            <div class="col-md-4 pr-1">
                                                                <div class="form-group">
                                                                    <input type="text" class="form-control" value="<%=session.getAttribute("name")%>" readonly>
                                                                </div>
                                                            </div>
                                                            <div class="col-md-4 pl-1">
                                                                <div class="form-group">
                                                                    <input type="email" class="form-control" value="<%=session.getAttribute("surname")%>" readonly>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-4 pr-1">
                                                                <div class="form-group">
                                                                    <input type="text" class="form-control" value="<%=session.getAttribute("company_name")%>" readonly>
                                                                </div>
                                                            </div>
                                                            <div class="col-md-4 pl-1">
                                                                <div class="form-group">
                                                                    <input type="text" class="form-control" placeholder="Soyad" value="<%=session.getAttribute("company_location")%>" readonly>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-8">
                                                                <div class="form-group">
                                                                    <input type="text" class="form-control" placeholder="Sirket Adresi" value="<%=session.getAttribute("email")%>" readonly>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-5">
                                                                <div class="form-group">
                                                                    <input type="text" class="form-control" placeholder="Sirket Eposta" value="<%=session.getAttribute("web_address")%>" readonly>

                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-8 pl-4">
                                                                <form action="UpdateProfilePhoto" method="post" enctype='multipart/form-data'>
                                                                    <h6 class="title">Resim Degistir :</h6> <input id="input_photo" type="file" name="photo" size="50"/>
                                                                    <button type="submit" class="btn btn-primary">Guncelle</button>
                                                                </form>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-md-4">
                                                <div class="card card-user">
                                                    <div class="image">
                                                        <img src="assets/img/bg5.jpg" alt="...">
                                                    </div>

                                                    <div class="card-body">
                                                        <div class="author">

                                                            <a href="#">
                                                                <img class="avatar border-gray" id="profile_photo" src="data:image/jpg;base64,<%=session.getAttribute("photo")%>" alt="...">
                                                                    <br><br>

                                                                    <h5 class="title"><%=session.getAttribute("name")%> <%=session.getAttribute("surname")%></h5>
                                                            </a>
                                                            <p class="description">
                                                                <label><%=session.getAttribute("company_name")%> </label>
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!--   Core JS Files   -->
                            <script src="assets/js/core/jquery.min.js"></script>
                            <script src="assets/js/core/popper.min.js"></script>
                            <script src="assets/js/core/bootstrap.min.js"></script>
                            <script src="assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
                            <!-- Chart JS -->
                            <script src="assets/js/plugins/chartjs.min.js"></script>
                            <!--  Notifications Plugin    -->
                            <script src="assets/js/plugins/bootstrap-notify.js"></script>
                            <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
                            <script src="assets/js/now-ui-dashboard.min.js?v=1.5.0" type="text/javascript"></script><!-- Now Ui Dashboard DEMO methods, don't include it in your project! -->
                            <script src="assets/demo/demo.js"></script>

                            <script>

                                function readURL(input) {
                                    if (input.files && input.files[0]) {
                                        var reader = new FileReader();

                                        reader.onload = function (e) {
                                            $('#profile_photo').attr('src', e.target.result);
                                        }

                                        reader.readAsDataURL(input.files[0]);
                                    }
                                }
                                $("#input_photo").change(function () {
                                    readURL(this);
                                });


                            </script>

                            </body>

                            </html>