/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalestructura_algoritmos;

/**
 *
 * @author Usuario
 */
public class ColaTickets {
  Ticket frente;
    Ticket finalCola;

    public ColaTickets() {
        frente = null;
        finalCola = null;

    }
    public boolean esVacia(){
       return frente == null; 
    }
   
    public int tamaño(){
        int contador = 0;
        Ticket temporal = frente;
        while (temporal != null) {
            contador++;
            temporal = temporal.siguiente;
        }
        return contador;
    }
    
    //push
    public void AgregarTickets(int NumeroTicket,String NombreCliente,String Descripcion){
        Ticket ticketNuevo = new Ticket(NumeroTicket, NombreCliente, Descripcion);
        if (esVacia()) {
            frente = ticketNuevo;
            finalCola = ticketNuevo;
        }else{
            finalCola.siguiente = ticketNuevo;
            finalCola = ticketNuevo;
                    
        }
    }
        //pop
        public void AtenderTickets (){
            if (esVacia()) {
                System.out.println("La cola esta vacia");
            }
            System.out.println("Se va a eliminar" + frente.numeroTicket + " ¡Nodo Eliminado!");
            frente = frente.siguiente;
            if (frente == null) {
                finalCola = null;
            }
        }  
    }
