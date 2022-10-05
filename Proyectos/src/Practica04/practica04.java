package Practica04;
import java.util.Scanner;
import java.util.Arrays;
// author @CRM
public class practica04 {
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        int cont=0;
        String apellido, nombre;
        int [] notas= new int [6];
        float prom;
        System.out.println("Porfavor, digite sus apellidos: ");
        apellido = datos.nextLine();
        System.out.println("Porfavor, digite sus nombres: ");
        nombre= datos.nextLine();        
        System.out.println("Digite cuántas notas vas a ingresar en un máximo de 5, porfavor: ");
        cont = datos.nextInt();
        for(int aux=1; aux<=cont;aux++){
            if (notas.length<cont){
                break;
            }
            System.out.println("Porfavor, digite sus notas");
            notas [aux]= datos.nextInt();
        }
        int sum = Arrays.stream(notas).sum();  //Suma del array
        prom=sum/cont;
        
        if(prom<0 || prom>10){
            System.err.println("No puedes sacar más de 10 o menos de 0, dígita bien porfavor");
        }
        else if(prom>=9.1 && prom<=10){
            System.out.println(apellido + "  " + nombre + "  " + "Tu promedio es: " +prom + "   Muy Bien!!!!");
        }
        else{
            if(prom>=8 && prom<=9){
            System.out.println(apellido + "  " + nombre + "  " + "Tu promedio es: " +prom + "   Bien!!!!"); 
            }
            if(prom>=6 && prom<=7.9){
            System.out.println(apellido + "  " + nombre + "   " + "Tu promedio es: " +prom + "   Suficiente");     
            }
            if (prom<6){
            System.out.println(apellido + "  " + nombre + "    " + "Tu promedio es: " +prom + "   Lamentablemente, reprobaste..."); 
            }
        }  
    }
}
   


        
