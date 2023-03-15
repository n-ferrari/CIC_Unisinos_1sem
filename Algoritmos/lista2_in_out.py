#exercicio 1
nome = input("Escreva seu nome \n")

print (nome)


#exercicio 2
nome = input("Escreva seu nome \n")
idade = input("Escreva sua idade \n")

print (nome)
print (idade)


#exercicio 3
nome = input("Escreva seu nome \n")

print (nome)

altura = input("Escreva sua altura \n")

print (altura)
print ("Obrigado")


#exercicio 4
rua = input("Rua: \n")
cep = input("CEP: \n")
bairro =input("Bairro: \n")

print ("A rua e", rua, "o cep e", cep,"e o bairro e", bairro)


#exercicio 5
n = 0
soma = 0
produto = 1
while(n < 5):
    numero = int(input("Digite um numero \n"))
    soma = soma + numero
    produto = produto * numero
    n = n + 1

print("A soma e",soma)
print("O produto e",produto)


#exercicio 6
pi = 3.14159

print("Digite 5 numeros inteiros")
A = int(input())
B = int(input())
C = int(input())
D = int(input())
E = int(input())

area_triangulo = B * C / 2
perimetro_retangulo = A + B + C + D
area_circulo = pi * E * E

print("A area do triangulo e", area_triangulo)
print("O perimetro do retangulo e", perimetro_retangulo)
print("A area do circulo e ", area_circulo)


#exercicio 7
nota_trabalho = float(input("Qual a nota do trabalho? \n"))
nota_prova = float(input("Qual a nota da prova? \n"))
nota_teste = float(input("Qual a nota do teste? \n"))

nota_final = 0.1 * nota_trabalho + 0.6 * nota_prova + 0.3 * nota_teste

print("A nota final e", nota_final)


#exercicio 8
pratica_A = float(input("Qual a nota da atividade pratica do Grau A? \n"))
teorica_A = float(input("Qual a nota da atividade teorica do Grau A? \n"))
laboratorio_B = float(input("Qual a nota do laboratorio do Grau B? \n"))
teorico_B = float(input("Qual a nota do teste teorico do Grau B? \n"))
trabalho_B = float(input("Qual a nota do trabalho extraclasse do Grau B? \n"))

nota_final = 0.33 * (0.45 * pratica_A + 0.55 * teorica_A) + 0.67 * (0.60 * laboratorio_B + 0.2 * teorico_B + 0.2 * trabalho_B)
print("A nota final e", nota_final)