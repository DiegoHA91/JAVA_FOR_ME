/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Modelo.Bibliotecario;
import Modelo.Libro;
import Modelo.LineaPres;
import Modelo.Prestamo;
import Modelo.Lector;
import datos.Fecha;
import datos.FechaDev;
import datos.GeneraNumero;
import datos.Operacion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dieguito
 */
@WebServlet(name = "RegistroSol", urlPatterns = {"/RegistroSol"})
public class RegistroSol extends HttpServlet {
    private Prestamo prest;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acc=request.getParameter("accion");
        if(acc.equals("Iniciar Sesion")){
            this.acceso(request,response);
        }else if (acc.equals("Nuevo Prestamo")) {
            this.nuevo(request,response);
        }else if (acc.equals("Cancelar Prestamo")) {
            this.cancelar(request,response);
        }else if (acc.equals("Buscar Usuario")) {
            this.busUsu(request,response);
        }else if (acc.equals("Buscar Libro")) {
            this.busLib(request,response);
        }else if (acc.equals("Agregar Libro")) {
            this.agregar(request,response);    
        }else if (acc.equals("Quitar")) {
            this.quitar(request,response);
        }else if (acc.equals("Grabar Ficha")) {
            this.grabar(request,response);
        }else if (acc.equals("Cerrar Sesión")) {
            this.cerrar(request,response);
        }
    }
    protected void acceso(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         String usua = request.getParameter("usuario");
         String pass = request.getParameter("clave");
         String sql = "SELECT COD_BIB,NOM_BIB,USU_BIB FROM BIBLIOTECARIO WHERE USU_BIB LIKE '"+usua+"' AND CLAVE_BIB LIKE '"+pass+"'";
         Object[] fila = Operacion.getFila(sql);
         if(fila!=null){
             Bibliotecario bib = new Bibliotecario();
             bib.setCod(fila[0].toString());
             bib.setNom(fila[1].toString());
             bib.setUsua(fila[2].toString());
             request.getSession().setAttribute("bib", bib);
             response.sendRedirect("Menu.jsp");
         }else{
             request.getSession().setAttribute("msg", "Acceso no permitido");
             response.sendRedirect("Mensaje.jsp");
         }
    }    
    
    protected void nuevo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        prest=new Prestamo();
        String num = GeneraNumero.getNum("  SELECT TOP(1) num_prestamo\n" +
                                         "  FROM ficha_prestamo\n" +
                                         "  ORDER BY num_prestamo DESC");
        prest.setNum(num);
        
        String fec = Fecha.getFec();
        prest.setFec(fec);
        
        String fecdev = FechaDev.getFecDev();
        prest.setFecDev(fecdev);
        
        Bibliotecario bib = (Bibliotecario)request.getSession().getAttribute("bib");
        prest.setBibliotecario(bib);
        
        request.getSession().setAttribute("prest", prest);
        response.sendRedirect("SolicitudB.jsp");
        
    } 
    
    protected void cancelar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.sendRedirect("Menu.jsp");
    }
    
    protected void busUsu(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String codusu = request.getParameter("codUsu");
         String sql = "SELECT * FROM USUARIO WHERE cod_usu='"+codusu+"'";
         Object[] fil = Operacion.getFila(sql);
         if(fil!=null ){
             Lector usu = new Lector();
             usu.setCod(fil[0].toString());
             usu.setNom(fil[1].toString());
             usu.setCarrera(fil[2].toString());
             prest.setUsu(usu);
             response.sendRedirect("SolicitudBus.jsp");
         }else{
             request.getSession().setAttribute("msg","Usuario no encontrado");
             response.sendRedirect("Mensaje.jsp");
         }
    }
    
    protected void busLib(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String cod = request.getParameter("codLib");
            String sql = "SELECT * FROM LIBRO WHERE COD_LIB='"+cod+"'";
            Object[] fil = Operacion.getFila(sql);
            if(fil!=null){
                Libro lib = new Libro();
                lib.setCod(fil[0].toString());
                lib.setTit(fil[1].toString());
                lib.setAut(fil[2].toString());
                request.getSession().setAttribute("lib", lib);
                response.sendRedirect("LibroAgr.jsp");
            }else{
                request.getSession().setAttribute("msg", "Libro No encontrado");
                response.sendRedirect("Mensaje.jsp");
            }
    }
    protected void agregar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Libro lib =(Libro)request.getSession().getAttribute("lib");
            prest.agregarLineas(lib);
            
            response.sendRedirect("SolicitudGra.jsp");
    }
    
    protected void quitar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String cod = request.getParameter("codLib");
            prest.quitarLinea(cod);
            response.sendRedirect("SolicitudGra.jsp");
    }
    
     protected void grabar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String msg;//
            //String sql = "INSERT INTO FICHA_PRESTAMO (num_prestamo,fecha_prest,fecha_dec,cod_bib,cod_usu)  VALUES('5000005','12/02/2014','13/02/2014','COD002','USU002')";
            String sql = "INSERT INTO FICHA_PRESTAMO (num_prestamo,fecha_prest,fecha_dec,cod_bib,cod_usu) VALUES('"+prest.getNum()+"','"+prest.getFec()+"','"+prest.getFecDev()+"','"
                        +prest.getBibliotecario().getCod()+"','"+prest.getUsu().getCod()+"')";
           
            msg = Operacion.ejecutar(sql);
            Iterator i = prest.getLineas().values().iterator();
            while(i.hasNext()){
                LineaPres lin = (LineaPres)i.next();
                String sql2 = "INSERT INTO DETALLE (num_prestamo,cod_lib) VALUES('"+prest.getNum()+"','"+lin.getLibro().getCod()+"')";
                msg=Operacion.ejecutar(sql2);
            }
            if(msg==null){
                msg="Ficha Grabada";
            }else{
                msg="Error en Grabar Ficha";
            }
                
            
            request.getSession().setAttribute("msg",msg);
            response.sendRedirect("Mensaje.jsp");
    }
    
    protected void cerrar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
            request.getSession().setAttribute("end","1");
            response.sendRedirect("Acceso.jsp");
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
