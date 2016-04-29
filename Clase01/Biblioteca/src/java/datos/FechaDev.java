package datos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaDev {
  public static String getFecDev(){
    String xpres,xdev;
    Calendar xdias=Calendar.getInstance();
    DateFormat xfecha=new SimpleDateFormat("yyyy-MM-dd");  
    GregorianCalendar xsuma=new GregorianCalendar();
    xpres=xfecha.format(xdias.getTime());
    xsuma.setTime(xdias.getTime());
    xsuma.add(Calendar.DATE, 3);
    xdev=xfecha.format(xsuma.getTime());
    return xdev;
    
  }
}
