/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalestructura_algoritmos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ColaTickets {

    private int contadorTickets = 1;
    Ticket frente;
    Ticket finalCola;

    public ColaTickets() {
        frente = null;
        finalCola = null;

    }

    public boolean esVacia() {
        return frente == null;
    }

    public int tamaño() {
        int contador = 0;
        Ticket temporal = frente;
        while (temporal != null) {
            contador++;
            temporal = temporal.siguiente;
        }
        return contador;
    }

    //push
    public void agregarTicket() {
        Scanner teclado = new Scanner(System.in);
        Ticket ticketNuevo = new Ticket(contadorTickets, "", "", "NUEVO");
        contadorTickets++;

        System.out.println("Ingrese el nombre del cliente");
        ticketNuevo.nombreCliente = teclado.nextLine();
        System.out.println("Ingrese la descripcion del ticket");
        ticketNuevo.descripcion = teclado.nextLine();

        if (esVacia()) {
            frente = ticketNuevo;
            finalCola = ticketNuevo;
        } else {
            finalCola.siguiente = ticketNuevo;
            finalCola = ticketNuevo;
        }

        System.out.println("Ticket agregado exitosamente.");
    }
    //pop

public void AtenderTickets() {
    if (esVacia()) {
        System.out.println("No hay tickets para atender.");
    } else {
        // Atender el primer ticket en la cola
        System.out.println("Atendiendo ticket número: " + frente.numeroTicket);
        frente.estado = "COMPLETADO";
        frente = frente.siguiente;
    }
}

    public void mostrarMenu() {
        System.out.println("\nSistema de Gestión de Tickets");
        System.out.println("1. Agregar nuevo ticket");
        System.out.println("2. Atender ticket");
        System.out.println("3. Ver tickets en cola");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void VerTickets() {
        System.out.println("Tickets en la cola:");
        Ticket temporal = frente;
        while (temporal != null) {
            System.out.println("Ticket número: " + temporal.numeroTicket
                    + " - Estado: " + temporal.estado
                    + " - Cliente: " + temporal.nombreCliente
                    + " - Descripción: " + temporal.descripcion);
            temporal = temporal.siguiente;
        }
    }
}
