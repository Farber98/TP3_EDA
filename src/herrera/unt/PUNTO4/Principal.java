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
public class Principal {
    
    Lista unaLista = new Lista();
    Lista listaVacia = new Lista();
    
    public Lista escribirPalabra (char[] palabra)
    {
        if(palabra.length == 0)
            return listaVacia;
        else
        {
            int cantidad = palabra.length;
                char aux = palabra[cantidad];
                unaLista.agregarAlFinal(aux);
                escribirPalabra(palabra);       //Como hago para sacar la ultima posicion y recursar de vuelta.
        }
    }
    
}
