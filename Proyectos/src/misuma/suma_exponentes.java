package misuma;

public class suma_exponentes {
    
    
    public static void main(String[] args) {
        double x=0;
        for(int i=0; i<5; i++ ){
        double i2=i;
        double resultado=(Math.pow(x,i2)); 
            x=x+resultado;
            
        }
        
        System.out.println(x);
    }
}
