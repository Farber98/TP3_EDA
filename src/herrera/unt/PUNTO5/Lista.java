/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herrera.unt.PUNTO5;

/**
 *
 * @author juan
 */
public class Lista 
{
    protected Nodo inicio;
    int tamaño;

  
   
   public void mostrarLista()
   {
        Nodo auxiliar = this.inicio;
        while(auxiliar != null)
        {
            System.out.print("[" + auxiliar.getDato()+ "]" + "---->");
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("");
   }
   
   public boolean estaVacia()
   {
       if (inicio == null)
           return true;
       return false;
   }
    
}
