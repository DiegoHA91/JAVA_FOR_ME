package cl.bean;

import cl.pojos.Categoria;
import cl.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@ManagedBean(name = "catBean")
@RequestScoped
public class CategoriaBean {
    
    private Categoria categoria;
    private List<Categoria> categorias;
    
    public CategoriaBean() {
        categoria = new Categoria();
        categorias = new ArrayList<>();
        cargarCategorias();//Cuando se inicia el formulario
        //se cagan los objetos en la lista de categorias
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    //Este metodose encarga de cargar en la lista llamada categorias
    //los objetos de la base de datos
    private void cargarCategorias(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        categorias = ses.createQuery("from Categoria").list();
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Categoria> getCategorias(){
        return categorias;
    }
    
    public String guardar(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Transaction tx = ses.beginTransaction();
        Categoria cat = new Categoria(categoria.getNombre());
        ses.saveOrUpdate(cat);
        tx.commit();
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Categoría almacenada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        categoria.setNombre("");
        cargarCategorias();//Cuando se ingresa un nueva categoria es necesaio 
        //La lista de categoria
        return "index";
    }
    
    public String eliminar(){
        for(Categoria c : categorias){
            if(c.isSelected()){
                SessionFactory sf = HibernateUtil.getSessionFactory();
                Session se = sf.openSession();
                //Se realiza la busqueda del objeto categoria esto es analogo a 
                //REalizar la operacion select ¨from categoria where codigo = ?
                Categoria cat = (Categoria) se.get(Categoria.class, c.getCodigo());
                se.delete(cat);
                se.beginTransaction().commit();
            }
        }
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Categoría eliminada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        cargarCategorias();//Volvemos a actualizar la lista de categorias
        return "index";
    }
}
