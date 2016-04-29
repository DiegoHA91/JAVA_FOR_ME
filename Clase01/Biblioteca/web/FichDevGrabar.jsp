

<%@page import="Modelo.LineaDev"%>
<%@page import="Modelo.Prestamo"%>
<%@page import="Modelo.LineaPres"%>
<%@page import="java.util.TreeMap"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Ficha_Devolucion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elaborar Ficha de Devolucion</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/MyStyle.css">
        
    </head>
    <body>
        <div id="divnewsol">
            <form class="form-inline" action="FichDevReg" method="POST">
                <% Prestamo pres=(Prestamo)session.getAttribute("prest");%>
                
             
                
                <table   class="table table-bordered" border="0">
                    <thead>
                        <tr id="trtit">
                            <th id="titsol" colspan="7">ELABORAR FICHA DE DEVOLUCION</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td colspan="7"><input type="submit" class="btn btn-warning" value="Cancelar" name="accion" /></td>
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
                            <td colspan="7"><a href="">Buscar Ficha de Prestamo</a></td>
                        </tr>
                        
                        <% Ficha_Devolucion dev = (Ficha_Devolucion)session.getAttribute("dev");%>
                         <% Iterator i = new TreeMap(dev.getLineas()).keySet().iterator();%>
                                <% while(i.hasNext()) {%>
                                <% String cod=(String)i.next();%>
                                <% LineaDev lin=(LineaDev)dev.getLineas().get(cod);%>
                    
                        <tr>
                            
                            <td>Numero F.Prestamo</td>
                            <td><input type="text" name="numFPres" value="<%= dev.getNum() %>" size="5" /></td>
                            <td>Lector:</td>
                            <td><input type="text" name="nomUsu" value="<%= dev.getUsu().getNom()%>" size="30" /></td>
                            <td>Código:</td>
                            <td><input type="text" name="codUsu" value="<%= dev.getUsu().getCod() %>" size="30" /></td>
                        </tr>
                        
                        <table class="table table-bordered" border="0">
                            
                            <thead>
                                 
                                <tr>
                                    <th>CÓDIGO</th>
                                    <th>TITULO</th>
                                    <th>FECHA DEL PRESTAMO</th>
                                    <th>FECHA DE DEVOLUCION</th>
                                    <th>BIBLIOTECARIO PRESTANTE</th>
                                </tr>
                            </thead>
                            <tbody>
                               
                                <tr>
                                <form action="FichDevReg" method="post">
                                <td><input type="text" name="codLib" value="<%= lin.getLibro().getCod()%>" size="5" /></td>
                                <td></i><input type="text" name="titLib" value="<%= lin.getLibro().getTit()%>" size="30" /><img src="img/29302.png" width="20" height="20"></td>
                                    <td><input type="text" name="autLib" value="<%= lin.getFecha()%>" size="30" /></td>
                                    <td><input type="text" name="autLib" value="<%= lin.getFechaDev()%>" size="30" /></td>
                                    <td><input type="text" name="autLib" value="<%= lin.getBib().getCod()%>" size="30" /></td>
                                </form>
                                    
                                </tr>
                                <%}%>
                                <tr align="center">
                                    <td colspan="5"><input type="submit" class="btn btn-success" value="Grabar Ficha Devolucion" name="accion"></td>
                                </tr>
                            </tbody>
                            
                        </table>

                        
                    </tbody>
                </table>

            </form>
        
        </div>
        
    </body>
</html>
