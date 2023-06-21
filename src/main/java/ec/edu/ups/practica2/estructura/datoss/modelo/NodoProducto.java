/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2.estructura.datoss.modelo;

/**
 *
 * @author Usuario
 */
public class NodoProducto<T> {
    private Producto<T> producto;
    private NodoProducto<T> siguiente;

    public NodoProducto(Producto<T> producto) {
        this.producto = producto;
        this.siguiente = null;
    }

    public Producto<T> getProducto() {
        return producto;
    }

    public NodoProducto<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProducto<T> siguiente) {
        this.siguiente = siguiente;
    }
}






