package dev.murilotischer.exercicios;

/**
 * @author MURILO TISCHER
 */

public class RetornoDeValores {
 //retornando o maior valor
    public int retornaMaiorValor(int[] numeros) {
        int maiorNumero = Integer.MIN_VALUE;
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        return maiorNumero;
    }
    // retornando o menor valor
    public int retornaMenorValor(int[] numeros) {
        int menorNumero = Integer.MAX_VALUE;
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] < menorNumero){
                menorNumero = numeros[i];
            }
        }
        return menorNumero;
    }

    //ordenando valores
    public int[] ordenarValores(int[] numeros){
        int[] numerosOrdenados = new int[numeros.length];
        int numeroAdicionado = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            int posicaoParaNovoNumero =i;

            for (int j = posicaoParaNovoNumero; j < numeros.length; j++) {
                if(numero < numerosOrdenados[j]){
                    posicaoParaNovoNumero = j;
                }
            }
            insereNovoNumero(numerosOrdenados, numeroAdicionado, posicaoParaNovoNumero);
        }
        return numerosOrdenados;
    }


    private void insereNovoNumero(int[] numerosOrdenados, int numero, int posicaoParaAdicionar){
        for (int i = numerosOrdenados.length - 1; i > posicaoParaAdicionar; i--) {
            numerosOrdenados[i] = numerosOrdenados[i - 1];
        }
        numerosOrdenados[posicaoParaAdicionar] = numero;
    }

}
