<%-- 
    Document   : bill
    Created on : 11.Oca.2021, 21:46:29
    Author     : ramaz
--%>
<%@page import="java.util.List"%>
<%@page import="DBOP.DBoperations"%>
<%@page import="model.Companies"%>
<%@page import="model.products"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <%
        String bill_id = request.getParameter("bill_id");
        String seller_companyName = request.getParameter("seller_company_name");
        String buyer_companyName = request.getParameter("buyer_company_name");
        String buyer_webAdress = request.getParameter("buyer_webAdress");
        String seller_webAdress = request.getParameter("seller_webAdress");
        String buyer_location = request.getParameter("buyer_location");
        String seller_location = request.getParameter("seller_location");
        String date = request.getParameter("date");
        String total = request.getParameter("total");
        String paid = request.getParameter("paid");

    %>

    <table border="0"  align="center" style=" margin-top: 70px; width: 800px">
        <thead>
            <tr>
                <td colspan="3" style="background-color: #c54f00; height: 40px;"></td>
            </tr>
            <tr>
                <TD style="background-image: url(img/logo.png); background-repeat:no-repeat;" colspan="2"><h1 style="color:orangered;"><BR><br>Muhasebe Anonim Şirketleri</h1></TD>
                <td><h1>FATURA</h1></td>
            </tr>
            <tr>
                <td></td>
                <td style="background-image: url(assets/img/Maliye_Bakanligi_34-logo.png); background-repeat:no-repeat; background-size: 100px; width:130px; height: 150px; background-position: center"> </td>
                <td style="width:300px;"> <P> SERİ <b>A</b> </P>
                    <P> Sıra Numarası : <b>A2321</b></p>
                    <p> Fatura Tarihi: <b><%=date%></b></p>
                    <p> Futura Numarası:<B><%=bill_id%></B> </td>
            </tr>
            <tr>
                <td><b> Alıcı Bilgileri </b></td>
                <td colspan="2"><b> Satıcı Bilgileri </b></td>

            </tr>
            <tr>
                <td><p><b>Sayın:</b> <%=buyer_companyName%></p>
                    <p><b>Müşteri web adresi:</b><%=buyer_webAdress%></p>
                    <p><b>Müşteri Adress :</b> <%=buyer_location%></p></td>
                <td colspan="2"><p><b>Sayın: </b><%=seller_companyName%></p>
                    <p><b>Müşteri web adresi:</b><%=seller_webAdress%></p>
                    <p><b>Müşteri Adress :</b> <%=seller_location%></p></td>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <table border="1"  align="center" style=" margin-top: 10px; width:  800px;">
        <tr style="background-color: #c54f00;">
            <td style="padding-top:20px; width: 50px"> #</td>
            <td style="padding-top:20px; width: 200px"> Ürün ad</td>
            <td style="padding-top:20px; width: 80px">Adet</td>
            <td style="padding-top:20px; width: 50px">Birim</td>
            <td style="padding-top:20px; width: 100px"> Maliyet </td>
            <td style="padding-top:20px; width: 300px">Satış Fiyat</td>
        </tr>
        <%
            DBoperations db = new DBoperations();
            List<products> list = db.getBillProducts(bill_id);
            for (int i = 0; i < list.size(); i++) {
        %>
        <tr>
            <td><%=i + 1%></td>
            <td><%=list.get(i).getProduct_name()%></td>
            <td><%=list.get(i).getPiece()%></td>
            <td> <b>TL</b> </td>
            <td><%=list.get(i).getCost()%></td>
            <td><%=list.get(i).getSell_cost()%></td>
        </tr>
        <% }%>
        <tr>
            <td colspan="5"> </td>
            <td> <p><b>Toplam Tutar :<%=total%></b></p>
                <p><b>Odenen Tutar :<%=paid%></b></p>
                <p><b>İmza : </b></p></td>

        </tr>

    </table>
</body>
</html>
