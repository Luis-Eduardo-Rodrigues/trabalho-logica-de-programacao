package com.mycompany.exerciciojava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class trabaioq3 {
    public static void main(String[] args) {
             Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade das pessoas");
        int tamanhoArray, maiorIdade, posicaoMaior;
        tamanhoArray = entrada.nextInt();
        String [] nomes = new String [tamanhoArray];
        int [] idades = new int [tamanhoArray];
        
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Dados da [%d] da pessoa\n", i+1);
            System.out.print("Nome: ");
            nomes[i] = entrada.next();
            System.out.print("idade: ");
            idades[i] = entrada.nextInt();
        }
        maiorIdade = idades[0];
        posicaoMaior = 0;
        
        for (int i = 1; i < tamanhoArray; i++) {
            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
                posicaoMaior = i;
            }
        }
    }
}