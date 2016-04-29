<%-- 
    Document   : Menu
    Created on : 05/01/2015, 08:38:39 PM
    Author     : Alumno
--%>

<%@page import="java.util.List"%>
<%@page import="Modelo.Bibliotecario"%>
<%@page import="Modelo.MantBiblio"%>
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
                                                        <li><a class="ar2" href="NSolicitud.jsp.jsp">Registrar Ficha de Prestamo</a></li>
                                                        <li><a class="ar2" href="ManBiblibus.jsp">Buscar Ficha de Prestamo</a></li>
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
                <% Prestamo b = (Prestamo)session.getAttribute("b");
                   if(b!=null){
                %>
            <div id="regbib">
                <h3>PRESTAMO ENCONTRADO</h3>
                <form action="ServBibBus" method="POST">   
                    <table class="table table-bordered table-hover table-striped table-condensed" aling="center" width="610px"> 
                            <tr>
                                <td><h4>NUMERO DE PRSTAMO</h4></td>
                                <td aling="left"><input  aling="left" name="numpre" value="<%= b.getNum() %>" size="20" ></td>
                            </tr>
                            <tr>
                                <td><h4>FECHA PRESTAMO</h4></td>
                                <td><input type="text" name="fecpre" value="<%= b.getFec() %>" size="40"></td>
                            </tr>
                            <tr>
                                <td><h4>FECHA DEVOLUCION</h4></td>
                                <td><input type="text" name="fecdev" value="<%= b.getFecDev() %>" size="40"></td>
                            </tr>
                            <tr>
                                <td><h4>CODIGO DEL BIBLIOTECARIO</h4></td>
                                <td><input type="text" name="usu" value="<%= b.getBibliotecario().getCod() %>" size="10" disabled=""></td>
                            </tr>
                            <tr>
                                <td><h4>CODIGO DEL LECTOR</h4></td>
                                <td><input type="text" name="usu" value="<%= b.getUsu().getCod() %>" size="10"  disabled=""></td>
                            </tr>
                           
                            
                            <tr>
                                <td colspan="2" aling="center"><input type="submit" value="Actualizar" name="accion" class="btn btn-success"/></td>
                            </tr>
                    </table>
                            
                            
                     <h3>DETALLE</h3>
                     <table class="table table-bordered table-hover table-striped table-condensed" aling="center" width="610px"> 
                        <thead >
                            <tr aling="center">
                                <th><h4 aling="center">CODIGO</h4></th>
                                <th><h4 aling="center">NOMBRE</h4></th>
                                
                            </tr>
                        </thead>
                        <% List x=(List)MantBiblio.listar(b.getNum());
                            for(int i =1;i<x.size();i++){
                                Object[] y = (Object[])x.get(i);
                            
                        %>
                        <tbody>
                            <tr>
                                <td><h4><%= y[0].toString()%></h4></td>
                                <td><h4><%= y[1].toString()%></h4></td>
                            </tr>
                        </tbody>
                        <%}%>
                            
                    </table>
                            
                    <%} %>
                </form>
            </div>        
                   
	</body>
</html>
