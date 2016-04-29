

<%@page import="Modelo.Prestamo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elaborar Solicitud de Prestamo</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/MyStyle.css">
        
    </head>
    <body>
        <div id="divnewsol">
            <form class="form-inline" action="RegistroSol" method="POST">
                <% Prestamo pres=(Prestamo)session.getAttribute("prest");%>
                
                <table class="table table-bordered" border="0">
                    <thead>
                        <tr id="trtit">
                            <th id="titsol" colspan="7">ELABORAR SOLICITUD DE PRESTAMO</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td colspan="7"><input type="submit" class="btn btn-warning" value="Cancelar Prestamo" name="accion" /></td>
                        </tr>
                        <tr alig ="center">
                            <td>Numero:</td>
                            <td><img src="img/ficha.png" width="20" height="20"><input type="text" name="numSol" value="   <%= pres.getNum() %>" size="5" /></td>
                            <td>Fecha:</td>
                            <td><img src="img/1855.png" width="28" height="28"><input type="text" name="fecSol" value="   <%= pres.getFec() %>" size="8" /></td>
                            <td>Bibliotecario:</td>
                            <td><img src="img/admin.jpg" width="20" height="20"><input type="text" name="BibSol" value="  <%= pres.getBibliotecario().getNom() %>" size="50" /></td>
                            </tr>
                        
                        <tr>
                            <td colspan="7"><a href="LectorBuscar.jsp">Buscar Lector</a></td>
                        </tr>
                    </tbody>
                </table>

            </form>
        
        </div>
        
    </body>
</html>
