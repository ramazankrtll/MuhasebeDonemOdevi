<%-- 
    Document   : Tables
    Created on : 08.Ara.2020, 02:08:10
    Author     : ramaz
--%>

<%@page import="model.employee"%>
<%@page import="java.util.List"%>
<%@page import="DBOP.DBoperations"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="assets/img/favicon.png">
            <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
            <title>
                Kullanici Listesi
            </title>
            <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
            <!--     Fonts and icons     -->
            <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
            <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous"/>
            <!-- CSS Files -->
            <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
            <link href="assets/css/now-ui-dashboard.css?v=1.5.0" rel="stylesheet" />
            <!-- CSS Just for demo purpose, don't include it in your project -->
            <link href="assets/demo/demo.css" rel="stylesheet" />
            </head>
            <body class="">
                <%
                    if (session.getAttribute("role_id").equals("2") || session.getAttribute("role_id").equals("3")) {
                        response.sendRedirect("dashbord.jsp");
                    }
                %>
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
                           
                               <li class="active">
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
                            <%if(session.getAttribute("role_id").equals("1") || session.getAttribute("role_id").equals("4")){ %>
                            <li>
                                <a href="Tables.jsp">
                                    <i class="now-ui-icons design_bullet-list-67"></i>
                                    <p>Kullanici listesi</p>
                                </a>
                            </li>
                            <% }%>
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
                                        <div class="col-md-12">
                                            <div class="card">
                                                <div class="card-header">
                                                    <h4 class="card-title"> Çalısan Listesi</h4>
                                                </div>
                                                <div class="card-body">
                                                    <div class="table-responsive">
                                                        <div style="height: 250px; overflow-x: hidden; overflow-y: scroll;">
                                                            <table class="table">
                                                                <thead class=" text-primary">
                                                                <th>id</th>
                                                                <th>Ad</th>
                                                                <th>Soyad</th>
                                                                <th>Mail</th>
                                                                <th>Rol </th>
                                                                <th>islem </th>
                                                                </thead>
                                                                <tbody>
                                                                    <%
                                                                        DBoperations db = new DBoperations();
                                                                        List<employee> list = db.getEmployees((String) session.getAttribute("company_id"), (String) session.getAttribute("user_id"));
                                                                        for (int i = 0; i < list.size(); i++) {
                                                                    %>
                                                                    <tr>
                                                                        <td><%=i + 1%></td>
                                                                        <td class="name"><%=list.get(i).getName()%></td>
                                                                        <td class="surname"><%=list.get(i).getSurname()%></td>
                                                                        <td class="email"><%=list.get(i).getEmail()%></td>
                                                                        <td class="role"><%=list.get(i).getRole_id()%></td>
                                                                        <td class="user-id" style="display:none"><%=list.get(i).getUser_id()%></td>
                                                                        <td><button class="btn btn-primary use-modal" value="delete" name="action" data-toggle="modal" data-target="#silmodal" data-whatever="@mdo">Sil</button> <button class="btn btn-primary use-address">Seç</button></td>
                                                                    </tr>
                                                                    <% }%>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="card">
                                                <div class="card-header">
                                                    <h5 class="title">Çalısan Edit</h5>
                                                </div>
                                                <form action="user_add" method="post">
                                                    <div class="card-body">
                                                        <div class="row">
                                                            <div class="col-md-2 pr-1">
                                                                <div class="form-group">
                                                                    <input type="text" class="form-control"  id="ad" placeholder="Ad" name="name">
                                                                </div>
                                                            </div>
                                                            <div class="col-md-2 pl-1">
                                                                <div class="form-group">
                                                                    <input type="text" class="form-control"  id="soyad" placeholder="Soyad" name="surname">
                                                                </div>
                                                            </div>
                                                            <div class="col-md-2 pr-1">
                                                                <div class="form-group">
                                                                    <input type="password" class="form-control"  placeholder="Sifre" name="password">
                                                                </div>
                                                            </div>
                                                            <div class="col-md-2 pr-1">
                                                                <div class="form-group">
                                                                    <input type="email" class="form-control" id="mail" placeholder="Mail" name="Email">
                                                                </div>
                                                            </div>
                                                            <div class="col-md-2 pl-1">
                                                                <div class="form-group">
                                                                    <select id="inputrole" class="form-control" name="role_id">
                                                                        <option value="1">İşletme Sahibi</option>
                                                                        <option value="2">Ürün Müdürü</option>
                                                                        <option value="3">Ürün Danışmanı</option>
                                                                        <option value="4">İnsan Kaynakları</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                            <div class="col-md-2 pl-2">
                                                                <div>
                                                                    <input type="hidden" class="form-control" id="us_id" name="user_id"/>
                                                                    <button type="submit" class="btn btn-primary" name="action" value="add"  style="height: 35px; width: 70px;margin-top: 2px">Ekle</button>
                                                                    <button type="submit" class="btn btn-primary" name="action" value="update"  style="height: 35px; width: 96px;margin-top: 2px">Duzenle</button>
                                                                    </form>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal"  id="silmodal" tabindex="-1" role="dialog">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                        Kullanıcıyı silmek istediginizden emin misiniz ?
                                    </div>
                                    <div class="modal-footer">
                                        <form action="user_delete" methot="get">
                                            <input type="hidden" class="form-control" id="userID" name="user_id"/>
                                            <button type="submit" class="btn btn-primary">Sil</button>
                                        </form>
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
                        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

                        <script>
                            $(".use-address").click(function () {
                                var $row = $(this).closest("tr");    // Find the row
                                var $name1 = $row.find(".name").text(); // Find the text
                                var $surname1 = $row.find(".surname").text();
                                var $email1 = $row.find(".email").text();
                                var $role1 = $row.find(".role").text();
                                var $user1 = $row.find(".user-id").text();
                                // Let's test it out
                                //alert($role1);

                                $("#ad").val($name1);
                                $("#soyad").val($surname1);
                                $("#mail").val($email1);
                                $("#role").val($role1);
                                $("#us_id").val($user1);

                                if ($role1 == "İşletme Sahibi") {
                                    $("#inputrole").val("1");
                                } else if ($role1 == "Ürün Müdürü") {
                                    $("#inputrole").val("2");
                                } else if ($role1 == "Ürün Danışmanı") {
                                    $("#inputrole").val("3");
                                } else if ($role1 == "İnsan Kaynakları") {
                                    $("#inputrole").val("4");
                                }

                            });
                            $(".use-modal").click(function () {
                                var $row = $(this).closest("tr");    // Find the row
                                var $user_id = $row.find(".user-id").text(); // Find the text
                                $("#userID").val($user_id);
                            });
                        </script>

                        </body>

                        </html>