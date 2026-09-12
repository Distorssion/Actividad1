
package com.mycompany.ejercicio5;

/**
 *
 * @author juanp
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        double suma, x, y;

        suma = 0;
        System.out.println("Valor inicial suma: " + suma);
        x = 20;
        System.out.println("x:"+x);

        suma = SegCalc.sumar(suma, x);
        System.out.println("Primera operacion de suma (adicion): " + suma);

        y = 40;
        System.out.println("y:"+y);

        x = SegCalc.elevar_al_cuadrado(y, x);
        System.out.println("X + Y**2 = X:" + x);

        suma = SegCalc.sumar(suma, SegCalc.dividir(x, y));
        System.out.println("El valor de la suma es: " + suma);
    }
}

