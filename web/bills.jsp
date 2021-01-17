<%-- 
    Document   : bills
    Created on : 11.Oca.2021, 22:05:07
    Author     : ramaz
--%>
<%@page import="model.Bill"%>
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
        Fatura
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
                                <div class="col-lg-12">
                                    <div class="card card-chart">
                                        <div class="card-header">
                                            <h4 class="card-title">Faturalar</h4>       
                                            <div style="height: 200px; overflow-x: hidden; overflow-y: scroll;">
                                                <table class="table">
                                                    <thead class=" text-primary">
                                                    <th>#</th><th>Fatura No</th><th>Satıcı</th><th>Alıcı </th><th>Maliyet </th><th>Satış Fiyatı </th><th>Rapor Olustur </th>
                                                    </thead>
                                                    <tbody>

                                                        <%
                                                            DBoperations dc = new DBoperations();
                                                            List<Bill> list2 = dc.getBill((String) session.getAttribute("company_id"));
                                                            for (int i = 0; i < list2.size(); i++) {
                                                                Companies seller_company = dc.getCompanie(list2.get(i).getSeller_id());
                                                                Companies buyer_company = dc.getCompanie(list2.get(i).getBuyer_id());
                                                        %>
                                                    <form action="bill.jsp" method="get">
                                                        <tr>
                                                            <td><%=i + 1%></td>
                                                            <td class="bill_idd"><%=list2.get(i).getBill_id()%></td>
                                                            <td class="seller_idd"><%=seller_company.getCompany_Name()%></td>
                                                            <td class="buyer_idd"><%=buyer_company.getCompany_Name()%></td>
                                                            <td class="bill_costt"><%=list2.get(i).getBill_cost()%></td>
                                                            <td class="paid_costt"><%=list2.get(i).getPaid_cost()%></td>
                                                            <td><button type="submit" id="sepetbutton" class="btn btn-primary now-ui-icons files_paper use-address"></button></td>
                                                            <td class="product-id" style="display:none"><%=list2.get(i).getBill_id()%></td>
                                                             <input type="hidden" class="form-control"  name="bill_id" value="<%=list2.get(i).getBill_id() %>"/>
                                                             <input type="hidden" class="form-control"  name="seller_company_name" value="<%=seller_company.getCompany_Name() %>"/>     
                                                             <input type="hidden" class="form-control"  name="buyer_company_name" value="<%=buyer_company.getCompany_Name() %>"/>
                                                             <input type="hidden" class="form-control"  name="buyer_webAdress" value="<%=buyer_company.getWeb_Address() %>"/>
                                                             <input type="hidden" class="form-control"  name="seller_webAdress" value="<%=seller_company.getWeb_Address() %>"/>
                                                             <input type="hidden" class="form-control" name="buyer_location" value="<%=buyer_company.getCompany_Location() %>"/>
                                                             <input type="hidden" class="form-control"  name="seller_location" value="<%=seller_company.getCompany_Location() %>"/>
                                                             <input type="hidden" class="form-control"  name="date" value="<%=list2.get(i).getDate() %>"/>
                                                             <input type="hidden" class="form-control"  name="total" value="<%=list2.get(i).getBill_cost() %>"/>
                                                             <input type="hidden" class="form-control"  name="paid" value="<%=list2.get(i).getPaid_cost() %>"/>
                                                        </tr>
                                                    </form>
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
                        var $product_name = $row.find(".bill_idd").text(); // Find the text
                        var $piece = $row.find(".seller_idd").text();
                        var $cost = $row.find(".buyer_idd").text();
                        var $sell_cost = $row.find(".sell_costt").text();
                        var $sell_cost = $row.find(".paid_costt").text();
                        // Let's test it out
                        var $product_id = $row.find(".product-id").text(); // Find the text
                        $("#pr_id").val($product_id);
                        $("#input_productname").val($product_name);
                        $("#inputpiece").val($piece);
                        $("#inputcost").val($cost);
                        $("#inputsell").val($sell_cost);

                    });

                </script>
                </body>
                </html>