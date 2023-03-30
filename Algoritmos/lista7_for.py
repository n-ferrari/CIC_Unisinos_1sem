# Exercício 1
# Crie um programa imprime na tela os valores de 1 a 100 (incluindo o 1 e o 100).  
for i in range(1,101):
    print(i)

# Exercício 2
# Crie um programa que imprime na tela todos os valores entre dois valores digitados pelo teclado.
x = int(input("Digite um numero: "))
y = int(input("Digite outro numero: "))
menor = 0
maior = 0

if x > y:
    maior = x
    menor = y
elif x < y:
    maior = y
    menor = x
else:
    print("Os numeros sao iguais")

if maior !=0 and menor !=0:
    for i in range(menor + 1,maior):
        print(i)

# Exercício 3
# Crie um programa que imprime a tabuada de um número qualquer digitado pelo usuário.
x = int(input("Digite um numero: "))

print("A tabuada de",x,"é: ")
for i in range(0,11):
    print(x,"x", i ,"=",x * i)

# Exercício 4
# Sabendo que uma string é uma lista de letras, peça para o usuário digitar um texto e imprima na tela a quantidade de vogais que existem no texto.
# texto = input("Digite um texto: ")
# vogais = 0

for i in texto:
    if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
        vogais += 1

print("O texto possui",vogais,"vogais.")


# Exercício 5
# Crie um programa que permita que o usuário crie sua lista de compras. Primeiramente, solicite que ele informe quantos produtos serão adicionados na lista. 
#Depois disto, peça para que o usuário digite os produtos que ele vai comprar, e armazene em uma lista. 
#Ao final, imprima a lista de compras do usuário.
quant_produtos = int(input("Quantos produtos serão adicionados na lista? "))
lista = []

for i in range(0,quant_produtos):
    lista.append(input("Digite o produto:"))

print("\nA lista de compras é: ")
for i in lista:
    print(i)


# Exercício 6
# Crie um programa que solicita o nome e o estado civil de 20 pessoas pelo teclado. 
# Ao final, imprima apenas o nome das pessoas separadas por estado civil: solteiras, casadas, divorciadas e viúvas (nesta ordem!)

nome = []
estado_civil = []
num_pessoas = 4

for i in range(0, num_pessoas):
    nome.append(input("Digite o nome: "))
    estado_civil.append(input("Digite o estado civil (Solteiro, Casado, Divorciado ou Viuvo): "))

print("\nPessoas em ordem de Estado Civil: Solteiros, casados, divorciados e viúvos:")
for i in range(0, num_pessoas):
    if estado_civil[i] == "Solteiro" or estado_civil[i] == "solteiro" or estado_civil[i] == "solteira" or estado_civil[i] == "Solteira":
        print(nome[i])

for i in range(0, num_pessoas):
    if estado_civil[i] == "Casado" or estado_civil[i] == "casado" or estado_civil[i] == "casada" or estado_civil[i] == "Casada":
        print(nome[i])

for i in range(0, num_pessoas):
    if estado_civil[i] == "Divorciado" or estado_civil[i] == "divorciado" or estado_civil[i] == "divorciada" or estado_civil[i] == "Divorciada":
        print(nome[i])

for i in range(0, num_pessoas):
    if estado_civil[i] == "Viúvo" or estado_civil[i] == "Viuvo" or estado_civil[i] == "Viúva" or estado_civil[i] == "Viuva" or estado_civil[i] == "viúvo" or estado_civil[i] == "viuvo" or estado_civil[i] == "viúva" or estado_civil[i] == "viuva":
        print(nome[i])    

#Exercício 7
# Crie um programa que solicita ao usuário que ele defina sua senha. 
# A senha deve ser um texto (string) composto apenas por dígitos e deve ter entre 5 e 10 valores. 
# O usuário tem apenas 6 chances de definir corretamente a senha. 
# Caso ele defina corretamente a senha nas tentativas que ele tem, imprima uma mensagem de sucesso. 
# Caso ele não defina a senha corretamente, imprima uma mensagem de insucesso. 
# Dica: na aula aprendemos a ver se uma string é formada apenas por dígitos e aprendemos a descobrir o tamanho do texto digitado.

chances = 0

while chances < 6:
    senha = input("Senha: ")
    valores = 0
    digitos = True

    for i in senha:
        valores += 1
        if i not in ('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'):
            digitos = False

    if digitos == True and valores >=5 and valores <= 10: 
        print("A senha esta correta")
        break
    chances += 1

if chances == 6:
    print("Numero de tentativas excedido")

# Exercício 8
# Crie um programa que separa o joio do trigo. Seu programa deve ler a lista abaixo e criar duas listas diferentes: 
# uma com todas as ocorrências da palavra "joio" e outra com todas as ocorrências da palavra "trigo". 
# Ao final, imprima as listas separadas. Copie e cole a linha abaixo no seu código e complete o programa:

joioETrigo = ["joio", "trigo", "trigo", "joio", "trigo", "joio", "joio", "joio", "joio", "trigo", "trigo", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "joio", "trigo", "joio", "joio", "joio"]

joio = []
trigo = []

for i in joioETrigo:
    if i == "joio":
        joio.append(i)
    else:
        trigo.append(i)

print("\nLista joio: ")
for i in joio:
    print(i)

print("\nLista trigo: ")
for i in trigo:
    print(i)
