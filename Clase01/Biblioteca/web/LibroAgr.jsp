

<%@page import="Modelo.Libro"%>
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
            
            margin-top:100px;
            width: 700px;
        }
        
        input{
            border: none;
        }
        
        #selectlibt{
            margin-top:10px; 
        }
    </style>
    <body>
        <form action="RegistroSol" method="POST">
            <% Libro lib=(Libro)session.getAttribute("lib");%>
            <table id="selectlibt" class="table table-condensed" border="0" >
                <h2>LIBRO SELECCIONADO</h2>
                <input type="submit" value="Agregar Libro" name="accion" class="btn btn-info" />
                <tbody >
                    <tr>
                        <td><label>Codigo:</label></td>
                        <td><input type="text" name="codLib" value="<%= lib.getCod() %>" size="5" /></td>
                        <td><label>Título:</label></td>
                        <td><input type="text" name="titLib" value="<%= lib.getTit()%>" size="30" /><img src="img/29302.png" width="20" height="20"></td>
                        <td><label>Autor:</label></td>
                        <td><input type="text" name="autLib" value="<%= lib.getAut()%>" size="30" /></td>
                    </tr>
                </tbody>
            </table>
                    <img src="img/Yes_check.svg" width="250" height="250">        
        </form>
    </body>
</html>
