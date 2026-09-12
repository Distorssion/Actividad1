/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author juanp
 */

import java.util.Scanner;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double h_trabajadas, valor_h, salario_bruto, retencion, salario_neto;
        Scanner in = new Scanner(System.in);

        System.out.println("¿cuntas horas trabajó el empleado en la semana?");
        h_trabajadas = in.nextDouble();

        System.out.println("¿cual es el valor de la hora?");
        valor_h = in.nextDouble();

        salario_bruto = SalarioCalc.calcular_salario_bruto(h_trabajadas, valor_h);
        System.out.println("El salario bruto es:  " + salario_bruto);

        retencion = SalarioCalc.calcular_retencion(salario_bruto);
        System.out.println("La retención en la fuente es:  " + retencion);

        salario_neto = SalarioCalc.calcular_salario_neto(salario_bruto, retencion);
        System.out.println("El salario neto es:   " + salario_neto);
    }
}
    

