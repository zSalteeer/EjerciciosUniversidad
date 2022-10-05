package Practica07;
import java.util.Scanner;
public class Ecuacion {

    public double a;
    public double b;
    public double c;
    public double d;
    public String x1;
    public String x2;
    public String tipo;

    public Ecuacion(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=((b*b)-(4*a*c)); //Discriminante
    }

    public void calcularX1() {
        if (a==0){
            //No es ecuación de grado 2
            this.tipo="No es Ecuación de Segundo Grado";
            this.x1="No Existe";
        }
        else if (this.d>=0){ //Si es discriminante es negativo, tiene que ser imaginaria la resolución
            //Real
            this.tipo="Tipo Real";
            this.x1=(( -b + Math.sqrt( (b*b) - (4*a*c) ) ) / ( 2 * a ))+"";
        } else {
            //Imaginaria
            this.tipo="Tipo Imaginario";
            this.x1=( -b/( 2 * a )) + "+" + (Math.sqrt( -d ) / ( 2 * a ))+"i";
        }
    }

    public void calcularX2() {
        if (a==0){
            //No es ecuación de grado 2
            this.tipo="No es Ecuación de Segundo Grado";
            this.x2="No Existe";
        }
        else if (this.d>=0){
            //Real
            this.tipo="Tipo Real";
            this.x2=(( -b - Math.sqrt( (b*b) - (4*a*c) ) ) / ( 2 * a ))+"";
        } else {
            //Imaginaria
            this.tipo="Tipo Imaginario";
            this.x2=( -b/( 2 * a )) + "-" + (Math.sqrt( -d ) / ( 2 * a ))+"i";
        }
    }

    public void resultado() {
        System.out.println("Ecuación Segundo Grado OO");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        calcularX1();
        calcularX2();
        System.out.println("Tipo Solución: "+tipo);
        System.out.println("x1: "+x1);
        System.out.println("x2: "+x2);
    }
    
    public static void main(String[] args){
        Scanner datos = new Scanner (System.in);
        double a, b, c;
        System.out.println("Digite variable a: ");
        a = datos.nextDouble();
         System.out.println("Digite variable b: ");
        b = datos.nextDouble();
         System.out.println("Digite variable c: ");
        c = datos.nextDouble();
        Ecuacion obj=new Ecuacion(a,b,c);
        obj.resultado();
    }
}

