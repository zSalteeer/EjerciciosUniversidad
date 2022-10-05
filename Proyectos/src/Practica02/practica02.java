package practica02;
public class practica02 {

    public static void main(String[] args) {
        // Ecuación de Segundo Grado
        
        // 1 declarar variables (decide double porque es útil en todo el manejo númerico) 
        // y los resultados en String porque abarca todos los tipos
        double a,b,c;
        String x1,x2;
        
        // 2 asignar variables
        a=1;b=2;c=1;
        
        // 3 realizar calculos
        // ( -b + raiz2 ( b2 - 4 a c ) ) / ( 2 * a )
        // ( -b - raiz2 ( b2 - 4 a c ) ) / ( 2 * a )
        x1=(( -b + Math.sqrt( (b*b) - (4*a*c) ) ) / ( 2 * a ))+"";
        x2=(( -b - Math.sqrt( (b*b) - (4*a*c) ) ) / ( 2 * a ))+"";
        
        // 4 mostrar resultados
        System.out.println("x1="+x1);
        System.out.println("x2="+x2);
        
        System.out.println("---------------------------------------------------------------------------------");

        // 1 declarar variables (decide double porque es útil en todo el manejo númerico) 
        // y los resultados en String porque abarca todos los tipos
        double ia,ib,ic,id;
        String ix1,ix2;
        
        // 2 asignar variables
        ia=1;ib=2;ic=3;
        id=((ib*ib)-(4*ia*ic));
                
        // 3 realizar calculos
        // ( -b + raiz2 ( b2 - 4 a c ) ) / ( 2 * a )
        // ( -b - raiz2 ( b2 - 4 a c ) ) / ( 2 * a )
        ix1=( -ib/( 2 * ia )) + "+" + (Math.sqrt( -id ) / ( 2 * ia ))+"i";
        ix2=( -ib/( 2 * ia )) + "-" + (Math.sqrt( -id ) / ( 2 * ia ))+"i";
        
        // 4 mostrar resultados
        System.out.println("ix1="+ix1);
        System.out.println("ix2="+ix2);
        
    }
}

