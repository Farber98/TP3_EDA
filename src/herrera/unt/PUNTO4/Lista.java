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
public class Lista 
{
    protected Nodo inicio;
    int tamaño;

   public void agregarAlInicio(char dato)
   {
       inicio = new Nodo(dato, inicio);
       tamaño++;
   }
   
    
   public void agregarAlFinal(char dato)
   {
       if(estaVacia())
       {
           agregarAlInicio(dato);
       }
       else
       { 
            Nodo auxiliar = new Nodo(dato, inicio);
            while(auxiliar.getSiguiente() != null)
            {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(new Nodo((dato), null));
            tamaño++;
       }
       
   }
   
      
   
   
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
