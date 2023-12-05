package com.mycompany.exerciciojava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class trabaioq1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int velocidade_maxima, velocidade_motorista, multa;
        System.out.println("velocidae maxima da avenida: ");
        velocidade_maxima = ent.nextInt();
        System.out.println("Velocidae motorista: ");
        velocidade_motorista = ent.nextInt();

        multa = (velocidade_motorista - velocidade_maxima) * 5;

        if (velocidade_motorista > velocidade_maxima) {
            System.out.println("O valor da Multa eh: " + multa);
        } else {
            System.out.println("Velocidade corrreta! nenhuma multa sera aplicada");
        }
    }
}
