
package com.mycompany.ejerciccio14;

/**
 *
 * @author juanp
 */

import java.util.Scanner;
public class Ejerciccio14 {

    public static void main(String[] args) {
        double num, cuadrado, cubo;
        Scanner in = new Scanner(System.in);

        System.out.println("Cual es el numero?");
        num = in.nextDouble();
        System.out.println("El numero ingresado es: " + num);

        cuadrado = NumeroCalc.calcular_cuadrado(num);
        System.out.println("El cuadrado es: " + cuadrado);

        cubo = NumeroCalc.calcular_cubo(num);
        System.out.println("El cubo es: " + cubo);
    }
}
