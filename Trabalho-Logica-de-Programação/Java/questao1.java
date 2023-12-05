package com.mycompany.exerciciojava;

import java.util.Scanner;


public class trabaio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double nota1, nota2, notaExame, media, media2;
        
        System.out.println("Digite a primeira nota de 0 a 100: ");
        nota1 = input.nextDouble();
        
        System.out.println("Digite a segunda nota de 0 a 100: ");
        nota2 = input.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        System.out.println("Sua nota foi " + media);
        
        if(media >= 70){
            System.out.println("Voce foi aprovado!");
        }else if(media < 69 && media > 40){
            System.out.println("Em exame final... Digite a nota do exame: ");
            notaExame = input.nextDouble();
            media2 = media + notaExame;
            if(media2 > 100){
                System.out.println("Sua nota final com o exame foi: " + media2 + " Aprovado!");
            }else{
                System.out.println("Reprovado, canalha!");
            }
        }else if(media < 40){
            System.out.println("Reprovado!");
        }
    }
}
