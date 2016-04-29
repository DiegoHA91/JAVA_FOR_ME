

package datos;
import java.sql.*;
public class GeneraNumero {
    
    public static String getNum(String sql){
        String numGen;
        String numObt=null;
        try{
            Connection cn=new Conexion().getConexion();
            if(cn==null){
                numGen=null;
            }else{
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                while(rs.next()){
                    numObt=rs.getString(1);
                }
                
                numGen= String.valueOf((Integer.parseInt(numObt)+1));
            }
        }catch(SQLException e){
            numGen=null;
        }
        return numGen;
    }
}
