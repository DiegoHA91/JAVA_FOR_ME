package pe.egcc.model;



public class MyMath {
    
    
    private MyMath(){
        
    }
    
    public static double factorial (int n) { 
        
    double resultado;
    for (resultado=n; n>1;n--) {resultado = resultado*(n-1);}  
    return resultado; 
    }
    
    public static int mcd(int num1, int num2) {
        int mcd = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        do {
            mcd = b;
            b = a%b;
            a = mcd;
        } while(b!=0);
        return mcd;
    }
 

    public static int mcm(int num1, int num2) {
        int mcm = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        mcm = (a/mcd(a, b))*b;
        return mcm;
    }
    
    public static String fibonacci(int n) {
        
        String serie="";
                
        int n1 = 0;
        int n2 = 1;
        int aux;
        int limite = n+2;
 
        serie += n1 +", "+n2;
        
 
        while (n2 + n1 <= 80) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;
            
            serie += ", ";
            serie += n2;
            
        }
        
        return serie;
    }
    
    
}
