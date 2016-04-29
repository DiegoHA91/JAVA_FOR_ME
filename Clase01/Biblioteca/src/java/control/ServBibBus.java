/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Modelo.MantBiblio;
import Modelo.Bibliotecario;
import Modelo.Lector;
import Modelo.Prestamo;

import datos.Operacion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dieguito
 */
@WebServlet(name = "ServBibBus", urlPatterns = {"/ServBibBus"})
public class ServBibBus extends HttpServlet {
   

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
            String acc = request.getParameter("accion");
            String codBib = request.getParameter("codBib");
            String msg = null;
            String numpre = request.getParameter("numpre");
            String fecpre = request.getParameter("fecpre");
            String fecdev = request.getParameter("fecdev");
            String pass = request.getParameter("pass");
            String codusu = request.getParameter("usu2");
            HttpSession ss = request.getSession(true);
            if(acc==null){
                msg="Nombre de Controles incorrectos";
            }else if(acc.equals("Buscar Prestamo")){
                Prestamo b = MantBiblio.buscar(codBib);
                if(b!=null){
                    ss.setAttribute("b",b);
                    response.sendRedirect("MenuActB.jsp");
                }
                else{
                    msg="No existe el Prestamo";
                }
            }else if(acc.equals("Grabar")){
                Bibliotecario b = new Bibliotecario();
                b.setCod(numpre);
                b.setNom(fecpre);
                b.setPass(pass);
                b.setUsua(fecdev);
               
                MantBiblio.grabar(b);
                msg="Operacion Exitosa";
            }else if(acc.equals("Actualizar")){
                Prestamo b = new Prestamo();
                b.setNum(numpre);
                b.setFec(fecpre);
                b.setFecDev(fecdev);
                MantBiblio.Acualizar(b);
                msg="Operacion Exitosa";
            }
            else{
                msg="Operación desconocida";
            }
            if(msg!=null){
                ss.setAttribute("msg", msg);
                response.sendRedirect("Mensaje.jsp");
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

    

}
