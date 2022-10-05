package misuma;
import java.util.Scanner;
public class circulo {
    public static void main(String[] args) {
      Scanner datos= new Scanner(System.in);
      double radio;
      double perimetro, area;
      System.out.println("Vas a dígitar solamente el radio para obtener el área y perímetro de un círculo:");
      radio= datos.nextDouble();
      perimetro= Math.PI*radio*2;
      area= Math.PI*radio*radio;
      
        System.out.println("El resultado del perimetro es: " +perimetro);
        System.out.println("El resultado del area es: " +area);
    }
 
}
