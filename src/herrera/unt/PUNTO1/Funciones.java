/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herrera.unt.PUNTO1;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Funciones 
{
    public int invertir(int numero)
    {
        if(numero<10)
        {
            return numero;
        }
        else
        {
            numero = numero % 10;
            invertir(numero/10);
        }
        return numero;
    }
    
    public int cantidadDigitos(int numero)
    {
        if(numero<10)
            return 1;
        else
        {
            return 1+ cantidadDigitos(numero/10);
        }
    }
    
    public int inverso(int numero)
    {
        if(numero<10)
            return numero;
        else
        return( (numero%10) * 10^(cantidadDigitos(numero)-1) + inverso(numero/10) );
    }
    
}
