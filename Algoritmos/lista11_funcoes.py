def verificaTriangulo(a, b, c):
    if abs(b - c) < a < (b + c) or abs(a - c) < b < (a + c) or abs(a - b) < c < (a + b):
        if a == b == c:
            print("equilatero")
        elif a == b or a == c or b == c:
            print("isosceles")
        else:
            print("escaleno")
    else:
        print("O triangulo nao e valido")


def bhaskara(a, b, c):
    while True:
        if a != 0:
            delta = (b**2) - 4 * a * c
            if delta == 0:
                print("A equacao possui apenas uma raiz real: ", -b / (2 * a))
            elif delta > 0:
                x1 = (-b + (delta ** (1 / 2))) / (2 * a)
                x2 = (-b - (delta ** (1 / 2))) / (2 * a)
                print("x1 é", x1, "e x2 é", x2)
            else:
                print("delta fora de domínio")
            break
        else:
            a = int(input("Digite um valor para a diferente de zero."))


def confereData(ano, mes, dia):
    print(ano, mes, dia)


def tamanhoTexto(texto):
    print(texto)


def analisaCPF(cpf):
    print(cpf)


def contaCaracteres(texto):
    print(texto)


tentativas = 0

while tentativas < 5:
    print("\nOlá Fulano.")
    print("Digite a opção desejada:")
    print("1) Verificar triângulo")
    print("2) Calcular equação do segundo grau")
    print("3) Conferir data")
    print("4) Verificar tamanho do texto")
    print("5) Analisar CPF")
    print("6) Contar caracteres")
    print("7) Sair\n")

    opcao = int(input())
    if 1 <= opcao <= 7:
        if opcao == 1:
            print("Digite as 3 dimensoes do triangulo ")
            verificaTriangulo(int(input()), int(input()), int(input()))
        elif opcao == 2:
            print("Digite a, b e c ")
            bhaskara(int(input()), int(input()), int(input()))
        elif opcao == 3:
            print("Digite ano, mês e dia ")
            confereData(int(input()), int(input()), int(input()))
        elif opcao == 4:
            print("Digite um texto ")
            tamanhoTexto(input())
        elif opcao == 5:
            print("Escreva um cpf ")
            analisaCPF(input())
        elif opcao == 6:
            print("Digite um texto ")
            contaCaracteres(input())
        else:
            print("Obrigado por utilizar nosso sistema.")
            break
    else:
        print("Opcao invalida")
        tentativas += 1

if tentativas >= 5:
    print("Parece que você não está entendendo o funcionamento do sistema. Até mais.")
