

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <script type="text/javascript" src="js/formatofecha.js"></script>

        <title>JSP Page</title>
    </head>
    <script>
            $(document).ready(function() {

                 $("#date").val( moment().format() );
                 
            });
            </script> 
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
        <form action="ServCosultFicha" method="POST">
            <table class="table table-condensed" border="0" >
                <h2>CONSULTAR FICHA POR PRESTAMO</h2><br>
                <tbody>
                    <tr>
                        <td>Ingrese Numero de Prestamo:</td>
                        <td><input type="text" name="fecha"  size="20" required="" /></td>
                        <td><input type="submit" class="btn btn-success" value="Buscar" name="accion" /></td>
                    </tr>
                </tbody>
            </table>
            <img src="img/buscaUsu.png" width="250" height="250">        
        </form>
    </body>
</html>
