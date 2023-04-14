/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Date;

/**
 *
 * @author sistemas
 */
public class Carro {
    private String color;
    public String marca;
    public Date anioCompra;
    public boolean pesado;

    public Carro(String color, String marca, Date anioCompra, boolean pesado) {
        this.color = color;
        this.marca = marca;
        this.anioCompra = anioCompra;
        this.pesado = pesado;
    }

    public Carro(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    Carro() {
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    
    
    
    
}
