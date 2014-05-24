/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamiento_análisis_algoritmos;

/**
 *
 * @author stephanie
 */
public class Quicksort {
    
    
    
public static void ordenacionRapida(int[] v) {
        final int N = v.length;
        quickSort(v,0,N-1);
    }//end ordenacionRapida
 
    public static void quickSort(int[] v, int inicio, int fin) {
        if(inicio>=fin) return ;
        int pivote = v[inicio];
        int izq    = inicio+1;
        int der    = fin;
        while(izq<=der) {
            while(izq<=fin   && v[izq]< pivote) izq++;
            while(der>inicio && v[der]>=pivote) der--;
            if(izq<der) {
                int tmp = v[izq];
                v[izq]  = v[der];
                v[der]  = tmp;
            }
        }
        if(der>inicio) {
            int tmp  = v[inicio];
            v[inicio]= v[der];
            v[der]   = tmp;
        }
        quickSort(v,inicio, der-1);
        quickSort(v, der+1, fin);
    }//end quickSort
}
