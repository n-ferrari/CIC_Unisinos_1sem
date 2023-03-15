#exercicio 1: par ou impar
a = int(input("Escreva um numero: "))
resto = a % 2

if(resto == 0):
    print("O numero e par")
else:
    print("O numero e impar")


#exercicio 2: retorna maior valor entre 2
x = int(input("Escreva um numero "))
y = int(input("Escreva outro numero "))

if (x == y):
    print("Os valores sao iguais")
elif (x > y):
    print ("O primeiro numero", x ,"e maior que o segundo", y)
else:
    print("O segundo numero", y ,"e maior que o primeiro", x)


#exercicio 3: programa que impede divisao por zero
a = int(input("Escreva um numero "))
b = int(input("Escreva outro numero "))

if (b == 0):
    print("b nao pode ser 0")
else:
    print(a / b)

#exercicio 4: recebe tres numeros e retorna o menor
a = int(input("Digite o numero a "))
b = int(input("Digite o numero b "))
c = int(input("Digite o numero c "))

if (a < b and a < c):
        print("A e menor")
elif (b < a and b < c):
        print("B e menor")
elif (c < a and c < b):
        print("C e menor")
else:
    print("Não há número menor")

#exercicio 5 classificacao de preco
preco = float(input("Digite um preco "))

if (preco <= 0):
    print("Preco inválido")
elif (preco <= 30):
    print("Preco baixo")
elif (preco <= 50):
    print("Preco medio")
else:
    print("Preco alto")


#exercicio6: aumento de preco
preco = float(input("Digite um preco: "))
erro = 0

if (preco < 0):
    print("Valor negativo")
    erro += 1
elif(preco < 100):
    preco = preco * 1.1
elif (preco < 300):
    preco = preco * 1.2
elif (preco < 1000):
    preco = preco * 1.5
else:
    print("Invalido: valor maior que 1000")
    erro += 1

if erro == 0:
    print("O novo valor e ", preco)

#exercicio 7: anos bissextos
ano = int(input("Informe um ano "))

if (ano % 4 == 0):
    if (ano % 100 != 0 or ano % 400 == 0):
        print("O ano é bissexto")
    else:
        print("O ano nao e bissexto")
else:
    print("O ano não é bissexto")


#exercico 8: calculadora
print("Digite 1 para somar dois valores")
print("Digite 2 para subtrair dois valores")
print("Digite 3 para multiplicar dois valores")
print("Digite 4 para dividir dois valores")
print("Digite 5 para realizar uma potência entre dois valores")
print("Digite 6 para realizar uma radiciação entre dois valores")
print("Digite qualquer outro número para sair")

x = int(input())

if(x == 1):
    print("Soma: Digite 2 numeros")
    a = int(input())
    b = int(input())
    c = a + b
elif(x == 2):
    print("Subtracao: Digite 2 numeros")
    a = int(input())
    b = int(input())
    c = a - b
elif(x == 3):
    print("Multiplicacao: Digite 2 numeros")
    a = int(input())
    b = int(input())
    c = a * b
elif(x == 4):
    print("Divisao: Digite 2 numeros")
    a = int(input())
    b = int(input())
    c = a / b
elif(x == 5):
    print("Potencia: Digite 2 numeros")
    a = int(input())
    b = int(input())
    c = a ** b
elif(x == 6):
    print("Radiciacao: Digite 2 numeros")
    a = int(input())
    b = int(input())
    c = a ** (1 / b)
else:
    print("Sair")

print("Resultado:", c)


#exercicio 9: notas unisinos
a = float(input("Escreva a nota do grau A "))
b = float(input("Escreva a nota do grau B "))

if ((a + 2 * b) / 3 < 6):
    print("Você deverá fazer o grau C")
else:
    print("Você passou")


#exercicio 10: vogal ou consoante
x = input("Escreva uma letra ")

if (x == 'a' or x == 'e' or x == 'i' or x == 'o' or x == 'u'):
    print("Vogal")
else:
    print("Consoante")
