
package javaapplication2;
import java.awt.Component;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;

public class celdaConImagen implements TableCellRenderer{
    JLabel etiqueta;
    private static Connection xcn=null;
    Statement xst=null;
    ResultSet xrs=null;
public void celdaConImagen(){
        try {
           JLabel etiqueta=new JLabel("");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            xcn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
            xst=xcn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(celdaConImagen.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    @Override
    public Component getTableCellRendererComponent(JTable tabla, Object arg1, boolean isSelected, boolean arg3, int fila, int i1) {
        
        try {
            String xcod,strBuscar;
            Blob xfoto;
            xcod=tabla.getModel().getValueAt(fila, 0).toString();
            System.out.println(xcod);
            strBuscar="select foto from empleados";
            xrs=xst.executeQuery(strBuscar);
            System.out.println("El error esta aki");
            if(xrs.next()){
                xfoto=xrs.getBlob(1);
                ImageIcon image=new ImageIcon(xfoto.getBytes(1, (int)xfoto.length()));
                ImageIcon imageSmall=new ImageIcon(image.getImage().getScaledInstance(40, 50, 50));
                etiqueta.setIcon(imageSmall);
            } if(i1==1){
            tabla.repaint();
            return etiqueta;
        }else{
        tabla.repaint();
        }
              
            //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
        
       
    }
    
}
