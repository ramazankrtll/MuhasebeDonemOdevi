<%@page import="model.Companies"%>
<%@page import="model.products"%>
<%@page import="java.util.List"%>
<%@page import="DBOP.DBoperations"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>
        Admin panel
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

    <body class="">
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
                                <div class="col-lg-8">
                                    <div class="card card-chart">
                                        <div class="card-header">
                                            <h4 class="card-title">Ürün Listesi</h4>       
                                            <div style="height: 200px; overflow-x: hidden; overflow-y: scroll;">
                                                <table class="table">
                                                    <thead class=" text-primary">
                                                    <th>#</th><th>Ürün isim</th><th>Maliyet</th><th>Adet </th><th>Satis Fiyati </th>
                                                    </thead>
                                                    <tbody>

                                                        <%
                                                            DBoperations db = new DBoperations();
                                                            List<products> list = db.getProducts((String) session.getAttribute("company_id"));
                                                            for (int i = 0; i < list.size(); i++) {

                                                        %>
                                                        <tr>
                                                            <td><%=i + 1%></td>
                                                            <td class="product_n"><%=list.get(i).getProduct_name()%></td>
                                                            <td class="costt"><%=list.get(i).getCost()%></td>
                                                            <td class="piecee"><%=list.get(i).getPiece()%></td>
                                                            <td class="sell_costt"><%=list.get(i).getSell_cost()%></td>
                                                            <td> <button type="submit" class="btn btn-primary use-modal now-ui-icons ui-1_simple-remove" value="delete" name="action" data-toggle="modal" data-target="#silmodal" data-whatever="@mdo"></button> <button type="button" id="editbutton" class="btn btn-primary use-address now-ui-icons loader_refresh"></button> 
                                                                <button type="button" id="sepetbutton" class="btn btn-primary now-ui-icons files_box secsepet"></button></td>
                                                            <td class="product-id" style="display:none"><%=list.get(i).getProduct_id()%></td>
                                                        </tr>
                                                        <% }%>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                        <div class="card-footer">
                                            <br>
                                            <br>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <div class="card card-chart">
                                        <div class="card-header">
                                            <h4 class="card-title">Ürün Edit</h4><br>
                                            <form action="product_add" method="post">
                                                <div class="form-row">
                                                    <div class="form-group col-md-6">
                                                        <label for="inputEmail4">Ürün isim</label>
                                                        <input type="text" class="form-control" id="input_productname" name="product_name">
                                                    </div>
                                                    <div class="form-group col-md-5">
                                                        <label for="inputAddress">ücret</label>
                                                        <input type="number" class="form-control" id="inputcost" name="cost">
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group col-md-4">
                                                        <label for="inputAddress2">Adet</label>
                                                        <input type="number" class="form-control" id="inputpiece" name="piece">
                                                    </div>
                                                    <div class="form-group col-md-6">
                                                        <label for="inputCity">Satis Fiyati</label>
                                                        <input type="number" class="form-control" id="inputsell" name="sell_cost">
                                                    </div>
                                                </div>
                                                <div class="form-row"> 
                                                    <input type="hidden" class="form-control" id="pr_id" name="product_id"/>
                                                    <button type="submit" class="btn btn-primary" name="action"  value="add" style="height: 35px; width: 80px; margin-top: 25px;margin-left: 10px;padding-top:10px;">Ekle</button>
                                                    <button type="submit" class="btn btn-primary"  name="action" value="update" style="height: 35px; width: 100px; margin-top: 25px;margin-left: 5px;padding-top:10px;" >Düzenle</button>
                                                </div>
                                            </form>
                                        </div>
                                        <div class="card-footer">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                    <form action="CreateBill" method="get">
                                        <div class="card card-chart">
                                            <div class="card-header">
                                                <h4 class="card-title">Satis Yap</h4>
                                            </div>
                                            <div class="card-body">

                                                <table class="table">
                                                    <thead class=" text-primary">
                                                    <th>#</th><th>Ürün isim</th><th>Maliyet</th><th>Satis Fiyati </th>
                                                    </thead>
                                                    <tbody id="basket">
                                                    <select id="inputrole" class="form-control" name="company_id">
                                                        <option value="1">Alici bilgisi sec</option>
                                                        <%
                                                            List<Companies> list2 = db.getCompanies((String) session.getAttribute("company_id"));
                                                            for (int i = 0; i < list2.size(); i++) {

                                                        %>
                                                        <option value="<%=list2.get(i).getCompany_Id()%>"> <%=list2.get(i).getCompany_Name()%></option>
                                                        <%}%>
                                                    </select>
                                                    <br>
                                                    <div class="form-row">
                                                        Toplam Ücret: <b id="totalPrice">____</b>
                                                    </div>
                                                    </tbody>
                                                </table>
                                            </div>
                                            <div class="form-group col-md-7">
                                                <input type="hidden" class="form-control" id="totalp_id" name="totalprice"/>
                                                Ödenen Ücret <input type="number" name="paidcost"> </input><input type="submit" class="btn btn-primary" style="height: 35px;"></input>
                                            </div>
                                        </div>
                                    </form>
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
                                Ürünü silmek istediginizden emin misiniz ?
                            </div>
                            <div class="modal-footer">
                                <form action="product_delete" methot="get">
                                    <input type="hidden" class="form-control" id="productID" name="product_id"/>
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
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>



                <script>

                    $(".use-address").click(function () {
                        var $row = $(this).closest("tr");    // Find the row
                        var $product_name = $row.find(".product_n").text(); // Find the text
                        var $piece = $row.find(".piecee").text();
                        var $cost = $row.find(".costt").text();
                        var $sell_cost = $row.find(".sell_costt").text();
                        // Let's test it out
                        var $product_id = $row.find(".product-id").text(); // Find the text
                        $("#pr_id").val($product_id);
                        $("#input_productname").val($product_name);
                        $("#inputpiece").val($piece);
                        $("#inputcost").val($cost);
                        $("#inputsell").val($sell_cost);


                    });

                    $(".use-modal").click(function () {
                        var $row = $(this).closest("tr");    // Find the row
                        var $product_id = $row.find(".product-id").text(); // Find the text
                        $("#productID").val($product_id);
                    });
                    var i = 0;
                    var totalPrice = 0;
                    $(".secsepet").click(function () {
                        var $row = $(this).closest("tr");    // Find the row
                        var $product_name = $row.find(".product_n").text(); // Find the text
                        var $cost = $row.find(".costt").text();
                        var $sell_cost = $row.find(".sell_costt").text();
                        var $product_id = $row.find(".product-id").text();


                        // Let's test it out
                        //alert($product_id);
                        i++;
                        totalPrice += parseInt($sell_cost);
                        $("#totalPrice").empty();
                        $("#totalPrice").append(totalPrice);
                        $("#totalp_id").val(totalPrice);
                        $("#basket").append('<tr><td scope="col">' + i + '</td><td scope="col">' + $product_name + '</td><td scope="col" class="cost">' + $cost + '</td><td scope="col" class="cost">' + $sell_cost + '</td><td scope="col"><button type="button" class="btn btn-danger now-ui-icons ui-1_simple-remove"" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo" onclick="deleteRow(this)"></button></td><input type="hidden" class="form-control" id="productID" name="productid" value="' + $product_id + '"/></tr>');
                    });
                    function deleteRow(r) {
                        var s = $(r).closest("tr");
                        var c = s.find(".cost").text();
                        totalPrice -= parseInt(c);
                        s.remove();
                    }


                </script>
                </body>
                </html>