/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herrera.unt.PUNTO4;

/**
 *
 * @author juan
 */
public class Nodo 
{
    private char dato;
    private Nodo siguiente;

    public Nodo(char dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

   public void setDato(char dato)
   {      
           this.dato = dato;
   }
    
    public char getDato() {
        return dato;
    }

   

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
