

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

        <title>JSP Page</title>
    </head>
    <style>
        
        
        *{
           
            text-align: center;
            margin: auto;
        }
        
        form{
            text-align: center;
            margin-top:200px;
            width: 400px;
        }
        
        a:hover{
            text-decoration: none;
        }
    </style>
    <body>
        <% String msg=(String)session.getAttribute("msg"); %>
        <form action="RegistroSol" method="POST">
            <table class="table table-condensed" border="0" >
                <h2>MENSAJE DEL SISTEMA</h2>
                <tbody>
                    <tr>
                        <td><%= msg%></td>
                       
                    </tr>
                    <tr>
                        <% if(msg!="Acceso no permitido"){ %>
                        <td><a href="Menu.jsp">Regresar al Menú Principal</a></td>
                    </tr>
                        <%} %>
                </tbody>
            </table>

        </form>
    </body>
</html>
