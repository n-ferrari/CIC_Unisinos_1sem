# GA2 Gabriel Heyde e Nathalia Ferrari
x = "S"
while x == "S":
    soma = 0
    anterior = 0
    iguais = 1
    crescente = True

    num = int(
        input("Digite a quantidade de índices de audiência que serão digitados: ")
    )
    i = 1
    while i < num + 1:
        while True:
            indice = float(input(f"Índice {i}: "))
            if indice > 0:
                break
            print("Digite um valor positivo: ")
        if indice == anterior:
            iguais += 1
        if indice < anterior:
            crescente = False
        anterior = indice
        soma += indice
        i += 1

    if iguais == num:
        print("AUDIENCIA CONSTANTE. Média de audiência: %.1f" % (soma / num))
    elif crescente == True:
        print("AUDIENCIA SEMPRE CRESCENTE. Média de audiência: %.1f" % (soma / num))
    else:
        print("AUDIENCIA NEM SEMPRE CRESCENTE. Média de audiência: %.1f" % (soma / num))

    x = input("Deseja continuar? (S / N) ")
    while x != "S" and x != "N":
        x = input("Deseja continuar? (S / N) ")
