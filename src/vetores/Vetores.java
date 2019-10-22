package vetores;
/**
 *
 * @author lucas
 */
import java.util.Random;

public class Vetores {

    private int vetCrescente[] = new int[10000];
    private int vetDescrescente[] = new int[10000];
    private int vetRandomico[] = new int[10000];
    private int vetElementIguais[] = new int[10000];

    Random gerador = new Random();

    public int[] getVetCrescente() {
        return vetCrescente;
    }

    public void setVetCrescente(int[] vetCrescente) {
        this.vetCrescente = vetCrescente;
    }

    public int[] getVetDescrescente() {
        return vetDescrescente;
    }

    public void setVetDescrescente(int[] vetDescrescente) {
        this.vetDescrescente = vetDescrescente;
    }

    public int[] getVetRandomico() {
        return vetRandomico;
    }

    public void setVetRandomico(int[] vetRandomico) {
        this.vetRandomico = vetRandomico;
    }

    public int[] getVetElementIguais() {
        return vetElementIguais;
    }

    public void setVetElementIguais(int[] vetElementIguais) {
        this.vetElementIguais = vetElementIguais;
    }

    public void preenchervetCrescente(int control) {
        for (int i = 0; i < getVetCrescente().length; i++) {
            this.vetCrescente[i] = i;
            //System.out.println("Posição não descrescente["+ i +"]"+ "Elemento ->"+ this.vetCrescente[i]);
        }
        System.out.println("---------VETOR PREENCHIDO NA ORDEM CRESCENTE---------");
        switch (control) {
            case 1:
                InsertionSort ordenaInsercao = new InsertionSort();
                
                ordenaInsercao.insertionSort(vetCrescente);
                
                break;
            case 2:
                int tamVetMerge = getVetCrescente().length;
                Mergesort ordenaMerge = new Mergesort();
                final long antesDaOrdenacaoMerge = System.nanoTime();
                
                ordenaMerge.sort(vetCrescente, 0, tamVetMerge - 1);
                
                final long finalDaOrdenacaoMerge = System.nanoTime();
                ordenaMerge.temposExecucao(antesDaOrdenacaoMerge, finalDaOrdenacaoMerge);

                break;
            case 3:
                 HeapSort ordenaHeap = new HeapSort();
                final long antesDaOrdenacaoHeap = System.nanoTime();
                
                ordenaHeap.sort(vetCrescente);
                
                final long finalDaOrdenacaoHeap = System.nanoTime();
                ordenaHeap.temposExecucao(antesDaOrdenacaoHeap, finalDaOrdenacaoHeap);

                break;
            case 4:
                int tamVetQuick = getVetCrescente().length;
                Quicksort ordenaQuick = new Quicksort();
                final long antesDaOrdenacaoQuick = System.nanoTime();
                
                ordenaQuick.sort(vetCrescente, 0, tamVetQuick - 1);
                
                final long finalDaOrdenacaoQuick = System.nanoTime();
                ordenaQuick.temposExecucao(antesDaOrdenacaoQuick, finalDaOrdenacaoQuick);

                break;
        }

    }

    public void preenchervetDescrescente(int control) {
        int j = getVetDescrescente().length - 1;
        for (int i = 0; i < getVetDescrescente().length; i++) {
            this.vetDescrescente[i] = j;
            j--;
            //System.out.println("Posição descrescente["+ i +"]"+ "Elemento ->" + this.vetDescrescente[i]);
        }
        System.out.println("---------VETOR PREENCHIDO NA ORDEM DESCRESCENTE---------");

        switch (control) {
            case 1:
                InsertionSort ordenaInsercao = new InsertionSort();
                
                ordenaInsercao.insertionSort(vetDescrescente);
                
                break;
            case 2:
                int tamVetMerge = getVetCrescente().length;
                Mergesort ordenaMerge = new Mergesort();
                final long antesDaOrdenacaoMerge = System.nanoTime();
                
                ordenaMerge.sort(vetDescrescente, 0, tamVetMerge - 1);
                
                final long finalDaOrdenacaoMerge = System.nanoTime();
                ordenaMerge.temposExecucao(antesDaOrdenacaoMerge, finalDaOrdenacaoMerge);
                break;
            case 3:
                HeapSort ordenaHeap = new HeapSort();
                final long antesDaOrdenacaoHeap = System.nanoTime();
                
                ordenaHeap.sort(vetDescrescente);
                
                final long finalDaOrdenacaoHeap = System.nanoTime();
                ordenaHeap.temposExecucao(antesDaOrdenacaoHeap, finalDaOrdenacaoHeap);

                break;
            case 4:
                int tamVetQuick = getVetDescrescente().length;
                Quicksort ordenaQuick = new Quicksort();
                final long antesDaOrdenacaoQuick = System.nanoTime();
                
                ordenaQuick.sort(vetDescrescente, 0, tamVetQuick - 1);
                
                final long finalDaOrdenacaoQuick = System.nanoTime();
                ordenaQuick.temposExecucao(antesDaOrdenacaoQuick, finalDaOrdenacaoQuick);
                break;
        }
    }

    public void preecherVetRandomico(int control) {
        for (int i = 0; i < getVetRandomico().length; i++) {
            this.vetRandomico[i] = gerador.nextInt(1000);
            // System.out.println("Posição["+ i +"]"+ "Elemento ->" + this.vetRandomico[i]);
        }
        System.out.println("---------VETOR PREENCHIDO DE FORMA RANDOMICA---------");

        switch (control) {
            case 1:
                InsertionSort ordenaInsercao = new InsertionSort();
                ordenaInsercao.insertionSort(vetRandomico);
                break;
            case 2:
                int tamVetMerge = getVetRandomico().length;
                Mergesort ordenaMerge = new Mergesort();
                final long antesDaOrdenacaoMerge = System.nanoTime();
                
                ordenaMerge.sort(vetRandomico, 0, tamVetMerge - 1);
                
                final long finalDaOrdenacaoMerge = System.nanoTime();
                ordenaMerge.temposExecucao(antesDaOrdenacaoMerge, finalDaOrdenacaoMerge);
                break;
            case 3:
                HeapSort ordenaHeap = new HeapSort();
                final long antesDaOrdenacaoHeap = System.nanoTime();
                
                ordenaHeap.sort(vetRandomico);
                
                final long finalDaOrdenacaoHeap = System.nanoTime();
                ordenaHeap.temposExecucao(antesDaOrdenacaoHeap, finalDaOrdenacaoHeap);
                break;
            case 4:
                int tamVetQuick = getVetRandomico().length;
                Quicksort ordenaQuick = new Quicksort();
                final long antesDaOrdenacaoQuick = System.nanoTime();
                
                ordenaQuick.sort(vetRandomico, 0, tamVetQuick - 1);
                
                final long finalDaOrdenacaoQuick = System.nanoTime();
                ordenaQuick.temposExecucao(antesDaOrdenacaoQuick, finalDaOrdenacaoQuick);
                break;
        }
    }

    public void preecherVetElementIguais(int elemento, int control) {
        for (int i = 0; i < getVetRandomico().length; i++) {
            this.vetElementIguais[i] = elemento;
            //System.out.println("Posição["+ i +"]"+ "Elemento ->" + this.vetElementIguais[i]);
        }
        System.out.println("---------VETOR PREENCHIDO COM UM MESMO ELEMENTO---------");

        switch (control) {
            case 1:
                InsertionSort ordenaInsercao = new InsertionSort();
                
                ordenaInsercao.insertionSort(vetElementIguais);
                
                break;
            case 2:
                int tamVetMerge = getVetElementIguais().length;
                Mergesort ordenaMerge = new Mergesort();
                final long antesDaOrdenacaoMerge = System.nanoTime();
                
                ordenaMerge.sort(vetElementIguais, 0, tamVetMerge - 1);
                
                final long finalDaOrdenacaoMerge = System.nanoTime();
                ordenaMerge.temposExecucao(antesDaOrdenacaoMerge, finalDaOrdenacaoMerge);

                break;
            case 3:
                HeapSort ordenaHeap = new HeapSort();
                final long antesDaOrdenacaoHeap = System.nanoTime();
                
                ordenaHeap.sort(vetElementIguais);
                
                final long finalDaOrdenacaoHeap = System.nanoTime();
                ordenaHeap.temposExecucao(antesDaOrdenacaoHeap, finalDaOrdenacaoHeap);
                break;
            case 4:
                int tamVetQuick = getVetElementIguais().length;
                Quicksort ordenaQuick = new Quicksort();
                final long antesDaOrdenacaoQuick = System.nanoTime();
                
                ordenaQuick.sort(vetElementIguais, 0, tamVetQuick - 1);
                
                final long finalDaOrdenacaoQuick = System.nanoTime();
                ordenaQuick.temposExecucao(antesDaOrdenacaoQuick, finalDaOrdenacaoQuick);
                break;
        }
    }

}
