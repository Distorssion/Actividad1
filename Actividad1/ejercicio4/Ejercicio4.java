/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author juanp
 */


import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double edad_juan, edad_alberto, edad_ana, edad_mama;
        Scanner in= new Scanner(System.in);
        System.out.println("¿cual es la edad de Juan?");
        edad_juan =  in.nextDouble();
        System.out.println("La edad de Juan es: "+ edad_juan);
       
        edad_alberto = Edadcalc.calcular_edad_alberto(edad_juan);
        System.out.println("La edad de Alberto es: " + edad_alberto);
        
        edad_ana = Edadcalc.calcular_edad_ana(edad_juan);
        System.out.println("La edad de Ana es: " + edad_ana);
        
        edad_mama = Edadcalc.calcular_edad_mama(edad_alberto, edad_juan, edad_ana);
        System.out.println("La edad de la mamá es: " + edad_mama);
    }
    
}
