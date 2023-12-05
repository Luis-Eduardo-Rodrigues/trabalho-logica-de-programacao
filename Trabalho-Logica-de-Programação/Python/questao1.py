velocidade = int(input("Digite a velocidade: "))
velocidadeMax = int(input("Digite a velocidade maxima da avenida: "))

multa = (velocidade - velocidadeMax) * 5

if(velocidade > velocidadeMax):
    print("Sua velocidade foi acima da permitida")
    print(f'Valor da multa: {multa}R$')
else:
    print("Sua velocidade esta correta!")