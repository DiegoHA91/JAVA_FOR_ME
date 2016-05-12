package cl.bean;

import cl.pojos.Categoria;
import cl.util.HibernateUtil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@ManagedBean(name = "catBean")
@RequestScoped
public class CategoriaBean {
    private String nombre;
    
    
    public CategoriaBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public List<Categoria> getCategoria(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Categoria> lista = ses.createQuery("from Categoria").list();
        List<Categoria> lista2 = ses.createCriteria(Categoria.class).list();
        return lista;
    }
    
    public String guardar(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        Transaction tx = ses.beginTransaction();
        Categoria cat = new Categoria(nombre);
        ses.saveOrUpdate(cat);
        tx.commit();
        return "index";
    }
}
