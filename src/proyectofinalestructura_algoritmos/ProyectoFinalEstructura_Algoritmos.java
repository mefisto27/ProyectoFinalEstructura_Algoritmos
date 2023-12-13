/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalestructura_algoritmos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoFinalEstructura_Algoritmos {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ColaTickets colaTickets = new ColaTickets(); // Crear una instancia de ColaTickets
    int opcion;
    do {
        colaTickets.mostrarMenu();
        opcion = scanner.nextInt();
        scanner.nextLine(); // Consume el newline

        switch (opcion) {
            case 1:
                colaTickets.agregarTicket(); // Pasar colaTickets como parámetro
                break;
            case 2:
                colaTickets.AtenderTickets();
                break;
            case 3:
                colaTickets.VerTickets();
                break;
            case 4:
                System.out.println("Saliendo del sistema de tickets.");
                break;
            default:
                System.out.println("Opción no reconocida, por favor intente de nuevo.");
                break;
        }
    } while (opcion != 4);
}


}

