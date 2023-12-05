#include <stdio.h>
#include <stdlib.h>

int main(){

    float nota1, nota2, notaExame, media, media2;

    printf("Digite a primeira nota: ");
    scanf("%f", &nota1);

    printf("Digite a segunda nota: ");
    scanf("%f", &nota2);

    media = (nota1 + nota2) / 2;

    printf("Sua nota foi %f", media);

    if(media >= 70){
        printf("Aprovado!");
    }else if(media < 69 && media > 40){
        printf("Em exame final. Digite a nota do exame: ");
        scanf("%f", &notaExame);

        media2 = media + notaExame;

        if(media2 > 100){
            printf("Aprovado!");
        }else{
            printf("Reprovado de novo!");
        }
        }
        if(media < 40){
            printf("Reprovado!");
        }

    return 0;
}