
# #exercicio1: digita o nome de 13 pessoas
# n = 0

# while n < 13:
#     input("Nome ")


# #exercicio2: imprime os números de 0 a 1000
# n = 0
# while n <= 1000:
#     print(n)
#     n = n + 1

# #exercicio3: imprime os números pares de 0 a 2000
# n = 0

# while n <= 2000:
#     if n % 2 == 0:
#         print(n)
#     n = n + 1    

# #exercicio4: imprime os números de 0 a 1000 em ordem decrescente (ou seja, de 1000 a 0)
# n = 1000
# while n >= 0:
#     print(n)
#     n = n - 1

# #exercicio5:Crie um programa que solicita o time de 10 usuários pelo teclado. Ao final, imprima quantos torcedores torcem para o Grêmio.
# n = 0
# count = 0

# while n < 10:
#     x = input("Qual seu time?")
#     if x.lower() == "gremio" or x.lower() == "grêmio":
#         count = count + 1
#     n = n + 1
# print(count, "pessoas torcem para o Gremio.")

# # Exercício 6. Crie um programa que pede para o usuário digitar 20 números com ponto flutuante pelo teclado. 
# # Ao final, seu programa deve imprimir todos os números digitados. Dica: armazene-os em uma string e concatene os valores digitados.
# # No final, imprima a string.
# n = 0
# x = ""

# while n < 20:
#     x = x + input("Digite um numero com ponto flutuante ") + " "
#     n = n + 1
# print(x)



# Exercício 7. Crie um programa que solicita para o usuário que ele digite 10 valores inteiros. 
#Ao final, imprima a soma de todos os valores digitados. 
# soma = 0
# n = 0

# print("Digite 10 numeros inteiros: ")

# while n < 10:
#     soma = soma + int (input())
#     n = n + 1

# print("A soma dos numeros é:", soma)

# Exercício 8. Crie um programa que pergunta para o usuário (via Teclado) quantos números ele irá digitar e armazena em uma variável 
# chamada quant. Logo após, faça com que o usuário digite quant números inteiros, e para cada número digitado imprima na tela 
# se o número é negativo, positivo ou zero.

# quant = int(input("Quantos numeros inteiros voce quer testar?"))

# while quant > 0:
#     x = int(input("Digite um numero: "))
#     if x > 0:
#         print("positivo")
#     elif x < 0:
#         print("negativo")
#     else:
#         print("zero")
#     quant = quant - 1

# Exercício 9. Crie um programa que pede para o usuário digitar 2 valores inteiros via Teclado (val1 e val2). 
# Se nenhum dos valores for negativo, escreva os números pares entre o menor e o maior valor.
val1 = int(input("Digite valor 1 "))
val2 = int(input("Digite valor 2 "))
maior = 0
menor = 0

if val1 >= 0 and val2 >= 0:

    if val1 > val2: #verifica qual o maior valor
        maior = val1
        menor = val2
    elif val2 > val1:
        maior = val2
        menor = val1
    else:
        print("Val 1 e Val2 sao iguais")
    
    if maior % 2 != 0: #verifica se maior é impar ou par e ajusta para o par anterior
        maior = maior - 1
    else:
        maior = maior - 2

    print("Os numeros pares entre os dois valores sao:")
    while (maior > menor): #imprime os pares entre eles
        print(maior)
        maior = maior - 2
else:
    print("Erro: valor negativo")

                 


# Exercício 10. Crie um programa que faça a soma dos valores de 0 até 198.

# Exercício 11. Crie um programa que imprima a soma dos valores pares e a soma dos valores ímpares entre dois números quaisquer digitados pelo usuário.

# Exercício 12. Crie um programa que pede para o usuário digitar números positivos via Teclado. Quando o usuário digitar um número negativo, informe a média de todos os números que ele informou.

# Exercício 13. Crie um programa que calcule o fatorial de um número informado pelo usuário (não permita números negativos).

# Exercício 14. Crie um programa que diga se o número informado pelo usuário é primo ou não.

# Exercício 15. Crie um programa que imprime os números primos entre 0 e 200, imprimindo ao final a soma destes números.