/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author juanp
 */
public class SalarioCalc {
    public static double calcular_salario_bruto(double horas_trabajadas, double valor_hora){
        return horas_trabajadas * valor_hora;
    }
    public static double calcular_retencion(double salario_bruto){
        return salario_bruto * 0.125;
    }
    public static double calcular_salario_neto(double salario_bruto, double retencion){
        return salario_bruto - retencion;
    }
}
