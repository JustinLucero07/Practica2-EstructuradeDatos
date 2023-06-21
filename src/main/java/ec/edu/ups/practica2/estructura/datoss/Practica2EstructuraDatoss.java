/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica2.estructura.datoss;

import ec.edu.ups.practica2.estructura.datoss.controlador.Controlador;
import ec.edu.ups.practica2.estructura.datoss.modelo.ListaEnlazadaInventario;
import ec.edu.ups.practica2.estructura.datoss.modelo.PilaTransacciones;
import ec.edu.ups.practica2.estructura.datoss.vista.Vista;

/**
 *
 * @author Usuario
 */
public class Practica2EstructuraDatoss {

    public static void main(String[] args) {
        ListaEnlazadaInventario<Integer> inventario = new ListaEnlazadaInventario<>();
        Vista<Integer> vista = new Vista<>();
        Controlador<Integer> controlador = new Controlador<>(inventario, vista);

        vista.mostrarMenu(controlador);

    }
}
