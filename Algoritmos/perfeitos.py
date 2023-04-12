# GA2 Gabriel Heyde e Nathalia Ferrari

while True:
    soma = 1
    x = int(
        input(
            "Digite um valor para verificar se ele é perfeito. Digite um numero negativo para sair."
        )
    )
    if x < 0:
        break
    for i in range(2, int(x / 2 + 1)):
        if x % i == 0:
            soma += i
    if soma == x:
        print("\nSeu numero é perfeito.\n")
    else:
        print("\nSeu numero não é perfeito.\n")
