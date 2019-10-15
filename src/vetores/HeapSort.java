
package vetores;
/**
 *
 * @author lucas
 */
public class HeapSort {
    public void sort(int vetor[]) 
    { 
        int n = vetor.length; 
  
        // Montar heap (reorganizar matriz)
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(vetor, n, i); 
  
       // Um ​​por um extrai um elemento do heap
        for (int i=n-1; i>=0; i--) 
        { 
            // Move a raiz atual para o final
            int temp = vetor[0]; 
            vetor[0] = vetor[i]; 
            vetor[i] = temp; 
  
           
            // chama max heapify na pilha reduzida
            heapify(vetor, i, 0); 
        } 
    } 
    void heapify(int vetor[], int n, int i) 
    { 
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2; 
  
       
        if (l < n && vetor[l] > vetor[largest]) 
            largest = l; 
  
       
        if (r < n && vetor[r] > vetor[largest]) 
            largest = r; 
  
       
        if (largest != i) 
        { 
            int swap = vetor[i]; 
            vetor[i] = vetor[largest]; 
            vetor[largest] = swap; 
  
            
            heapify(vetor, n, largest); 
        } 
    }
    void temposExecucao(long antesDaOrdenacao, long finalDaOrdenacao){
        final long diferencaTime = (finalDaOrdenacao - antesDaOrdenacao);
     
        System.out.println(" --------- Tempos de execução do HEAPSORT---------");
        System.out.println("> Tempo em nanosegundos antes da ordenação = " + antesDaOrdenacao);
        System.out.println("> Tempo em nanosegundos após a ordenação = " + finalDaOrdenacao);
        System.out.println("> Tempo de diferença entre Time final e Time inicial = " + diferencaTime);
        System.out.println("OBS.: algoritmo preparado para ordenar na forma crescente");
        System.out.println("");
    }
    
}
