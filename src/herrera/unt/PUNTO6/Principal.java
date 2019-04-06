/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herrera.unt.PUNTO6;

/**
 *
 * @author juan
 */
public class Principal 
{
    public boolean encontrar(int[] arreglo, int n)
    {
        int medio = (n%2);
        if(arreglo[medio] == medio)         //Caso base
            return true;
        else
        {
            if(arreglo[medio]> medio)
            {
                encontrar(arreglo, medio+1);        // Esta a la derecha
            }
            else
            {
                encontrar(arreglo, medio-1);    //Esta a la izquierda
            }
            return true;
        }
    }
    
}
