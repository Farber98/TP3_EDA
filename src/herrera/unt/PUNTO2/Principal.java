/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herrera.unt.PUNTO2;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Principal {
    
    public static int sumasSucesivas(int numero, int multiplicador)
    {
        int acumulador = 0;
        while(multiplicador>0)
        {
            acumulador = acumulador + numero;
            multiplicador--;
        }
        return acumulador;
    }
    
    public static void main(String[] args) 
    {
      int  opcion=0, numero, multiplicador, resultado;
        do{
            try
            {
               opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Calcular sumas sucesivas\n"
               + "2. Salir.","Menu de opciones",3));
            
               switch(opcion)
               {
                   case 1: 
                       numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero:","Numero",3));
                       multiplicador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese multiplicador:","multiplicador",3));
                       resultado = sumasSucesivas(numero, multiplicador);
                       JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Sumas sucesivas", JOptionPane.INFORMATION_MESSAGE);
                       
                   case 2:
                       break;
               }
    
            }
            catch(Exception e)
            {
                JOptionPane.showInputDialog("Error" + e.getMessage());
            }
        }while(opcion!=2);
    }
}
