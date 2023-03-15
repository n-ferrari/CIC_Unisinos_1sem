
# #exercicio1: digita o nome de 13 pessoas
# n = 0

# while n < 13:
#     input("Nome ",n)


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

#exercicio5:Crie um programa que solicita o time de 10 usuários pelo teclado. Ao final, imprima quantos torcedores torcem para o Grêmio.
n = 0
count = 0

while n < 10:
    x = input("Qual seu time?")
    if x.lower() == "gremio" or x.lower() == "grêmio":
        count = count + 1
    n = n + 1
print(count, "pessoas torcem para o Gremio.")