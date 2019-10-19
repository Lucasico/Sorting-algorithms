
package vetores;


/**
 *
 * @author lucas
 */
public class InsertionSort{

 public void insertionSort(int[] vetor) {
     /*
        Algoritmo preparado para ordena o verto/array
        em ordem crescente...
     */
     final long antesDaOrdenacao = System.nanoTime();
     for (int i = 1; i < vetor.length; i++) {
         int key = vetor[i];
         int j = i - 1;
         while (j >= 0 && vetor[j] > key) {
             vetor[j + 1] = vetor[j];
             j = j - 1;
         }
         vetor[j + 1] = key;
     }
     final long posOrdenacao = System.nanoTime();
     final long diferencaTime = (posOrdenacao - antesDaOrdenacao);
     
     System.out.println(" --------- Tempos de execução da ordenação do INSERTIONSORT---------");
     System.out.println("> Tempo em nanosegundos antes da ordenação = " + antesDaOrdenacao);
     System.out.println("> Tempo em nanosegundos após a ordenação = " + posOrdenacao);
     System.out.println("> Tempo de diferença entre Time final e Time inicial = " + diferencaTime);
     System.out.println("OBS.: algoritmo preparado para ordenar na forma crescente");
     System.out.println("");
     
}
   
}
