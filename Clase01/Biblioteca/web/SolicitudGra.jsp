

<%@page import="Modelo.LineaPres"%>
<%@page import="java.util.TreeMap"%>
<%@page import="java.util.Iterator"%>
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
                <table   class="table table-bordered" border="0">
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
                        
                </table>
                <table class="table table-bordered">
                        <tr>
                            <td colspan="7"><a href="UsuarioBuscar.jsp">Buscar Usuario</a></td>
                        </tr>
                        
                    
                        <tr>
                            <td>Codigo:</td>
                            <td><input type="text" name="codUsu" value="<%= pres.getUsu().getCod() %>" size="5" /></td>
                            <td>Alumno:</td>
                            <td><input type="text" name="nomUsu" value="<%= pres.getUsu().getNom() %>" size="30" /></td>
                            <td>Carrera:</td>
                            <td><input type="text" name="carrUsu" value="<%= pres.getUsu().getCarrera() %>" size="30" /></td>
                        </tr>
                        
                        <table class="table table-bordered" border="0">
                            
                            <thead>
                                <tr>
                            <td colspan="6"><a href="Libros.jsp">Seleccionar Libro</a></td>
                            </tr>
                                <tr>
                                    <th>CODIGO</th>
                                    <th>TITULO</th>
                                    <th>AUTOR</th>
                                    <th>OPCION</th>
                                </tr>
                            </thead>
                            <tbody>
                                <% Iterator i = new TreeMap(pres.getLineas()).keySet().iterator();%>
                                <% while(i.hasNext()) {%>
                                <% String cod=(String)i.next();%>
                                <% LineaPres lin=(LineaPres)pres.getLineas().get(cod);%>
                                <tr>
                            <form action="RegistroSol" method="post">
                                <td><input type="text" name="codLib" value="<%= lin.getLibro().getCod() %>" size="5" /></td>
                                <td></i><input type="text" name="titLib" value="<%= lin.getLibro().getTit()%>" size="30" /><img src="img/29302.png" width="20" height="20"></td>
                                    <td><input type="text" name="autLib" value="<%= lin.getLibro().getAut() %>" size="30" /></td>
                                    <td><input type="submit" class="btn btn-danger"  value="Quitar" name="accion" /></td>
                                </form>
                                    
                                </tr>
                                <%}%>
                                <tr align="center">
                                    <td colspan="2"><input type="submit" class="btn btn-success" value="Grabar Ficha" name="accion"></td>
                                    <td colspan="2"><label>Fecha de Devolucion:</label> <img src="img/1855.png" width="28" height="28"><input type="text" name="carrUsu" value="<%= pres.getFecDev()%>" size="30" /></td>
                                </tr>
                            </tbody>
                            
                        </table>

                        
                    </tbody>
                </table>

            </form>
        
        </div>
        
    </body>
</html>
