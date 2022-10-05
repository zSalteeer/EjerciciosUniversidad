/**
 *  Programa que muestra el uso de las clases
 *  Punto2D y OperacionesConPuntos2D
 *
 *  Actividad a realizar:
 *  1.- Pedir los datos en entorno gráfico
 *  2.- Probar los métodos de OperacionesConPuntos2D
 *
 *   @version 22/Sep/22
 */

package Metricas1;
import javax.swing.JOptionPane;
public class UsaOperacionesConPuntos2D {

    public static void main(String... something){
        double x,y,z,w;
        
        x= Double.parseDouble(JOptionPane.showInputDialog("Digita el valor de x1:"));
        y= Double.parseDouble(JOptionPane.showInputDialog("Digita el valor de y1:"));
        z= Double.parseDouble(JOptionPane.showInputDialog("Digita el valor de x2:"));
        w= Double.parseDouble(JOptionPane.showInputDialog("Digita el valor de y2:"));
        
        Punto2D a = new Punto2D(x,y);
        Punto2D b = new Punto2D(z,w);
        Punto2D d = new Punto2D();
        
        double norma = OperacionesConPuntos2D.norma(a,d);
        double dAB= OperacionesConPuntos2D.metricaEuclidiana(a,b);
        double resultado= OperacionesConPuntos2D.metricaTaxista (a,b);
        double area= OperacionesConPuntos2D.area(a,b);
        double punto= OperacionesConPuntos2D.dotProduct(a,b);
        
        JOptionPane.showMessageDialog(null,"La norma de " + a + " es : " + norma );
        JOptionPane.showMessageDialog(null,"La distancia del punto" +a + "al punto" +b + "es" +dAB );
        JOptionPane.showMessageDialog(null,"La metrica de Manhattan da como resultado:" +resultado );
        JOptionPane.showMessageDialog(null,"El area que yo interprete como un rectangulo, da como resultado:" +area );
        JOptionPane.showMessageDialog(null,"El producto escalar, da como resultado:" +punto );
    }
}
