/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Modelo.Bibliotecario;
import Modelo.Ficha_Devolucion;
import Modelo.Libro;
import Modelo.LineaDev;
import Modelo.Prestamo;
import Modelo.Lector;
import datos.Fecha;
import datos.FechaDev;
import datos.GeneraNumeroFDEV;
import datos.Operacion;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Dieguito
 */
@WebServlet(name = "FichDevReg", urlPatterns = {"/FichDevReg"})
public class FichDevReg extends HttpServlet {
    private Prestamo prest;
    private Ficha_Devolucion fichadev;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acc=request.getParameter("accion");
        if(acc.equals("Nuevo")){
            this.NuevaFichaDev(request,response);
        }else if (acc.equals("Buscar Ficha de Prestamo")) {
            this.busFichaPrest(request,response);
        }else if (acc.equals("Grabar Ficha Devolucion")) {
            this.GrabarFichaDev(request,response);
        }else if (acc.equals("Cancelar")) {
            this.CancelarFichaDev(request,response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void NuevaFichaDev(HttpServletRequest request, HttpServletResponse response) 
       throws ServletException, IOException {
        prest=new Prestamo();
        String num = GeneraNumeroFDEV.getNum("SELECT * FROM FICHA_DEVOLUCION");
        prest.setNum(num);
        
        String fec = Fecha.getFec();
        prest.setFec(fec);
        
        String fecdev = FechaDev.getFecDev();
        prest.setFecDev(fecdev);
        
        Bibliotecario bib = (Bibliotecario)request.getSession().getAttribute("bib");
        prest.setBibliotecario(bib);
        
        request.getSession().setAttribute("prest", prest);
        response.sendRedirect("FichDevNR.jsp");
        
    } 

    private void BuscarFichaPre(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
            String codusu = request.getParameter("codUsu");
            String sql = "SELECT  FROM LECTOR WHERE COD_LEC='"+codusu+"'";
             Object[] fil = Operacion.getFila(sql);
            if(fil!=null){
                Lector usu = new Lector();
                usu.setCod(fil[0].toString());
                usu.setNom(fil[1].toString());
                usu.setCarrera(fil[2].toString());
                prest.setUsu(usu);
                response.sendRedirect("SolicitudBus.jsp");
            }else{
                request.getSession().setAttribute("msg","El Lector Ingresado no Contiene Ninguna Ficha de Prestamo");
                response.sendRedirect("Mensaje.jsp");
            }
   
    }

    private void GrabarFichaDev(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
            String msg;//
            String sql = "INSERT INTO FICHA_DEVOLUCION VALUES('"+prest.getNum()+"','"+prest.getFec()+"','"+fichadev.getNum()+"','"+fichadev.getBibliotecario().getCod()+"')";
            msg = Operacion.ejecutar(sql);

            if(msg==null){
                msg="Ficha Grabada";
            }else{
                msg="Error en Grabar Ficha";
            }
                
            
            request.getSession().setAttribute("msg",msg);
            response.sendRedirect("Mensaje.jsp");
    }

    private void CancelarFichaDev(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
            response.sendRedirect("Menu.jsp");
    }

    private void busFichaPrest(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
            fichadev = new Ficha_Devolucion();
            String codusu = request.getParameter("codUsu");
            String sql ="SELECT  FP.NUM_PRESTAMO,L.NOM_LEC,L.COD_LEC,LB.COD_LIB,LB.NOM_LIB,FP.FECHA_PREST,FP.FECHA_DEV,B.COD_BIB "
                                      + "FROM LIBRO LB "
                                      + "INNER JOIN DETALLEFPRESTAMO DP "
                                      + "ON LB.COD_LIB = DP.COD_LIB "
                                      + "INNER JOIN FICHA_PRESTAMO FP "
                                      + "ON FP.NUM_PRESTAMO = DP.NUM_PRESTAMO "
                                      + "INNER JOIN BIBLIOTECARIO B "
                                      + "ON B.COD_BIB = FP.COD_BIB "
                                      + "INNER JOIN LECTOR L "
                                      + "ON L.COD_LEC = FP.COD_LEC "
                                      + "WHERE L.COD_LEC='"+codusu+"' AND FP.NUM_PRESTAMO=(SELECT MAX(NUM_PRESTAMO)" 
                                      + " FROM FICHA_PRESTAMO" 
                                      + " WHERE COD_LEC='"+codusu+"'" 
                                      + ") ";
             //Object[] fil = Operacion.getFila(sql);
             List list = Operacion.getTabla(sql);
             if(list!=null){
                 
                for(int i=1;i<list.size();i++){
                    Object[] fil= (Object[]) list.get(i);  
                    fichadev.setNum(fil[0].toString());
                    
                    
                    Lector usu = new Lector();
                    usu.setNom(fil[1].toString());
                    usu.setCod(fil[2].toString());
                    fichadev.setUsu(usu);
                    Libro lib = new Libro();
                    lib.setCod(fil[3].toString());
                    lib.setTit(fil[4].toString());
                    String Fecha=fil[5].toString();
                    fichadev.setFec(fil[5].toString());
                    String FechaDev=fil[6].toString();
                    fichadev.setFecDev(fil[6].toString());
                    Bibliotecario bib = new Bibliotecario();
                    bib.setCod(fil[7].toString());
                    fichadev.setBibliotecario(bib);
                    fichadev.setUsu(usu);
                    fichadev.agregarLineas(lib, bib,Fecha, FechaDev,usu,fichadev);
                    request.getSession().setAttribute("dev", fichadev);
                    response.sendRedirect("FichDevGrabar.jsp");
                }
            }else{
                request.getSession().setAttribute("msg","El Lector Ingresado no Contiene Ninguna Ficha de Prestamo");
                response.sendRedirect("Mensaje.jsp");
            }
         }

}
