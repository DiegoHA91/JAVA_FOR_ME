

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
            margin-top:100px;
            width: 700px;
        }
        
    </style>
    <body>
        <form action="ServBibBus" method="POST">
            <table class="table table-condensed" border="0" >
                <h2>CONSULTAR FICHA DE PRESTAMO</h2><br>
                <tbody>
                    <tr>
                        <td>Ingrese el numero de prestamo:</td>
                        <td><input type="text" name="codBib" value="" size="20" required="" /></td>
                        <td><input type="submit" class="btn btn-success" value="Buscar Prestamo" name="accion" /></td>
                    </tr>
                </tbody>
            </table>
            <img src="img/buscaUsu.png" width="250" height="250">        
        </form>
    </body>
</html>
