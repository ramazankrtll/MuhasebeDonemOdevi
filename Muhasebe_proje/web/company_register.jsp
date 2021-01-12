<%-- 
    Document   : register
    Created on : 25.Kas.2020, 19:45:38
    Author     : ramaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="assets/css/textCss.css" type="text/css" rel="stylesheet"/>
        <title>Şirket kayıt</title>
    </head>
    <body class="indexbody" style="background-image: url(assets/img/bg2.jfif); background-repeat: no-repeat;">    
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
        <h4 class="display-4">Şirket Kayıt</h4>
        <p class="lead">Merhaba, birkaç bilgiye ihtiyacımız var.</p>
    </div>
    <div class="container">

        <div class="row">
            <div class="col-sm-8">
                <form action="user_register.jsp">
                    <div class="form-group">
                        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="company_name" placeholder="Şirket Adı:">

                    </div>
                    <div class="form-group">
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name='company_location' placeholder="Şirket adresi:"></textarea>
                    </div>
                    <div class="form-group">
                        <input class="form-control" id="exampleInputPassword1" name='web_address' placeholder="Web Sitesi">
                    </div>
                    <button type="submit" class="btn btn-primary" value="Log On">Kayıt</button>
                </form>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
</body>
</html>
