/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2.estructura.datoss.modelo;

/**
 *
 * @author Usuario
 */
public class Transaccion<T> {
    private Producto producto;
    private T cantidad;

    public Transaccion(Producto<T> producto, T cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public T getCantidad() {
        return cantidad;
    }

    public void setCantidad(T cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "producto=" + producto + ", cantidad=" + cantidad + '}';
    }

    
}
