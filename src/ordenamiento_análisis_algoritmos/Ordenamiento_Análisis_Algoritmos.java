

package ordenamiento_análisis_algoritmos;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author stephanie
 */
public class Ordenamiento_Análisis_Algoritmos {

       static  int menu(){
         Scanner s = new Scanner(System.in);
         int op;
            System.out.println("ALGORITMO ORDENAMIENTO");
            System.out.println("1.BUBBLE SORT");
            System.out.println("2.HEAPSORT");
            System.out.println("3.RADIX SORT");
            System.out.println("4.MERGE SORT");
            System.out.println("5.QUICK SORT");
            System.out.println("6.SELECTION SORT");
            System.out.println("7.INSERTION SORT");
            System.out.println("8.EXIT");
             System.out.println("INGRESE LA OPCION DESEADA"); 
            op=s.nextInt();
            return op;
        }
     
      static int [] arreglo(){
         Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n=s.nextInt();
        Random r=new Random();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=r.nextInt(n+1);
        }
        return a;
    }
    
    public static void main(String[] args) {

        int opcion;
        int Arreglo[];
        do{
           opcion=menu();
           switch (opcion){
               
               case 1:
                   Bubblesort b = new Bubblesort();
                   Arreglo=arreglo();
                   b.bubbleSort(Arreglo);
                   System.out.println("ORDENAMIENTO BUBBLESORT");
                   System.out.println(Arrays.toString(Arreglo));
                   break;
                   
               case 2:
                   Heapsort h = new Heapsort();
                   Arreglo=arreglo();
                   h.heapsort(Arreglo);
                   System.out.println("ORDENAMIENTO HEAPSORT");
                   System.out.println(Arrays.toString(Arreglo));
                   break;  
                   
                case 3:
                  RadixSort r= new RadixSort();
                   Arreglo=arreglo();
                   r.radixSort(Arreglo);
                   System.out.println("ORDENAMIENTO RADIXSORT");
                   System.out.println(Arrays.toString(Arreglo));
                   break; 
                    
               case 4:
                  Mergesort m= new Mergesort();
                   Arreglo=arreglo();
                   m.mergeSort(Arreglo);
                   System.out.println("ORDENAMIENTO MERGESORT");
                   System.out.println(Arrays.toString(Arreglo));
                   break; 
                   
                case 5:
                  Quicksort q= new Quicksort();
                   Arreglo=arreglo();
                     q.ordenacionRapida(Arreglo);
                   System.out.println("ORDENAMIENTO QUICKSORT");
                   System.out.println(Arrays.toString(Arreglo));
                   break; 
                    
                case 6:
                  SelectionSort s = new SelectionSort();
                   Arreglo=arreglo();
                   s.selectionSort(Arreglo);
                   System.out.println("ORDENAMIENTO SELECTION SORT");
                   System.out.println(Arrays.toString(Arreglo));
                   break;   
                    
               case 7:
                  Insertion i = new Insertion();
                   Arreglo=arreglo();
                   i.insertionSort(Arreglo);
                   System.out.println("ORDENAMIENTO INSERTION SORT");
                   System.out.println(Arrays.toString(Arreglo));
                   break; 
               case 8:
                  System.exit(0);
                   break; 
                   
                    
           }
        
           
        
        
        
        }while (opcion==8);
        
        
          
    }
    
  
    
}
