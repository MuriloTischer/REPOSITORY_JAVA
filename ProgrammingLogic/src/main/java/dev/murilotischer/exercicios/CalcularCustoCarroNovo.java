package dev.murilotischer.exercicios;

import java.util.Scanner;

/**
 * @author MURILO TISCHER
 */
 /*
 O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor.
*/
public class CalcularCustoCarroNovo {

    public static void main(String[] args) {
        double porcentualDistribuidor = 0.28;
        double porcentualImpostos = 0.45;
        double valorCarroFabrica;
        double valorFinalCarro;

        System.out.println("Informe o valor do carro");
        valorCarroFabrica = new Scanner(System.in).nextDouble();

        valorFinalCarro = valorCarroFabrica;
        valorFinalCarro = valorFinalCarro + valorCarroFabrica * porcentualDistribuidor;

        System.out.println("Valor com pct distribuidor " +valorFinalCarro);

        valorFinalCarro = valorFinalCarro + valorCarroFabrica * porcentualImpostos;

        System.out.println("Valor com impostos " +valorFinalCarro);
    }
}
