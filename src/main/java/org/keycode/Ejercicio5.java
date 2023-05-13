package org.keycode;

import javax.swing.*;

public class Ejercicio5 {
    static int areaCuadrado (int n1){
        return n1*n1;
    }
    static double areaCirculo(int r){
        double PI=3.1416;
        return  PI * Math.pow(r,2);
    }
    static int areaTriangulo(int a, int b){
        return (a*b)/2;
    }
    static int areaRectangulo(int b , int h){
        return b*h ;
    }
    public static void main(String[] args) {
        int select = -1;
        while (select != 0){
           try{
               String elegir = JOptionPane.showInputDialog(null,
                       "Elige una opción\n" +
                               "1. Calcular area cuadrado\n" +
                               "2. Calcular area rectángulo\n" +
                               "3. Calcular area triángulo\n" +
                               "4. Calcular area círculo\n" +
                               "0. Salir\n"
               );
               select = Integer.parseInt(elegir);
               switch (select) {
                   case 1:
                       int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado"));
                       JOptionPane.showMessageDialog(null, "El área del Cuadrado es: " + areaCuadrado(lado));
                       break;
                   case 2:
                       int baseT = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base"));
                       int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura"));
                       JOptionPane.showMessageDialog(null, "El área del triángulo es: " + areaTriangulo(baseT, alturaT));
                       break;
                   case 3:
                       int baseR = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base"));
                       int alturaR = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura"));
                       JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + areaRectangulo(baseR, alturaR));
                       break;
                   case 4:
                       int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio"));
                       JOptionPane.showMessageDialog(null, "El área del circulo es: " +areaCirculo(radio));
                       break;
               }
           } catch (Exception e){
               JOptionPane.showMessageDialog(null, "Seleccionar 'Salir' para cerrar.");
           }
        }

    }
}
