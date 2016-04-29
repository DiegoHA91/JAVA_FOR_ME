package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
//    public Connection getConexion(){
//        Connection cn;
//        try{
//          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
//          cn=DriverManager.getConnection("jdbc:sqlserver:RENZO\\SSMS:1433;databaseName=biblioteca","sa","sa");
//        }catch(ClassNotFoundException e){
//            System.err.println("Error en Driver: " + e);
//            cn=null;
//        }catch(SQLException e){
//            System.err.println("Error en La conexion : " + e);
//            cn=null;
//        }
//        return cn;
//    }
    
     public static Connection getConexion() {
        Connection cn = null;         
        try {
            String servidor ="LOCALHOST";//Nombre de la instancia del servidor sql
            String puerto = "1433";
            String user="sa";
            String pass="sa";
            String database = "BIBLIOTECA";    
            String url="jdbc:sqlserver://"+servidor+":"+puerto+";databaseName="+database+
                  ";user="+user+";password="+pass+";";    

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //abrir  conexion
        cn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            cn=null;
            JOptionPane.showMessageDialog(null,"Error no se puede cargar el driver:");           
        } catch (SQLException e) {
                  
            
            try {
                String servidor ="LENOVO-PC";//Nombre de la instancia del servidor sql
                String puerto = "1433";
                String user="sa";
                String pass="sa";
                String database = "BIBLIOTECA_REPLICA";
                String url="jdbc:sqlserver://"+servidor+":"+puerto+";databaseName="+database+
                        ";user="+user+";password="+pass+";";
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                try {
                    //abrir  conexion
                    cn = DriverManager.getConnection(url);
                } catch (SQLException ex) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                   
        return cn;
    }
    
}
