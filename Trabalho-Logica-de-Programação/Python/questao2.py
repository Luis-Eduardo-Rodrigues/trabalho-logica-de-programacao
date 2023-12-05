nota1 = int(input("Digite a primeira nota: "))
nota2 = int(input("Digite a segunda nota: "))

media = (nota1 + nota2 ) / 2

print(f'Sua nota foi {media}')
if(media >= 70):
    print("Aprovado!")
else: 
    print("Reprovado!")
    
if(media < 69 and media > 40):
    exameNota = int(input("Digite a nota do exame: "))
    media2 = exameNota + media
    if(media2 >= 100):
        print("Aprovado")
    else: 
        print("Reprovado de novo")
