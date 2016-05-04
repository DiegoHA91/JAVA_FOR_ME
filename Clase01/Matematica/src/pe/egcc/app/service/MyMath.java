package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class MyMath {

  private MyMath() {
  }

  public static long factorial(int n){
     long resultado;
     for (resultado=n; n>1;n--) {resultado = resultado*(n-1);}  
     return resultado;
  }
  
  public static int mcd(int n1, int n2){
    
      int mcd = 0;
      int a = Math.max(n1, n2);
      int b = Math.min(n1, n2);
      do {
          mcd = b;
          b = a % b;
          a = mcd;
      } while (b != 0);
      return mcd;
  }
  
  public static int mcm(int n1, int n2){
      int mcm = 0;
      int a = Math.max(n1, n2);
      int b = Math.min(n1, n2);
      mcm = (a / mcd(a, b)) * b;
      return mcm;
  }
  
  public static int[] fibonacci(int n){
    
    return null;
  }
  
  public static boolean esPrimo(int n){
    
    return false;
  }
  
  
  

  
}
