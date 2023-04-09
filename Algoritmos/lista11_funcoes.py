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


def confereData():
    dia = int(input("Digite o dia: "))
    while dia < 1 or dia > 31:
        dia = int(input("Digite um dia válido: "))

    mes = int(input("Digite o mês: "))
    while mes < 1 or mes > 12:
        mes = int(input("Digite um mês válido: "))

    ano = int(input("Digite um ano entre 0 e 2022:"))
    while ano < 0 or ano > 2022:
        ano = int(input("Digite um ano valido: "))

    print(f"\nData escolhida: {dia}/{mes}/{ano} ")

    if mes == 4 or mes == 6 or mes == 9 or mes == 11 and dia == 31:
        print("Data inválida. Dia 31 não existe neste mês.")
        return 1

    if mes == 2:
        if dia > 29:
            print("Data inválida, fevereiro com mais de 29 dias.")
            return 1
        elif dia == 29:
            if not (ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0):
                print("Data inválida. O ano nao e bissexto")
                return 1

    print(f"\nA data escolhida: {dia}/{mes}/{ano} é correta.\n")


def tamanhoTexto():
    tamanho = 21
    while tamanho > 20:
        texto = input("Digite um texto: ")
        tamanho = len(texto)
        if tamanho > 20:
            print("Texto inválido. Digite um texto com até 20 caracteres")

    if tamanho < 5:
        print("Texto pequeno")
    elif tamanho < 15:
        print("Texto médio")
    else:
        print("Texto grande")


def analisaCPF():
    cpf = "0"
    tentativas = 0
    while ((not cpf.isdigit()) or len(cpf) != 11) and tentativas < 3:
        cpf = input("Digite seu cpf: ")
        if (not cpf.isdigit()) or len(cpf) != 11:
            print("cpf inválido.")
        else:
            print("cpf válido")
        tentativas += 1
    if tentativas == 3:
        print("\nNumero maximo de tentativas excedido.")


def contaCaracteres():
    vogais = 0
    lista_vogais = ["a", "e", "i", "o", "u"]
    espacos = 0
    consoantes_especiais = 0

    texto = input("Digite um texto: ")

    for i in lista_vogais:
        vogais += texto.count(i)

    espacos = texto.count(" ")

    consoantes_especiais = len(texto) - vogais - espacos

    print(
        f"\nA quantidade de vogais no texto e {vogais}, a de espaços é {espacos} e a de consoantes ou caracteres especiais é de {consoantes_especiais}"
    )


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
            confereData()
        elif opcao == 4:
            tamanhoTexto()
        elif opcao == 5:
            analisaCPF()
        elif opcao == 6:
            contaCaracteres()
        else:
            print("Obrigado por utilizar nosso sistema.")
            break
    else:
        print("Opcao invalida")
        tentativas += 1

if tentativas >= 5:
    print("Parece que você não está entendendo o funcionamento do sistema. Até mais.")
