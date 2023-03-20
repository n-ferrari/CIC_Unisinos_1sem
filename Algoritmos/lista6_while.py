# Exercicio 1: 10 numeros positivos, negativos ou zero

n = 0

while n < 10:
    x = int(input("Digite um numero aleatorio"))

    if x < 0:
        print("Numero negativo")
    elif x == 0:
        print("Zero")
    else:
        print("Numero positivo")
    n += 1

# Exercicio 2: Imprime os numeros de 1 a 1000
n = 1

while n <= 1000:
    print(n)
    n +=1

#Exercicio 3: Imprime na tela todos os valores inteiros entre dois valores digitados. Caso num1
#seja maior que num2, imprima uma mensagem de erro e nao imprima

num1 = int(input("Digite num1: "))
num2 = int(input("Digite num2: "))

if  num1 < num2:
    num1 += 1
    while num1 < num2:
        print(num1)
        num1 += 1
else: 
    print("Erro")

#Exercicio4: Imprime na tela todos os valores inteiros entre dois valores digitados.

num1 = int(input("Digite num1: "))
num2 = int(input("Digite num2: "))
maior = 0
menor = 0
if num1 > num2:
    maior = num1
    menor = num2
else: 
    maior = num2
    menor = num1

if not maior == menor:
    menor += 1
    while menor < maior:
        print(menor)
        menor += 1
else: 
    print("Os dois valores sao iguais")

#Exercicio5: imprime numeros entre 1 e 1000
soma = 0
n = 1

while n <= 1000:
    soma = soma + n
    n += 1

print("A soma dos valores de 1 a 1000 e", soma)

#Exercicio6: Programa que solicita que os numeros digitados sejam positivos e pares. Quando
#o usuario digitar um numero que nao seja o solicitado, imprima na tela a soma dos valores
#positivos e pares digitados
soma = 0

print("Digite numeros positivos e pares, para soma, digite outro valor")

while True:
    x = int(input())
    if x % 2 == 0 and x > 0:
        soma += x
    else:
        print("A soma e", soma)
        break

#Exercicio7: Programa que pede usuario e senha e verificar se esta correto
usuario = "USER10"
senha = "PASSWORD1234"

while True:
    x = input("Digite seu usuario ")
    y = input("Digite sua senha ")
    if x == usuario and y == senha:
        print("LOGIN EFETUADO COM SUCESSO")
        break

#Exercicio8: Usuario e senha no maximo 3 tentativas
usuario = "USER10"
senha = "PASSWORD1234"
tentativas = 0
login = False

while tentativas < 3:
    x = input("Digite seu usuario ")
    y = input("Digite sua senha ")
    if x == usuario and y == senha:
        print("LOGIN EFETUADO COM SUCESSO")
        login = True
        break
    tentativas += 1

if login == False:
    print("NUMERO MAXIMO DE TENTATIVAS EXCEDIDO!")