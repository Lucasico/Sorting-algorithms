/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculoTime;
/**
 *
 * @author lucas
 */
public abstract class CalcTime {
   public void temposExecucao(long antesDaOrdenacao,long finalDaOrdenacao){
        final long diferencaTime = (finalDaOrdenacao - antesDaOrdenacao);
     
        System.out.println(" --------- Tempos de execução---------");
        System.out.println("> Tempo em nanosegundos antes da ordenação = " + antesDaOrdenacao);
        System.out.println("> Tempo em nanosegundos após a ordenação = " + finalDaOrdenacao);
        System.out.println("> Tempo de diferença entre Time final e Time inicial = " + diferencaTime);
        System.out.println("OBS.: algoritmo preparado para ordenar na forma crescente");
        System.out.println("");
    }
}
