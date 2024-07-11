package dev.murilotischer.exercicios;

import java.util.Scanner;

/**
 * @author MURILO TISCHER
 */
public class CalcularMediaDoAluno {
    public static void main(String[] args) {
        double primeiraNota;
        double segundaNota;
        double terceiraNota;
        double quartaNota;
        double mediaFinal;
        String aluno;

        System.out.println("Informe o nome do aluno. ");
        aluno = new Scanner(System.in).next();


        System.out.println("Informe a primeira nota: ");
        primeiraNota = new Scanner(System.in).nextDouble();

        System.out.println("Informe a segunda nota: ");
        segundaNota = new Scanner(System.in).nextDouble();

        System.out.println("Informe a terceira nota: ");
        terceiraNota = new Scanner(System.in).nextDouble();

        System.out.println("Informe a quarta nota: ");
        quartaNota = new Scanner(System.in).nextDouble();

        mediaFinal = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        System.out.println("O aluno: " + aluno + " obteve a média: " + mediaFinal);

        if (mediaFinal >= 7) {
            System.out.println("Parabéns, " + aluno + "!! Você foi APROVADO!");


        } else {
            System.out.println("Infelizmente sua meta não foi alcançada, " +
                    "estude mais e tente novamente.");
        }
    }
}
