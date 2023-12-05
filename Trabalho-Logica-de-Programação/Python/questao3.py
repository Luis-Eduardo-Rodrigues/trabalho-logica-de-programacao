nomes = []
idades = []

for i in range(1, 4):
    nome = input(f'Digite o nome da {i}ª pessoa: ')
    idade = int(input(f'Digite a idade da {i}ª pessoa: '))

maiorIdade = idades[0]
maisVelho = nomes[0]

for i in range(3):
    if(idades[i] > maiorIdade):
        maiorIdade = idades[i]
        maisVelho = nomes[i]

print(f'O mais velho {maisVelho} com {maiorIdade}')