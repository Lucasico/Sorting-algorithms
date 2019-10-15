
package vetores;
/**
 *
 * @author lucas
 */
public class Mergesort {
    
    // Mescla duas sub-matrizes de arr [].
    // O primeiro subarray é arr [l..m]
    // O segundo subarray é arr [m + 1..r]
   
    void merge(int vetor[], int esquerdo, int meio, int direito) 
    { 
        
        int n1 = meio - esquerdo + 1; 
        int n2 = direito - meio; 
       
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
      
         // Copiar dados para arrays temporárias 
        for (int i=0; i<n1; ++i) 
            L[i] = vetor[esquerdo + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = vetor[meio + 1+ j]; 
       
        int i = 0, j = 0; 
        
        // Índice inicial do array de sub-base mesclada
        int k = esquerdo; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                vetor[k] = L[i]; 
                i++; 
            } 
            else
            { 
                vetor[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        
        while (i < n1) 
        { 
            vetor[k] = L[i]; 
            i++; 
            k++; 
        } 
        
        while (j < n2) 
        { 
            vetor[k] = R[j]; 
            j++; 
            k++; 
        } 
    }
     
    // Função principal que classifica arr [l..r] usando
    // mesclar ()
    void sort(int vetor[], int esquerdo, int direito) 
    { 
        if (esquerdo < direito) 
        { 
            
            int meio = (esquerdo+direito)/2; 
           
            sort(vetor, esquerdo, meio); 
            sort(vetor , meio+1, direito); 
            
            merge(vetor, esquerdo, meio, direito); 
        } 
    }
    void temposExecucao(long antesDaOrdenacao, long finalDaOrdenacao){
        
        final long diferencaTime = (finalDaOrdenacao - antesDaOrdenacao);
     
        System.out.println(" --------- Tempos de execução do MERGESORT---------");
        System.out.println("> Tempo em nanosegundos antes da ordenação = " + antesDaOrdenacao);
        System.out.println("> Tempo em nanosegundos após a ordenação = " + finalDaOrdenacao);
        System.out.println("> Tempo de diferença entre Time final e Time inicial = " + diferencaTime);
        System.out.println("OBS.: algoritmo preparado para ordenar na forma crescente");
        System.out.println("");
                
    }
    
}
