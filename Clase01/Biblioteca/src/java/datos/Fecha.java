package datos;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
  public static String getFec(){
    Date f=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    return sdf.format(f);
  }
}
