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
    public static void main(String[] args) 
    {
        int opcion = 0, numero, numeroInvertido;
        
        do{
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Escribir inverso.\n"
                        + "2. El otro."
                        + "3. Salir.",
                         "Menu de opciones", 3));
               switch(opcion)
               {
                   case 1: 
                       numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar numero a invertir.", "Escribir inverso."));
                       numeroInvertido = invertir(numero);
                       JOptionPane.showMessageDialog(null, "El numero es invertido es: " + numeroInvertido, "Numero invertido", JOptionPane.INFORMATION_MESSAGE);
                      
                   case 2:
                       numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar numero a realizar x accion", "Escribir x accion."));
                       numeroInvertido = inverso(numero);
                       JOptionPane.showMessageDialog(null, "El numero es: " + numeroInvertido, "Numero invertido", JOptionPane.INFORMATION_MESSAGE);
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
