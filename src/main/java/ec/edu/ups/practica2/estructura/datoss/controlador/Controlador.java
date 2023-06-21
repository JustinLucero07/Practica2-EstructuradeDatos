/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2.estructura.datoss.controlador;

import ec.edu.ups.practica2.estructura.datoss.modelo.ListaEnlazadaInventario;
import ec.edu.ups.practica2.estructura.datoss.modelo.PilaTransacciones;
import ec.edu.ups.practica2.estructura.datoss.modelo.Producto;
import ec.edu.ups.practica2.estructura.datoss.modelo.Transaccion;
import ec.edu.ups.practica2.estructura.datoss.vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador<T> {
    private ListaEnlazadaInventario<T> inventario;
    private Vista vista;

    public Controlador(ListaEnlazadaInventario<T> inventario, Vista vista) {
        this.inventario = inventario;
        this.vista = vista;
    }

    public void agregarProducto(String nombre, String codigo, double precio, T cantidadDisponible) {
        Producto<T> producto = new Producto<>(nombre, codigo, precio, cantidadDisponible);
        inventario.agregarProducto(producto);
        vista.mostrarMensaje();
    }

    public void venderProducto(String codigo, T cantidad) {
        inventario.venderProducto(codigo,cantidad);
        vista.mostrarMensaje1();
    }

    public void mostrarInventario() {
        inventario.mostrarInventario();
    }

    public void mostrarHistorialVentas() {
        inventario.mostrarHistorialVentas();
    }
}
