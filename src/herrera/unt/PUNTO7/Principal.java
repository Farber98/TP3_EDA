
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herrera.unt.PUNTO7;

/**
 *
 * @author juan
 */
public class Principal {
    
    public int buscarTiempoMenor(int[] tiempos)
    {
        //Comparo y busco tiempo menor
    }
    
    public void leerVector(int[] vector)
    {
        //Metodo para leer vector
    }
    
    public void borrarElemento(int[] tiempos, int tiempoMenor)
    {
        //Busco y borro elemento
    }
    
    public void taller(int[] tiempos, int horasLaborales)
    {
        int[] solucion = null;
        int tiempoMenor;
        int indice = 0;
        int sumaTiempos = 0;
        while(sumaTiempos >= horasLaborales)
        {
            tiempoMenor = buscarTiempoMenor(tiempos);
            sumaTiempos = sumaTiempos + tiempoMenor;
            solucion[indice] = tiempoMenor;
            indice++;
            borrarElemento(tiempos, tiempoMenor);
        }
        leerVector(solucion);
    
    }
    
}
