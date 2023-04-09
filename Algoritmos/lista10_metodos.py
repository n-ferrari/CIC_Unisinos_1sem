# Exercício 1. Crie um programa em Python que possui os métodos abaixo:

# A) somaPositivos: recebe 2 inteiros por parâmetro X e Y e retorna a soma deles caso os dois forem positivos,
# ou retorna -1 caso um deles seja negativo.


def somaPositivos(x, y):
    if x >= 0 and y >= 0:
        return x + y
    else:
        return -1


# x = int(input())
# y = int(input())
# print(somaPositivos(x,y))


# B) divide: recebe 2 inteiros X e Y por parâmetro e retorna a divisão de X por Y, caso Y não seja 0. Se Y for 0,
# imprima uma mensagem de erro e retorne 0.
def divide(a, b):
    if b == 0:
        print("Erro")
        return 0
    else:
        return a / b


# x = int(input())
# y = int(input())
# resultado = divide(x,y)
# print(resultado)


# C) verificaTriangulo: recebe 3 inteiros X, Y e Z por parâmetro, que representam os lados de um triângulo.
# o método retorna um texto, de acordo com as características do triângulo: “escaleno”, “isósceles” ou “equilátero”.
def verifica_triangulo(x, y, z):
    if x == y == z:
        return "equilatero"
    elif x == y or x == z or x == z or y == z:
        return "isosceles"
    else:
        return "escaleno"


# x = int(input())
# y = int(input())
# z = int(input())
# print(verifica_triangulo(x,y,z))

# D) verificaIdade: recebe 1 inteiro por parâmetro, que representa uma idade. O método retorna um texto
# indicando a faixa etária correspondente desta idade, de acordo com o que segue:
# menor que 0: "erro, menor que zero"
# entre 0 (inclusive) e 12 (inclusive): "criança"
# entre 13 (inclusive) e 18 (inclusive): "adolescente"
# entre 19 (inclusive) e 120 (inclusive): "adulto"
# maior que 120: "erro, maior que 120"


def verificaIdade(idade):
    if idade < 0:
        return "erro, menor que zero"
    elif idade <= 12:
        return "criança"
    elif idade <= 18:
        return "adolescente"
    elif idade <= 120:
        return "adulto"
    else:
        return "erro, maior que 120"


# print(verificaIdade(int(input())))


# E) sinaleira: recebe como parâmetro uma string que representa uma cor, e imprime na tela uma string com a situação da
# sinaleira ("aberta", "fechada", "atenção" ou "erro").
def sinaleira(cor):
    if cor == "amarelo":
        return "atenção"
    elif cor == "vermelho":
        return "fechada"
    elif cor == "verde":
        return "aberta"
    else:
        return "erro"


# print(sinaleira(input()))

# F) contador: recebe por parâmetro um inteiro X e imprime na tela os valores de X até 300, um por um.


def contador(x):
    if x > 300:
        print("erro")
    else:
        print("\nResultado:")
        for i in range(x, 301):
            print(i)


# contador(int(input()))

# G) verificaPrimo: recebe por parâmetro um inteiro X e retorna true (verdadeiro) caso X seja primo e false (falso) caso não seja.


def verificaPrimo(x):
    if x < 0:
        return False
    else:
        for i in range(x - 1, 1, -1):
            if x % i == 0:
                return False
    return True


# print(verificaPrimo(int(input())))

# H) achaMaior: recebe por parâmetro 3 inteiros X,Y e Z e imprime na tela o maior deles.


def achaMaior(x, y, z):
    maior = x
    if y > maior:
        maior = y
    if z > maior:
        maior = z
    print("Resultado:", maior)


# achaMaior(int(input()),int(input()),int(input()))


# I) imprimePares: recebe por parâmetro 1 inteiro X e imprime os pares de 0 até X.
def imprimePares(x):
    print("Resultado")
    for i in range(x + 1):
        if i % 2 == 0:
            print(i)


# imprimePares(int(input()))

# Exercício 2. Depois da criação dos métodos do Exercício 1, seu programa deve imprimir na tela um menu, com opções de 1 a 9,
# da seguinte forma:
# Solicite ao usuário que ele digite o número da opção desejada. De acordo com o que ele digitar, chame o método correspondente
# para realizar a ação. Os parâmetros dos métodos DEVEM SER LIDOS DO TECLADO.
# Após uma opção ser executada, o programa deve voltar ao menu de opções novamente.
# O programa só acaba quando o usuário digitar uma opção inválida.

while True:
    print("\nEscolha uma opção: ")
    print("1: Soma positivos ")
    print("2: Divide ")
    print("3: Verifica triângulo ")
    print("4: Verifica idade ")
    print("5: Sinaleira")
    print("6: Conta até 300 ")
    print("7: Verifica primo")
    print("8: Acha maior")
    print("9: Imprime pares")
    opcao = int(input())
    if opcao == 1:
        print("\nDigite 2 numeros: ")
        print("Resultado:", somaPositivos(int(input()), int(input())))
    elif opcao == 2:
        print("\nDigite 2 numeros: ")
        print("Resultado:", divide(int(input()), int(input())))
    elif opcao == 3:
        print("\nDigite 3 numeros: ")
        print(
            "Resultado:", verifica_triangulo(int(input()), int(input()), int(input()))
        )
    elif opcao == 4:
        print("\nDigite a idade: ")
        print("Resultado:", verificaIdade(int(input())))
    elif opcao == 5:
        print("\nDigite verde, amarelo ou vermelho: ")
        print("Resultado:", sinaleira(input()))
    elif opcao == 6:
        print("\nDigite um numero: ")
        contador(int(input()))
    elif opcao == 7:
        print(
            "\nDigite um numero. A funcao retorna True para primo e False para não primo"
        )
        print(verificaPrimo(int(input())))
    elif opcao == 8:
        print("\nDigite 3 numeros: ")
        achaMaior(int(input()), int(input()), int(input()))
    elif opcao == 9:
        print("\nDigite um numero: ")
        imprimePares(int(input()))
    else:
        break
