package org.keycode;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Figura 1
        System.out.println("Figura 1");
        int columnas;
        int total_filas = 4;
        int filas = total_filas;
        System.out.println('*');
        while (filas > 0) {
            filas--;
            columnas = total_filas - filas;
            while (columnas > 0) {
                System.out.print("**");
                columnas--;
            }
            System.out.println('*');
        }
        int total_filas2 = 4;
        int filas2 = 0;
        int columnas2;
        while (filas2 < total_filas2) {
            filas2++;
            columnas2 = total_filas2 - filas2;
            while (columnas2 > 0) {
                System.out.print("**");
                columnas2--;
            }
            System.out.println('*');
        }
        //Figura 2
        System.out.println("Figura 2");
        int total_filas3 = 5;
        int filas3 = 0;
        int columnas3;
        while (filas3 < total_filas3) {
            filas3++;
            columnas3 = total_filas3 - filas3;
            while (columnas3 > 0) {
                System.out.print("**");
                columnas3--;
            }
            System.out.println('*');
        }
        int columnas4;
        int total_filas4 = 4;
        int filas4 = total_filas4;
        while (filas4 > 0) {
            filas4--;
            columnas4 = total_filas4 - filas4;
            while (columnas4 > 0) {
                System.out.print("**");
                columnas4--;
            }
            System.out.println('*');
        }

        System.out.println("Figura 3");
        int numberFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para la figura"));
        int total_filas5 = numberFilas;
        int filas5 = 0;
        int columnas5;
        while (filas5 < total_filas5) {
            filas5++;
            columnas5 = total_filas5 - filas5;
            while (columnas5 > 0) {
                System.out.print("*");
                columnas5--;
            }
            System.out.println('*');
        }
    }
}
