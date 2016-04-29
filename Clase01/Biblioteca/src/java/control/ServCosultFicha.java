/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Modelo.Bibliotecario;
import Modelo.MantBiblio;
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
@WebServlet(name = "ServCosultFicha", urlPatterns = {"/ServCosultFicha"})
public class ServCosultFicha extends HttpServlet {

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
            String nroprestamo = request.getParameter("fecha");
            String msg = null;
            String cod = request.getParameter("cod");
            String nom = request.getParameter("nom");
            String usu = request.getParameter("usu");
            String pass = request.getParameter("pass");
            HttpSession ss = request.getSession(true);
            if(acc==null){
                msg="Nombre de Controles incorrectos";
            }else if(acc.equals("Buscar")){
                    response.sendRedirect("MenuListFichas.jsp");
            }else if(acc.equals("Grabar")){
                Bibliotecario b = new Bibliotecario();
                b.setCod(cod);
                b.setNom(nom);
                b.setPass(pass);
                b.setUsua(usu);
                MantBiblio.grabar(b);
                msg="Operacion Exitosa";
            }else if(acc.equals("Actualizar")){
                Bibliotecario b = new Bibliotecario();
                b.setCod(cod);
                b.setNom(nom);
                b.setPass(pass);
                b.setUsua(usu);
         
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
