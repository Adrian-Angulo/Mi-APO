/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Date;

/**
 * 
 * @author daferarte
 * @class AutoVolador
 * @version 1.0
 * Clase de un auto volador que hereda de la clase carro para su implementación
 */
public class AutoVolador extends Carro{
    public boolean esta_Volando=false;

    public AutoVolador(String color, String marca, Date anioCompra, boolean pesado) {
        super(color, marca, anioCompra, pesado);
    }

    public AutoVolador(String color, String marca) {
        super(color, marca);
    }

    public AutoVolador() {
    }

    public boolean isEsta_Volando() {
        return esta_Volando;
    }

    public void setEsta_Volando(boolean esta_Volando) {
        this.esta_Volando = esta_Volando;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getAnioCompra() {
        return anioCompra;
    }

    public void setAnioCompra(Date anioCompra) {
        this.anioCompra = anioCompra;
    }

    public boolean isPesado() {
        return pesado;
    }

    public void setPesado(boolean pesado) {
        this.pesado = pesado;
    }
    
    /**
     * Metodo volar para que nuestro vuele o aterrice
     * @param estado 
     * el estado es un booleano que controla si esta volando o no
     */
    public void Volar(boolean estado){
        this.esta_Volando=estado;
    }
}
