# Programa da musica dos patinhos da Xuxa
#Gabriel Heyde e Nathalia Ferrari - Trabalho Algoritmos Unisinos 2023
P = 0

# Garante que o numero de patinhos seja >= 2
while P < 2:
    P = int(input("Digite o numero de patinhos maior que 1: "))

print("")
num_patinhos = P

# Imprime estrofes ate sobrarem 2 patinhos
while P > 2:
    print(P,"patinhos \nForam passear\nAlém das montanhas \nPara brincar\nA mamãe gritou\nQuack quack quack\nMas só",P - 1 ,"patinhos\nVoltaram de lá\n")
    P -= 1

# Imprime as ultimas 3 estrofes que sao diferentes
print("2 patinhos\nForam passear\nAlém das montanhas \nPara brincar\nA mamãe gritou\nQuack quack quack\nMas só 1 patinho\nVoltou de lá\n")

print("1 patinho foi passear\nAlém das montanhas \nPara brincar\nA mamãe gritou\nQuack quack quack\nMas nenhum patinho\nVoltou de lá\n")

print("A mamãe patinha\nFoi procurar\nAlém das montanhas\nNa beira do mar\nA mamãe gritou\nQuack quack quack\nE os",num_patinhos,"patinhos\nVoltaram de lá")