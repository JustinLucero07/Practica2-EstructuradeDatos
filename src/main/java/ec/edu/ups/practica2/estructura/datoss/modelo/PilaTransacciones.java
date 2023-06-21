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
public class PilaTransacciones<T> {
    private LinkedList<Transaccion<T>> transacciones;

    public PilaTransacciones() {
        transacciones = new LinkedList<>();
    }

    public void agregarTransaccion(Transaccion<T> transaccion) {
        transacciones.push(transaccion);
    }

    public void mostrarTransacciones() {
        if (transacciones.isEmpty()) {
            System.out.println("No hay transacciones registradas.");
        } else {
            System.out.println("Historial de transacciones:");
            for (Transaccion<T> transaccion : transacciones) {
                System.out.println("Producto: " + transaccion.getProducto().getNombre());
                System.out.println("Cantidad: " + transaccion.getCantidad());
                System.out.println("---------------------------");
            }
        }
    }
}

