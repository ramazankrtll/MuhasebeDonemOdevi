<%-- 
    Document   : user_register
    Created on : 25.Kas.2020, 20:12:02
    Author     : ramaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="assets/css/textCss.css" type="text/css" rel="stylesheet"/>
    <title>Kullanıcı kayıt</title>
</head>
<body  style="background-image: url(assets/img/bg3.jpeg); background-repeat: no-repeat;">
     <%
        String company_name= request.getParameter("company_name");
        String company_location=request.getParameter("company_location");
        String web_address=request.getParameter("web_address");
        %>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a href="index.jsp"><img src="img/logo.png" style="width:45px; height:40px;"></img></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
    </button>

<div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
        <li class="nav-item">
            <a class="nav-link" href="company_register.jsp">Hakkımızda</a>
        </li>

    </ul>
</div>
    </nav>
<div class="jumbotron text-center bannerback" >
    <h4 class="display-4">Kullanıcı Kayıt</h4>
</div>
<div class="container">
    <div class="row">
        <div class="col-sm-8">
        <form action="RegisterProcess" method="post">
          <div class="form-group">
            
            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name" placeholder="Ad">
           
          </div>
          <div class="form-group">
          
            <input class="form-control" id="exampleInputPassword1" name="surname"placeholder="Soyad">
          </div>
            
            <div class="form-group">
                
                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" placeholder="Email"></input>
             </div>
             <div class="form-group">
               
                <input type="password" class="form-control" id="exampleInputPassword1"  name="password" placeholder="password">
             </div>
            <input type="hidden" name="company_name" value="<%=company_name%>"> </input>
            <input type="hidden" name="company_location" value="<%=company_location%>"> </input>
            <input type="hidden" name="web_address" value="<%=web_address%>"> </input>
          <button type="submit" class="btn btn-primary" value="Log On" onclick="uyari()">Kayıt</button>
        </form>
        </div>
    </div>
</div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
   <script type="text/javascript">

   function uyari(){
       alert("Kullanıcı kayıtı oluşturuldu.");
   }
 
</script>
        </body>
</html>
