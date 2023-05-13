package org.keycode;

import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> Edades = new ArrayList<>();
        int edad = 1;
        while (edad != 0) {
            String edades = JOptionPane.showInputDialog("Ingrese una edad");
            int edad_n = Integer.parseInt(edades);
            if (edad_n == 0) {
                edad = 0;
            } else {
                Edades.add(edad_n);
            }
        }
        int sumaEdad = 0;
        for (Integer Ed: Edades){
            System.out.println(sumaEdad += Ed);
        }
        double promedioEdad = sumaEdad/Edades.size();
        int total = sumaEdad;
        JOptionPane.showMessageDialog(null, "Total de suma de las edades: "+total);
        JOptionPane.showMessageDialog(null, "Promedio de edades: "+promedioEdad);
        System.out.println("Operación promedio: " + sumaEdad + "/" + Edades.size() + "=" + promedioEdad);
    }
}
