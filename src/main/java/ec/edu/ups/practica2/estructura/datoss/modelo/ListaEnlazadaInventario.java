/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2.estructura.datoss.modelo;

import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class ListaEnlazadaInventario<T> {
    private NodoProducto<T> primerProducto;
    private PilaTransacciones<T> pilaTransacciones;

    public ListaEnlazadaInventario() {
        primerProducto = null;
        pilaTransacciones = new PilaTransacciones<>();
    }

    public void agregarProducto(Producto<T> producto) {
        NodoProducto<T> nuevoNodo = new NodoProducto<>(producto);
        if (primerProducto == null) {
            primerProducto = nuevoNodo;
        } else {
            NodoProducto<T> nodoActual = primerProducto;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
        }
    }

    public void venderProducto(String codigo, T cantidad) {
        NodoProducto<T> nodoAnterior = null;
        NodoProducto<T> nodoActual = primerProducto;

        while (nodoActual != null) {
            if (nodoActual.getProducto().getCodigo().equals(codigo)) {
                if (nodoAnterior != null) {
                    nodoAnterior.setSiguiente(nodoActual.getSiguiente());
                } else {
                    primerProducto = nodoActual.getSiguiente();
                }
                pilaTransacciones.agregarTransaccion(new Transaccion<>(nodoActual.getProducto(),cantidad ));
                return;
            }
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSiguiente();
        }
    }

    public LinkedList<Producto<T>> getListaProductos() {
        LinkedList<Producto<T>> listaProductos = new LinkedList<>();
        NodoProducto<T> nodoActual = primerProducto;

        while (nodoActual != null) {
            listaProductos.add(nodoActual.getProducto());
            nodoActual = nodoActual.getSiguiente();
        }

        return listaProductos;
    }

    public void mostrarInventario() {
        LinkedList<Producto<T>> listaProductos = getListaProductos();
        if (listaProductos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario actual:");
            for (Producto<T> producto : listaProductos) {
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Código: " + producto.getCodigo());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Cantidad disponible: " + producto.getCantidadDisponible());
                System.out.println("---------------------------");
            }
        }
    }

    public void mostrarHistorialVentas() {
        pilaTransacciones.mostrarTransacciones();
    }
}