package Practica05;
public class practica05 { //una clase
    public static double volumenCubo (double lado){
       return lado*lado*lado; 
    }
    public static double volumenCilindro (double radio, double altura){
        return altura*radio*radio*Math.PI;
    }
    
    public static void resultadoCubo(){
        double lado=6;
        System.out.println("El volumen del cubo es de: "+volumenCubo(lado));
    }
    
    public static void resultadoCilindro(){
        double radio=3, altura=6;
        System.out.println("El volumen del cilindro es de:  "+volumenCilindro(radio,altura));
    }

    public static void imprimeDivision(){
        System.out.println("------------------------------------------");
    }
    
    public static void main(String[] args) {
        practica05.resultadoCubo();
        imprimeDivision();
        practica05.resultadoCilindro();

    }
}
    

