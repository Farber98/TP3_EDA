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
public class Principal 
{
 
     public boolean esPar(int dato)
    {
        if((dato%2)==0)
            return true;
        return false;
    }
    
    public int sumaPar(Lista unaLista)
    {
        if(unaLista.estaVacia())
            return 0;
        else
            if(esPar(unaLista.inicio.getDato()))
            {
                return ( unaLista.inicio.getDato() + sumaPar(unaLista.inicio.getSiguiente()) );     //Caso par
            }
            else
                return sumaPar(unaLista.inicio.getSiguiente());     //Caso impar
        }
    
}
