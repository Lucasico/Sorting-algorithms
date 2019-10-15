
package vetores;
/**
 *
 * @author lucas
 */
public class Quicksort {
   /*
       Esta função aceita o último elemento como pivô,
       coloca o elemento pivô no seu correto
       posição no array classificada e coloca todos
       menor (menor que o pivô) à esquerda do
       pivô e todos os elementos maiores para a direita
       do pivô 
     
    */
    int partition(int vetor[], int inicio, int fim) 
    { 
        int pivot = vetor[fim];  
        int i = (inicio-1);
        for (int j=inicio; j<fim; j++) 
        { 
           
            if (vetor[j] < pivot) 
            { 
                i++; 
                
                int temp = vetor[i]; 
                vetor[i] = vetor[j]; 
                vetor[j] = temp; 
            } 
        } 
        
        int temp = vetor[i+1]; 
        vetor[i+1] = vetor[fim]; 
        vetor[fim] = temp; 
  
        return i+1; 
    } 
  
    void sort(int vetor[], int inicio, int fim) 
    { 
        if (inicio < fim) 
        { 
             /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(vetor, inicio, fim); 
  
            // Classifica recursivamente os elementos antes
            // partição e depois da partição
            sort(vetor, inicio, pi-1); 
            sort(vetor, pi+1, fim); 
        } 
    }
    void temposExecucao(long antesDaOrdenacao,long finalDaOrdenacao){
        final long diferencaTime = (finalDaOrdenacao - antesDaOrdenacao);
     
        System.out.println(" --------- Tempos de execução do QUICKSORT---------");
        System.out.println("> Tempo em nanosegundos antes da ordenação = " + antesDaOrdenacao);
        System.out.println("> Tempo em nanosegundos após a ordenação = " + finalDaOrdenacao);
        System.out.println("> Tempo de diferença entre Time final e Time inicial = " + diferencaTime);
        System.out.println("OBS.: algoritmo preparado para ordenar na forma crescente");
        System.out.println("");
    }
  
}
