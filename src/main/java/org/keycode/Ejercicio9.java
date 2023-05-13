package org.keycode;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int N,M;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca dos numeros");
            N= sc.nextInt();
            M= sc.nextInt();

            if(N>M) System.out.println("El primer numero debe ser menor que el segundo");
            if (N==M) System.out.println("Los numeros deben ser diferentes");
            if(N<0 && M<0) System.out.println(" Introduzca numeros positivos");

        }while(N>=M);

        for(int i=N; i<M; i++) {
            int a= i%N;
            if(a==0)
                System.out.print(i+" ");
        }
        sc.close();
    }
}
