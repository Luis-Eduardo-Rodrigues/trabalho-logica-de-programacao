#include <stdio.h>
#include <stdlib.h>

int main(){
    int velocidade, multavalor, velocidadeMax;

    printf("Digite a velocidade: ");
    scanf("%d", &velocidade);
    printf("Digite a velocidade maxima da avenida: ");
    scanf("%d", &velocidadeMax);

    if(velocidade > velocidadeMax){
        multavalor = (velocidade - velocidadeMax) * 5;
        printf("Velocidade acima da permitida a multa foi de %d R$", multavalor);
    }else{
        printf("Velocidade correta! Nenhuma multa sera aplicada!");
    }
    
    return 0;
}