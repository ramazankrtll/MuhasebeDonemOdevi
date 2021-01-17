<%-- 
    Document   : login
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
        <link href="assets/css/login.css" type="text/css" rel="stylesheet"/>

        <title>Kayıt</title>
</head>
<body style="background-image: url(assets/img/loginback.jpg)"> 
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

<div class="container">
   <div class="body container"></div>
		<div class="grad "></div>
		<div class="header">
			<div>Muha<span>sebe</span></div>
		</div>
		<br>
                
		<div class="login ">
                    <form name="form" action="LoginServlet" method="post">
				<input type="text" placeholder="email" name="email"><br>
				<input type="password" placeholder="password" name="password"><br>
				<input type="submit" value="login" onclick="uyari()"></input>
                                </form>
		</div>
</div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    <script type="text/javascript">
 
   function uyari(){
       alert("Giriş yapıldı.");
   }
 
</script>

</body>



 
  
</html>