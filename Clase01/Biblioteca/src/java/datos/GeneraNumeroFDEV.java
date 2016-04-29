

package datos;
import java.sql.*;
public class GeneraNumeroFDEV {
    
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
                String parInt=numObt.substring(2);
                String parStr=numObt.substring(0,1);
                String nueParInt=String.valueOf(Integer.parseInt(parInt)+1);
                while(nueParInt.length()<5){
                    nueParInt="0"+nueParInt;
                }
                numGen=parStr+nueParInt;
            }
        }catch(SQLException e){
            numGen=null;
        }
        return numGen;
    }
}
