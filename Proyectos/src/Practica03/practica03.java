package Practica03;
import java.util.Scanner;
//@author CRM
public class practica03 {
    public static void main(String[] args){
            Scanner datos = new Scanner (System.in);
            double var_1,var_2,var_3, disc, discneg;
            double raiz, raizp;
            double suma,resta, sumap,restap,sumap2,restap2;
            System.out.println("Digite los números que emplearás para la fórmula general");
            var_1 = datos.nextDouble();
            var_2 = datos.nextDouble();
            var_3 = datos.nextDouble();          
            disc= (var_2*var_2)-(4*var_1*var_3);
           
            if (var_1==0||var_2==0||var_3==0){
                System.err.println("No digites cero en ninguna de las variables, porfavor");
            }
            else if (disc<0){
                discneg= disc*-1;
                raiz = Math.sqrt(discneg);
                suma = -var_2/(2*var_1);
                sumap = raiz / 2*var_1;
                resta = -var_2 / (2*var_1);
                restap = raiz / 2*var_1;
                System.out.println("Primeramente tienes que entender que los resultados obtenidos, son números imaginarios");
                System.out.println("El resultado positivo es: " +suma + " + " +sumap + " " + "i");
                System.out.println("El resultado negativo es " +resta + " - " +restap + " "+ "i");
            } else{
                raizp= Math.sqrt(disc);
                sumap2= (-var_2+raizp)/2*var_1;
                restap2 = (-var_2-raizp)/2*var_1;
                System.out.println("El primer resultado es: " +sumap2);
                System.out.println("El segundo resultado es " +restap2);
            }
   
        }    
    }  


