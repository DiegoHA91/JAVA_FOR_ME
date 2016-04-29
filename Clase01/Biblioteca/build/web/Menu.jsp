<%-- 
    Document   : Menu
    Created on : 05/01/2015, 08:38:39 PM
    Author     : Alumno
--%>

<%@page import="Modelo.Prestamo"%>
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
						<li><a href="">Mantenimiento Ficha de Prestamo</a>
                                                    <ul>
                                                        <li><a class="ar2" href="NSolicitud.jsp">Registrar Ficha de Prestamo</a></li>
                                                        <li><a class="ar2" href="ManBiblibus.jsp">--------Buscar Prestamo</a></li>
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
                                        <ul>
						<li><a href="ManBusFich.jsp">Cosultar Ficha por Fecha</a></li>
					</ul>
				</li>
				<li><a href="">Reportes</a></li>
                                <!--<li id="cerrar"><a href="Acceso.jsp"><input id="btncerrar" type="submit" class="btn btn-link" value="Cerrar Sessión" name="accion"></a></li>-->
			</ul>
                    </form>

		</div>
                   
	</body>
</html>
