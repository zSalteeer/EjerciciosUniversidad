/**
 *  Programa que permitirá realizar
 *  operaciones con puntos en la forma P = (x,y)
 *
 *  NOTA: DEBEN IMPLEMENTAR LOS MÉTODOS
 *
 *  Curso: Matemáticas para ciencias Aplicadas
 *
 *  Temas:  Función distancia, producto punto y
 *          su aplicación para obtener el área
 *
 *  @author Roberto Méndez Méndez
 *  @version  22-Septiembre-22
 */

//La métrica es la distancia entre 2 puntos 
//La norma es la distancia de un punto, al origen

package Metricas1;

public class OperacionesConPuntos2D {

//Como sigue siendo distancia de 2 puntos, declaro distancia al punto origen (por así decirlo que es d)
    public static double norma(Punto2D a, Punto2D d) {
        double norma= Math.sqrt(Math.pow(a.getX() -d.getX(),2) + Math.pow(a.getY() -d.getY(),2) );
        return norma;
    }

//distancia entre 2 puntos, mi hipotenusa
    public static double metricaEuclidiana(Punto2D a, Punto2D b) {
        double distanciaAB=
                Math.sqrt(Math.pow(a.getX() -b.getX(),2) + Math.pow(a.getY() -b.getY(),2));
        return distanciaAB;
    }

//metrica Manhattan o nuestros catetos
    public static double metricaTaxista(Punto2D a, Punto2D b) {
        double resultado= Math.abs(a.getX()-b.getX()) + Math.abs(a.getY() -b.getY());
        return resultado;
    }

//producto escalar (o punto)
    public static double dotProduct(Punto2D a, Punto2D b) {
        double punto= ((a.getX()*b.getX())+ (a.getY()*b.getY()));
        return punto;
    }

//el área es la multiplicacion entre catetos
    public static double area(Punto2D a, Punto2D b) {
        double rectangulo= Math.abs(a.getX()-b.getX()) * Math.abs(a.getY() -b.getY())  ;
        return rectangulo;
    }
}
