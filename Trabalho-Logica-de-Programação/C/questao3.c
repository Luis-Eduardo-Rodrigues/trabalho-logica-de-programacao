#include <stdio.h>
#include <stdlib.h>

int main() {
    int num_pessoas;

    printf("Digite o número de pessoas: ");
    scanf("%d", &num_pessoas);

    char nomes[num_pessoas][50];
    int idades[num_pessoas];

    for (int i = 0; i < num_pessoas; i++) {
        printf("Digite o nome da pessoa: ");
        scanf("%s", nomes[i]);

        printf("Digite a idade da pessoa: ");
        scanf("%d", &idades[i]);
    }

    int indice_mais_velho = 0;
    
    for (int i = 1; i < num_pessoas; i++) {
        if (idades[i] > idades[indice_mais_velho]) {
            indice_mais_velho = i;
        }
    }

    printf("A pessoa mais velha é: %s\n", nomes[indice_mais_velho]);

    return 0;
}