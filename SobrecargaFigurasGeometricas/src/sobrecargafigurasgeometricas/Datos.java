/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargafigurasgeometricas;
import javax.swing.JOptionPane;
/**
 *
 * @author LCP
 */
public class Datos {
   SobrecargaFigurasGeometricas figuras = new SobrecargaFigurasGeometricas();
    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n1. Círculo\n2. Cuadrado\n3. Triángulo\n4. Rectángulo\n5. Esfera\n6. Cubo"));
    
    public void Menu(){
        switch (opcion){
            case 1:
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
                figuras.Area(radio);
                figuras.Resultado("círculo");
                break;
            case 2:
                double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
                figuras.Area(lado);
                figuras.Resultado("cuadrado");
                break;
            case 3:
                double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo:"));
                figuras.Area(base, altura);
                figuras.Resultado("triángulo");
                break;
            case 4:
                double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo:"));
                double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo:"));
                figuras.Area(baseRectangulo, alturaRectangulo);
                figuras.Resultado("rectángulo");
                break;
            case 5:
                double radioEsfera = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la esfera:"));
                double alturaEsfera = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la esfera:"));
                figuras.Area(radioEsfera, alturaEsfera);
                figuras.Resultado("esfera");
                break;
            case 6:
                double ladoCubo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cubo:"));
                figuras.Area(ladoCubo);
                figuras.Resultado("cubo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break; 
        }
    }
} 

