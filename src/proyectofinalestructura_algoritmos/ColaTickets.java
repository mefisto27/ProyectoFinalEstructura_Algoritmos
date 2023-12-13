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
            finalCola.estado = "PENDIENTE";
        } else {
            finalCola.siguiente = ticketNuevo;
            finalCola.siguiente.estado = "PENDIENTE";
            finalCola = ticketNuevo;
            finalCola.estado = "NUEVO";

        }

        System.out.println("\nTicket agregado exitosamente.");
    }

    public void AtenderTickets() {
        if (esVacia()) {
            System.out.println("No hay tickets para atender.");
        } else {
            System.out.println("-----------------------------------------------");
            System.out.println("Atendiendo ticket numero: " + frente.numeroTicket);
            System.out.println("-----------------------------------------------");
            System.out.println("Nombre: " + frente.nombreCliente);
            System.out.println("Descripcion de la solicitud: \n" + frente.descripcion);
            System.out.println("-----------------------------------------------");
            frente.estado = "COMPLETADO";
            System.out.println("\n - Estado: " + frente.estado);
            frente = frente.siguiente;
            if (frente != null) {
                frente.estado = "PENDIENTE";
            }
        }
    }

    public void VerTickets() {
        System.out.println("Tickets en la cola:");
        Ticket temporal = frente;
        while (temporal != null) {
            System.out.println("Ticket numero: " + temporal.numeroTicket
                    + " - Estado: " + temporal.estado
                    + " - Cliente: " + temporal.nombreCliente
                    + " - Descripcion: " + temporal.descripcion);
            temporal = temporal.siguiente;
        }
        System.out.println("\n");
    }
}
