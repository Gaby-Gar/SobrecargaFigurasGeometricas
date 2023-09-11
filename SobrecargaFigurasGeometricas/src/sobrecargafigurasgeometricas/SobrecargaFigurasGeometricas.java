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
public class SobrecargaFigurasGeometricas{

private double area;

    public void Area(double radio) {
        area = Math.PI * Math.pow(radio, 2);
    }

    public void Area(double lado1, double lado2) {
        area = lado1 * lado2;
    }

    public void Area(int base, double altura){
         area = (base * altura) / 2;    
    }

    public void Area(double base, int altura){
        area = base * altura;
    }

    public void Area(int radio){
        area = (4 * Math.PI * Math.pow(radio, 2));
    }

    public void Area(float lado){
        area = 6 * Math.pow(lado, 2);
    }

    public void Resultado() {
        System.out.println("El resultado es: " + String.format("%.5f", area));
    }

    public void Resultado(String figura) {
        JOptionPane.showMessageDialog(null, "El área de la " + figura + " es: " + String.format("%.5f", area));
    }
     
}
