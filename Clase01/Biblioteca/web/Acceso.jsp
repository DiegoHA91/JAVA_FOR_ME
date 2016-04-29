<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

        <title>----Acceso al Sistema---</title>
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
    </style>
    <body>
        <form action="RegistroSol" method="POST">
            <table class="table table-condensed" border="0" >
                <h2>INICIO DE SESIÓN</h2>
                <tbody>
                    <tr>
                        <td><img src="img/admin.jpg" width="20" height="20">Usuario</td>
                        <td><input type="text" name="usuario" value="" size="20" /></td>
                    </tr>
                    <tr>
                <br><td><img src="img/clave.png" width="20" height="20">Password</td>
                <td><input type="password" name="clave" value="" size="20" /></td>
                </tr>
                <tr aling="center">
                    <td colspan="2"><br>
                    <input  type="submit" class="btn btn-primary" value="Iniciar Sesion" name="accion"/></td>
                </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
