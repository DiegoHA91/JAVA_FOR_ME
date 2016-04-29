package datos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operacion {
    public static String ejecutar(String sql){
        String msg=null;
        try{
            Connection cn=new Conexion().getConexion();
            if(cn==null){
                msg="No hay Conexion con la Base de Datos";
            }else{
                Statement st=cn.createStatement();
                st.executeUpdate(sql);
                cn.close();
            }          
        }catch(SQLException e){
            msg=e.getMessage();
            System.out.println("Este es el error "+e);
        }
        return msg;
    }
    public static List getTabla(String sql){
        List lista=new ArrayList();
        try{
            Connection cn=new Conexion().getConexion();
            if(cn==null){
                lista=null;
            }else{
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                ResultSetMetaData rm=rs.getMetaData();
                int numCol=rm.getColumnCount();
                String[] titCol=new String[numCol];
                for(int i=0;i<numCol;i++)
                   titCol[i]=rm.getColumnName(i+1);
                lista.add(titCol);
                while(rs.next()){
                    Object[]fila=new Object[numCol];
                    for(int i=0;i<numCol;i++)
                        fila[i]=rs.getObject(i+1);
                    lista.add(fila);
                }
                cn.close();
            }
        }catch(SQLException e){
            lista=null;
        }
        return lista;
    }
    public static Object[] getFila(String sql){
        Object[] fila=null;
        List lista=getTabla(sql);
        if(lista!=null){
            if(lista.size()>1)
                fila=(Object[])lista.get(1);
        }
        return fila;
    }
    public static Object getColumna(String sql) {
        Object[] fila = getFila(sql);
        Object columna = null;
        if (fila != null) {
            columna = fila[0];
        }
        return columna;
    } 
}
