package org.keycode;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número para evaluar si es positivo o negativo"));
        if (numero == 0) {
            System.out.println("El número es neutro");
            JOptionPane.showMessageDialog(null, "El número es neutro");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
            JOptionPane.showMessageDialog(null, "El número es negativo");
        } else {
            System.out.println("El número es positivo");
            JOptionPane.showMessageDialog(null, "El número es positivo");
        }
    }
}