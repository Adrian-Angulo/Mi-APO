/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author sistemas
 */
public class Operaciones {
    
    public String Sumar(int numero1, int numero2){
        int resultado = numero1+numero2;
        return resultado+"";
        //return String.valueOf(resultado);
    }
    
    public String Restar(int numero1, int numero2){
        int resultado = numero1-numero2;
        return resultado+"";
        //return String.valueOf(resultado);
    }
    
    public String Multiplicar(int numero1, int numero2){
        int resultado = numero1*numero2;
        return resultado+"";
        //return String.valueOf(resultado);
    }
    
    public String Dividir(int numero1, int numero2){
        float resultado = numero1/numero2;
        return resultado+"";
        //return String.valueOf(resultado);
    }
}
