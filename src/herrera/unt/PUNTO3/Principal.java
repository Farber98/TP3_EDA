/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herrera.unt.PUNTO3;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Principal {
    
    public static int maximo (int[] V, int n)
    {
        if(n==1)
        {
            return V[0];
        }
        else
        {
            if(V[n]> maximo(V, n))
                return V[n];
            else
            {
                return maximo(V, n-1);
            }
        }
    }
 
    public static void main(String[] args) {
        int opcion = 0, tamano, elemento, contador =0, Vector[] = null, maximo;
        
           do{
            try
            {
               opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Calcular maximo en vector\n"
               + "2. Salir.","Menu de opciones",3));
            
               switch(opcion)
               {
                   case 1: 
                       tamano = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño del vector: ", "Tamaño vector", 3));
                       do
                       {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento " + contador + " del vector: ", "Elementos vector", 3));
                            Vector[contador] = elemento;
                            contador ++;
                       }while(contador < tamano);
                       maximo = maximo(Vector, tamano);
                       JOptionPane.showMessageDialog(null, "El maximo numero encontrado es: " + maximo, "Maximo", JOptionPane.INFORMATION_MESSAGE);
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


