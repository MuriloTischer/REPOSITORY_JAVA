package dev.murilotischer.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author MURILO TISCHER
 */

public class Menu {
    public void showMenu(){
        String menu = new Menu().criarMenu();
        System.out.println(menu);
    }

    public String criarMenu(){
        StringBuilder menu = new StringBuilder();
        menu.append(" --- MENU ARITIMÉTICO ---").append("\n")
                .append("1. DIVISÃO").append("\n")
                .append("2. MULTIPLICAÇÃO").append("\n")
                .append("3. SOMA").append("\n")
                .append("4. SUBTRAÇÃO").append("\n")
                .append("0. SAIR DO MENU").append("\n\r");
                return menu.toString();
    }

    public Double identificaAndExecutaOpcaoDoUsuario(int opcao){
        List<Double> valores;
        switch (opcao){
            case 1:
                valores = valorDigitadoPeloUsuario();
                CalculosDaCalculadora calcularDivisao = new CalculosDaCalculadora();
                return calcularDivisao.divisao(valores);
            case 2:
                valores = valorDigitadoPeloUsuario();
                CalculosDaCalculadora calcularMultiplicacao = new CalculosDaCalculadora();
                return calcularMultiplicacao.multiplicacao(valores);
            case 3:
                valores = valorDigitadoPeloUsuario();
                CalculosDaCalculadora calcularSoma = new CalculosDaCalculadora();
                return calcularSoma.soma(valores);
            case 4:
                valores = valorDigitadoPeloUsuario();
                CalculosDaCalculadora calcularSubtracao = new CalculosDaCalculadora();
                return calcularSubtracao.subtracao(valores);
            case 0:
                System.out.println("Desligando calculadora...");
                break;
            default:
                System.out.println("A opção escolhida não existe, tente novamente.");
                break;
        }
        return null;
    }

    public int perguntaOpcaoDoUsuario(){
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma das opções para continuar: ");
        int opcao = input.nextInt();
        return opcao;
    }

    public boolean verificaSeOpcaoIsValida(int opcao){
        if(opcao < 0 || opcao > 4){
            return false;
        }else{
            return true;
        }
    }

    private double perguntarValorParaUsuario(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        double valor = input.nextDouble();
        return valor;
    }

    private List<Double> valorDigitadoPeloUsuario(){
        List<Double> valorDoUsuario = new ArrayList<>();
        while (true){
            double valor = perguntarValorParaUsuario();
            valorDoUsuario.add(valor);
        }

    }

    public void showResultado(double resultado){
        System.out.println(resultado);
    }

    public boolean verificaFimDaExecucao(Double resultado){
        return resultado == null;
    }

}