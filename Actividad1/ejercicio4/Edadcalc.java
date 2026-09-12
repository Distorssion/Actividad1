/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author juanp
 */
public class Edadcalc {
    public static double calcular_edad_alberto(double edad_juan){
        return  edad_juan/3 * 2;
    }
    public static double calcular_edad_ana(double edad_juan){
        return edad_juan/3 * 4;
    }
    public static double calcular_edad_mama(double edad_juan, double edad_alberto, double edad_ana){
        return edad_ana+ edad_alberto + edad_juan;
    }
    
}
