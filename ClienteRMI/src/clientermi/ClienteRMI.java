/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientermi;

/**
 *
 * @author sistemas
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Interface.RMIDAO;

public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            int suma, resta, mult;
            double div;
            suma = interfaz.sumar(10, 14);
            resta = interfaz.restar(10, 9);
            mult = interfaz.multiplicar(4,3);
            div = interfaz.dividir(10, 2);
            System.out.println("la suma es: "+suma);
            System.out.println("La resta es: "+ resta);
            System.out.println("La multiplicacion es: "+ mult);
            System.out.println("La divicion es: "+div);
            
            
            
        }catch(Exception e){
            System.out.println(""+e);
        }
    }
    
}
