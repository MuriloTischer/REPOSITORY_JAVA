package dev.murilotischer.calculadora;

import java.util.List;

/**
 * @author MURILO TISCHER
 */
public class CalculosDaCalculadora {
    public double soma(List<Double> numeros) {
        double soma = 0;
        for (Double numero : numeros) {
            soma = soma + numero;
        }
        return soma;
    }

    public double subtracao(List<Double> numeros) {
        double subtracao = 0;
        for (Double numero : numeros) {
            subtracao = subtracao - numero;
        }
        return subtracao;
    }

    public double multiplicacao(List<Double> numeros) {
        double multiplicacao = 0;
        for (Double numero : numeros) {
            multiplicacao = multiplicacao * numero;
        }
        return multiplicacao;
    }

    public Double divisao(List<Double> numeros) {
        if (!numeros.isEmpty()) {
            double divisao = numeros.get(0);
            for (int i = 1; i < numeros.size(); i++) {
                divisao = divisao / numeros.get(i);
            }
            return divisao;
        }
        return null;
    }


}
