

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elaborar Ficha de Devolución</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/MyStyle.css">
        
    </head>
    <body>
        <div id="divnewsol" >
            <form action="FichDevReg" method="POST">
                <table class="table table-bordered" border="0">
                    <thead>
                        <tr id="trtit">
                            <th id="titsol" colspan="7">ELABORAR FICHA DE DEVOLUCION</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td colspan="7"><input type="submit" class="btn btn-primary" value="Nuevo" name="accion" /></td>
                        </tr>
                        <tr alig ="center">
                            <td>Numero:</td>
                            <td><img src="img/ficha.png" width="20" height="20"><input type="text" name="numSol" value="" size="5" /></td>
                            <td>Fecha:</td>
                            <td><img src="img/1855.png" width="28" height="28"><input type="text" name="fecSol" value="" size="7" /></td>
                            <td>Bibliotecario:</td>
                            <td><img src="img/admin.jpg" width="20" height="20"><input type="text" name="BibSol" value="" size="50" /></td>
                         </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
