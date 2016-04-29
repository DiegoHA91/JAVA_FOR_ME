<%-- 
    Document   : Menu
    Created on : 05/01/2015, 08:38:39 PM
    Author     : Alumno
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
            
            <link rel="stylesheet" type="text/css" href="css/EstiloMenu.css">

		<title>Menu Principal</title>
		<style type="text/css">
                    #btncerrar{
                       
                       margin-top: -15px;
                       background-color: #000;
                       height: 25px;
                    }
                   
                    #btncerrar:hover,#cerrar:hover{
                       text-decoration: none;
                       background-color: none;
                       
                    }
                    #header{
                        
                    }
                    
                    #menu{
                       
                        margin-left: 120px;
                    }
		</style>
	</head>
	<body>
		<div id="header">
                    <form action="RegistroSol" method="POST">
                         <h1>Menu Principal</h1>
                         <ul id="menu" class="nav">
				<li><a href="">Mantenimientos</a>
                                        <ul>    
                                                <li><a href="">Mantenimiento Bibliotecario</a>
                                                    <ul>
                                                        <li><a class="ar2" href="MenuRegB.jsp">Registrar Bibliotecario</a></li>
                                                        <li><a class="ar2" href="ManBiblibus.jsp">Editar Bibliotecario</a></li>
                                                        <li><a class="ar2" href="MenuListB.jsp">Listar Biliotecario</a></li>
                                                    </ul>
                                                 </li>
                                                 <li><a href="">Mantenimiento Libro</a>
                                                    <ul>
                                                         <li ><a class="ar" href="MenuRegL.jsp">Registrar Libro</a></li>
                                                         <li ><a class="ar" href="ManLibBus.jsp">Editar Libro</a></li>
                                                         <li ><a class="ar" href="MenuListL.jsp">Listar Libro</a></li>
                                                    </ul>
                                                 </li>
						
					</ul>
                                        
                                </li>
				<li><a href="">Procesos</a>
					<ul>
						<li><a href="NSolicitud.jsp">Elabora Solicitud de Pestamo</a></li>
                                                <li><a href="FichDevNP.jsp">Elabora Ficha de Devolucion</a></li>
					</ul>
				</li>
				<li><a href="">Consultas</a>
				</li>
				<li><a href="">Reportes</a></li>
                                <!--<li id="cerrar"><a href="Acceso.jsp"><input id="btncerrar" type="submit" class="btn btn-link" value="Cerrar Sessión" name="accion"></a></li>-->
			</ul>
                    </form>
		</div>
                
            <div id="regbib">
                <h3>Registro de Bibliotecario</h3>
                <form action="ServBibBus" method="POST">   
                    <table class="table table-bordered table-hover table-striped table-condensed" aling="center" width="610px"> 
                            <tr>
                                <td><h4>Codigo</h4></td>
                                <td><input type="text" name="cod" value="" size="20"></td>
                            </tr>
                            <tr>
                                <td><h4>Nombres y Apellidos</h4></td>
                                <td><input type="text" name="nom" value="" size="40"></td>
                            </tr>
                            <tr>
                                <td><h4>Nombre de Usuario</h4></td>
                                <td><input type="text" name="usu" value="" size="40" onblur="false"></td>
                            </tr>
                            <tr>
                                <td><h4>Password</h4></td>
                                <td><input type="password" name="pass" value="" size="20"></td>
                            </tr>
                            <tr>
                                <td><input type="reset" value="Nuevo" class="btn btn-primary"/></td>
                                <td><input type="submit" value="Grabar" name="accion" class="btn btn-success"/></td>
                            </tr>
                            
                        </table>
                </form>
            </div>        
                   
	</body>
</html>
