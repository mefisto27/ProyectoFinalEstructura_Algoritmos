/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalestructura_algoritmos;

/**
 *
 * @author Usuario
 */
public class Ticket {

    int numeroTicket;
    String nombreCliente;
    String descripcion;
    Ticket siguiente;
    String estado;

    public Ticket(int NumeroTicket, String NombreCliente, String Descripcion, String Estado) {
        numeroTicket = NumeroTicket;
        nombreCliente = NombreCliente;
        descripcion = Descripcion;
        estado = Estado;
        siguiente = null;
    }
}
