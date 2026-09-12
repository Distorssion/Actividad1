

package com.mycompany.ejercicio17;

/**
 *
 * @author juanp
 */

import java.util.Scanner;
public class Ejercicio17 {

    public static void main(String[] args) {
        double radio, area, circunferencia;
        Scanner in = new Scanner(System.in);

        System.out.println("Cual es el radio del ci8rculo?");
        radio = in.nextDouble();
        System.out.println("El radio es: " + radio);

        area = CirculoCalc.calcular_area(radio);
        System.out.println("El area del circulo es: " + area);

        circunferencia = CirculoCalc.calcular_circunferencia(radio);
        System.out.println("La longitud de la circunferencia es: " + circunferencia);
    }
}

