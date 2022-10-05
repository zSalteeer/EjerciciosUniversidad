package datos;
import java.util.Scanner;
//@author CRM
public class Datos {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
        int ent1,ent2,ent3;
        float dat1,dat2,dat3;
        int div1,div2,div3,div4,div5,div6,div7, div8;
        float exp1,exp2,exp3;
        String s1 = "He";
        String s2 = " ";
        String s3 = "Terminado";
        String s4 = s1+s2+s3;
        //Números enteros
        System.out.println("Introduce dos digitos, usa enteros solamente: ");
        ent1 = ingreso.nextInt();
        ent2 = ingreso.nextInt();
        ent3= ent1+ent2;
        System.out.println("La suma de ambos numeros enteros da como resultado: "+ent3);
        //Números decimales
        System.out.println("Ahora, Introduce dos digitos, usa decimales: ");
        dat1= ingreso.nextFloat();
        dat2= ingreso.nextFloat();
        dat3= dat1+dat2;
        System.out.println("La suma de ambos numeros con decimales es: "+dat3);
        //Fracciones
        System.out.println("Introduce el primer numerador y denominador: ");
        div1= ingreso.nextInt();
        div2= ingreso.nextInt();
        System.out.println("Introduce el segundo numerador y denominador: ");
        div3= ingreso.nextInt();
        div4= ingreso.nextInt();
        div5= div2*div4; //Multiplicacion denominadores
        div6= div1*div4; //Multiplicar 1er numerador por el 2do denominador
        div7= div2*div3; //Multiplicar 2do numerador por el 1er denominador
        div8= div6+div7; //Suma de numeradores
        System.out.printf("La suma de las fracciones da como resultado: %d / %d", div8, div5);
        //Exponentes
        //Recuerda que se usa la "e" en vez del "x10"
        System.out.println(" \n Introduce dos numeros exponenciales: ");
        exp1= ingreso.nextFloat();
        exp2= ingreso.nextFloat();
        exp3= exp1+exp2;
        System.out.println("La suma de dichos exponentes es: "+exp3);
        //Cadena de texto
        System.out.println(s4);
    } 
}
