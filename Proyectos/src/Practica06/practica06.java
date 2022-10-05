package Practica06;
import java.util.Scanner;
public class practica06 {
    public static void saldo (){
        int dinero= 1500;
        System.out.println("Tienes un saldo de: "+dinero);
    }
        public static void descripcion (){
        System.out.println("Tú tarjeta es Crédito y Banamex");
    }
    public static void main(String[] args) {
        int numero, pin,operacion=0;
        String nombre;
        int apertura, deposito, deposito1, retiro, retiro1;
        Scanner data = new Scanner (System.in);
        System.out.println("Dígite su nombre ");
        nombre= data.nextLine();
        System.out.println("Digite su número de cuenta porfavor");
        numero = data.nextInt();
        System.out.println("Porfavor, dígite el pin");
        pin = data.nextInt();  
        if (pin==1234){
            System.out.println("Bievenido!!!" +nombre);
            System.out.println("¿Qué deseas hacer?");
            System.out.println("Digita 0 si deseas salir");
            System.out.println("Dígita 1 si deseas saber más de tu cuenta");
            System.out.println("Dígita 2 si deseas aperturar cuenta");
            System.out.println("Dígita 3 si deseas dépositar dinero en tu cuenta");
            System.out.println("Digita 4 si deseas retirar dinero de tu cuenta");
            System.out.println("Dígita 5 si deseas consultar tu saldo");
            operacion = data.nextInt();    
        }else{
            System.err.println("PIN incorrecto");
        } 
        switch(operacion){
            case 0: System.out.println("Hasta luego!!!!!");break;
            case 1: practica06.descripcion();break;
            case 2: System.out.println("¿Deseas realmente aperturar tu cuenta? Dígita 1 para SI o 0 para NO");
                    apertura = data.nextInt();
                    if(apertura==1){
                        System.out.println("Perfecto, has abierto tu cuenta!!!!");
                    }else{
                        System.out.println("No has aperturado tu cuenta");
                    }break;
            case 3: System.out.println("¿Cuánto dinero deseas depositar?");
                    deposito = data.nextInt();
                    deposito1= deposito+1500;
                    System.out.println("Perfecto, operación exitosa, tú nuevo saldo es de: "+deposito1);break;
            case 4: System.out.println("¿Cuánto dinero deseas retirar?");
                    retiro = data.nextInt();
                    retiro1= 1500-retiro;
                    System.out.println("Perfecto, operación exitosa, tú nuevo saldo es de: "+retiro1);break;
            case 5: practica06.saldo();break;
            default: System.err.println("No has digitado un número válido");  
        }   
    }
}