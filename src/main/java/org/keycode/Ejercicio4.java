package org.keycode;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        String palabra;
        int contadorVocales = 0;
        palabra = JOptionPane.showInputDialog("Coloca la palabra que deseas contar vocales");

        for (int v = 0; v < palabra.length(); v++){
            if ((palabra.charAt(v) == 'a')
                    || (palabra.charAt(v) == 'e')
                    || (palabra.charAt(v) == 'i')
                    || (palabra.charAt(v) == 'o')
                    || (palabra.charAt(v) == 'u')
            ) {
                contadorVocales++;
            }
        }

        JOptionPane.showMessageDialog(null, "La palabra "+ palabra + " contiene " + contadorVocales + " vocales");
    }
}
