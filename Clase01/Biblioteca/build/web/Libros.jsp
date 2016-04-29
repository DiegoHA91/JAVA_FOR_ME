

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
            width: 400px;
        }
        
    </style>
    <body>
        <form action="RegistroSol" method="POST">
            <table class="table table-condensed" border="0" >
                <h2>CONSULTAR LIBRO</h2><br>
                <tbody>
                    <tr>
                        <td>Ingrese el Codigo:</td>
                        <td><input type="text" name="codLib" value="" size="20" required="" /></td>
                        <td><input type="submit" class="btn btn-success" value="Buscar Libro" name="accion" /></td>
                    </tr>
                </tbody>
            </table>
            <img src="img/libros.png">

        </form>
    </body>
</html>
