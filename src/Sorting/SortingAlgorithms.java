
package Sorting;


import java.util.Scanner;
import vetores.Vetores;

public class SortingAlgorithms {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcaoOrdenacao;
        
        System.out.println("-- MENU DE OPÇÕES --");
        System.out.println("[1]-InsertionSort   |");
        System.out.println("[2]-Mergesort       |");
        System.out.println("[3]-Heapsort        |");
        System.out.println("[4]-Quicksort       |");
        System.out.println("--------------------");
        
        System.out.print("Digite a opção referente a ordenação que deseja ver a comparação dos tempos de execução: ");
        opcaoOrdenacao = teclado.nextInt();
        
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("\nOs vetores abaixo ordenados, são ambos de 1000 posições\n");
        
        switch(opcaoOrdenacao){
            case 1:
                
                 Vetores vetoresInsertion = new Vetores();
                 vetoresInsertion.preenchervetCrescente(opcaoOrdenacao);
                 vetoresInsertion.preenchervetDescrescente(opcaoOrdenacao);
                 vetoresInsertion.preecherVetRandomico(opcaoOrdenacao);
                 vetoresInsertion.preecherVetElementIguais(10,opcaoOrdenacao);
                 
                break;
            case 2:
                
                 Vetores vetoresMergen = new Vetores();
                 vetoresMergen.preenchervetCrescente(opcaoOrdenacao);
                 vetoresMergen.preenchervetDescrescente(opcaoOrdenacao);
                 vetoresMergen.preecherVetRandomico(opcaoOrdenacao);
                 vetoresMergen.preecherVetElementIguais(10,opcaoOrdenacao);
                 
                break;
            case 3:
                
                 Vetores vetoresHeap = new Vetores();
                 vetoresHeap.preenchervetCrescente(opcaoOrdenacao);
                 vetoresHeap.preenchervetDescrescente(opcaoOrdenacao);
                 vetoresHeap.preecherVetRandomico(opcaoOrdenacao);
                 vetoresHeap.preecherVetElementIguais(10,opcaoOrdenacao);
                 
                break;
            case 4:
                
                 Vetores vetoresQuick = new Vetores();
                 vetoresQuick.preenchervetCrescente(opcaoOrdenacao);
                 vetoresQuick.preenchervetDescrescente(opcaoOrdenacao);
                 vetoresQuick.preecherVetRandomico(opcaoOrdenacao);
                 vetoresQuick.preecherVetElementIguais(10,opcaoOrdenacao);
                 
                break;
            default:
                
                System.out.println("Opção invalida!");
                
                break;
        }
    }
}
