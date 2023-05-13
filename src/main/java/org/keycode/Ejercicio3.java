package org.keycode;

import java.util.concurrent.TimeUnit;

public class Ejercicio3 {
    public static void main(String[] args) throws InterruptedException {
        int minuto = 0;
        int segundo;
        String borrarSeg = "\b\b\b\b\b\b\b\b";
        for (segundo=0; segundo<=59; segundo++) {
            // escribe hora:minutos:segundos (actualizandose a medida que va pasando cada segundo)
            System.out.printf("%02d:%02d",minuto,segundo);
            TimeUnit.SECONDS.sleep(1);
            System.out.print(borrarSeg);
        }
    }
}
