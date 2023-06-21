/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2.estructura.datoss.modelo;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Producto<T> {
    private String nombre;
    private String codigo;
    private double precio;
    private T cantidadDisponible;

    public Producto(String codigo) {
        this.codigo = codigo;
    }

    
    
    public Producto(String nombre, String codigo, double precio, T cantidadDisponible) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public T getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(T cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", cantidadDisponible=" + cantidadDisponible + '}';
    }
    
    
}
