package Practica06;
public class ecuacion {
    public static double disc1 (double a, double b, double c){
    return (-b+Math.sqrt(b*b-4*a*c))/2*a; 
    }
    public static double disc2 (double d, double e, double f){
        return (-e-Math.sqrt(e*e-4*d*f))/2*d; 
    }
    public static double discneg1 (double g, double h, double i){
        return (-h+Math.sqrt(h*h-(4*g*i*-1)))/2*g; 
    }
    public static double discneg2 (double j, double k, double l){
        return (-k-Math.sqrt(k*k-(4*j*l*-1)))/2*j; 
    }
    public static void resultadodisc1(){
        double a=1, b=2, c=1;
        System.out.println("El resultado positivo es:  "+disc1(a,b,c));
    }
    public static void resultadodisc2(){
    double d=1, e=2, f=1;
    System.out.println("El resultado negativo es:  "+disc2(d,e,f));
    }
    public static void resultadodiscneg1(){
    double g=1, h=2, i=3;
    System.out.println("El resultado positivo imaginario es:  "+discneg1(g,h,i));
    }
    public static void resultadodiscneg2(){
    double j=1, k=2, l=3;
    System.out.println("El resultado negativo imaginario es:  "+discneg2(j,k,l));
    }   
    public static void imprimeDivision(){
        System.out.println("------------------------------------------");
    }  
    public static void main(String[] args) {
        ecuacion.resultadodisc1();
        ecuacion.resultadodisc2();
        ecuacion.imprimeDivision();
        ecuacion.resultadodiscneg1();
        ecuacion.resultadodiscneg2();
    }
}
