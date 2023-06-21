/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica2.estructura.datoss.vista;

import ec.edu.ups.practica2.estructura.datoss.controlador.Controlador;
import ec.edu.ups.practica2.estructura.datoss.modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista<T> {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu(Controlador<T> controlador) {
        int opcion = 0;
        do {
            System.out.println("== Menú ==");
            System.out.println("1. Agregar producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Mostrar historial de ventas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarProducto(controlador);
                    break;
                case 2:
                    venderProducto(controlador);
                    break;
                case 3:
                    controlador.mostrarInventario();
                    break;
                case 4:
                    controlador.mostrarHistorialVentas();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }

    public void agregarProducto(Controlador<T> controlador) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad disponible del producto: ");
        T cantidadDisponible = (T) Integer.valueOf(scanner.next());

        controlador.agregarProducto(nombre, codigo, precio, cantidadDisponible);
    }

    public void venderProducto(Controlador<T> controlador) {
        System.out.print("Ingrese el código del producto a vender: ");
        String codigo = scanner.nextLine();
        
        System.out.print("Ingrese la cantidad: ");
        T cantidad = (T) scanner.next();

        controlador.venderProducto(codigo,cantidad);
    }
    
    public void mostrarMensaje(){
        System.out.println("\"Producto agregado al inventario.\"");
    }
    
    public void mostrarMensaje1(){
        System.out.println("\"Producto vendido.\"");
    }
}
