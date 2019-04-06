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
public class Principal {
    
     public static int invertir(int numero)
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
    
    public static int cantidadDigitos(int numero)
    {
        if(numero<10)
            return 1;
        else
        {
            return 1+ cantidadDigitos(numero/10);
        }
    }
    
    public static int inverso(int numero)
    {
        if(numero<10)
            return numero;
        else
        return( (numero%10) * 10^(cantidadDigitos(numero)-1) + inverso(numero/10) );
    }
    public static void main(String[] args) 
    {
        int opcion = 0, numero1,numero2, numeroInvertido1,numeroInvertido2;
        
        do{
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Escribir inverso.\n"
                        + "2. El otro.\n"
                        + "3. Salir.",
                         "Menu de opciones", 3));
               switch(opcion)
               {
                   case 1: 
                       numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar numero a invertir.", "Escribir inverso."));
                       numeroInvertido1 = invertir(numero1);
                       JOptionPane.showMessageDialog(null, "El numero es invertido es: " + numeroInvertido1, "Numero invertido", JOptionPane.INFORMATION_MESSAGE);
                      
                   case 2:
                       numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar numero a realizar x accion", "Escribir x accion."));
                       numeroInvertido2 = inverso(numero2);
                       JOptionPane.showMessageDialog(null, "El numero es: " + numeroInvertido2, "Numero invertido", JOptionPane.INFORMATION_MESSAGE);
                   case 3:
                       break;
                   default:
                       JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                       
               }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }
        }while(opcion != 3);
               
    }
}
