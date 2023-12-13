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
    ColaTickets colaTickets = new ColaTickets();
    int opcion;
    boolean salir = false;
    do {
        System.out.println("\n----------------------------------------------");
        System.out.println("Sistema de Gestion de Tickets");
        System.out.println("1. Agregar nuevo ticket");
        System.out.println("2. Atender ticket");
        System.out.println("3. Ver tickets en cola");
        System.out.println("4. Salir");
         System.out.println("----------------------------------------------");
        System.out.print("Seleccione una opcion: ");
        opcion = scanner.nextInt();
         System.out.println("----------------------------------------------");
        System.out.println("\n\n");
        scanner.nextLine();

        switch (opcion) {
            case 1:
                colaTickets.agregarTicket(); 
                break;
            case 2:
                colaTickets.AtenderTickets();
                break;
            case 3:
                colaTickets.VerTickets();
                break;
            case 4:
                System.out.println("Saliendo del sistema de tickets.");
                salir = true;
                break;
            default:
                System.out.println("Opcion no reconocida, por favor intente de nuevo.");
                break;
        }
    } while (salir != true);
}


}

