# Exercício 1: Crie um método chamado imprimeValor, que recebe um valor qualquer por parâmetro e imprime-o na tela. 
def imprimeValor(x):
    print(x)


# Exercício 2: Crie um método chamado somaValores que recebe dois valores por parâmetro e imprime na tela a soma dos dois valores.
def somaValores(x, y):
    print(x + y)


# Exercício 3: Crie um método que recebe dois valores val1 e val2 (assuma que serão inteiros). 
# O método deve retornar verdadeiro se val1 for divisível por val2 e falso caso contrário.
def divisivel(val1, val2):
    if val1 % val2 == 0:
        return True
    else:
        return False
    


# Exercício 4: Crie um método chamado maiorValor que recebe 3 valores por parâmetro (assuma que serão inteiros) e 
# retorna o maior dos três valores.
def maior(x, y ,z):
    maior = x
    if y > maior:
        maior = y
    if z > maior:
        maior = z
    return maior

# Exercício 5: Crie um método que recebe um valor por parâmetro (assuma que será inteiro) e retorna a soma de todos os 
# valores entre 0 e o valor recebido. Caso o valor seja negativo, o método deve retornar -1.

def soma_anteriores(x):
    soma = 0
    if x >= 0:
        for i in range(x+1):
            soma += i
    else:
        return -1
    return soma

    
# Exercício 6: Crie um método que recebe um valor por parâmetro (assuma que será uma string) e retorna a quantidade de letras 
# que existem neste texto.
def qnt_letras(x):
    letras = 0
    for i in x:
        letras +=1
    return letras

# Exercício 7: Crie um método que recebe uma lista por parâmetro e imprime os elementos da lista recebida.
def print_elements(x):
    for i in x:
        print(i)


# Exercício 8: Crie um método que recebe uma lista por parâmetro (assuma que será uma lista de string) e retorna a menor string 
# da lista (com menos caracteres).
def menor_string(lista_strings):
    menor = None
    tamanho = 100

    for palavra in lista_strings:
        tamanho_palavra = 0
        for _ in palavra:
            tamanho_palavra +=1
        if tamanho_palavra < tamanho:
            menor = palavra
            tamanho = tamanho_palavra
    return menor





# Exercício 9: Crie um método que recebe dois parâmetros, que serão um inteiro N e uma string S (nesta ordem). 
# O método deve imprimir na tela N vezes a string S.
def imprime_N_vezes(N, S):
    for i in range(N):
        print(S)



# Exercício 10: Depois dos métodos criados, chame todos os métodos acima, passando os parâmetros correspondentes e 
# SEMPRE SOLICITANDO OS PARÂMETROS PELO TECLADO, imprimindo na tela o retorno (para os que retornam algum valor).

# 1
imprimeValor(input("Digite um valor para imprimir "))

# 2
somaValores(int(input("Digite dois valores para soma ")), int(input()))

# 3
print(divisivel(int(input("Digite dois valores para divisao, a funcao retorna True se eles forem divisiveis ")), int(input())))

# 4
print("Digite 3 valores. A funcao retorna o maior")
print(maior(int(input()),int(input()),int(input())))

# 5
print(soma_anteriores(int(input("Digite um valor, a funcao retorna a soma dos valores anteriores e o valor digitado incluso"))))

# 6
print(qnt_letras(input("Retorna quantidade de letras de uma palavra ")))

# 7
lista = []
n = 1
print("Digite elementos para impressao na tela ou vazio para sair")
while n > 0:
    elemento = input()
    lista.append(elemento)
    n = len(elemento)

print_elements(lista)

# 8
n = 1
lista = []
print("Esta funcao retorna a menor palavra. Digite palavras ou vazio para sair")
while n > 0:
    palavra = input()
    n = len(palavra)
    if n > 0:
        lista.append(palavra)

print(menor_string(lista))

# 9
imprime_N_vezes(int(input("Digite a quantidade de vezes que uma palavra devera ser impressa na tela, e a palavra ")), input())


# Exercício 11: Passe todos os exercícios que você fez da lista de exercícios de if/else para métodos, recebendo os parâmetros necessários para que o exercício seja realizado corretamente.


# Exercício 12: Passe todos os exercícios que você fez da lista de exercícios de for para métodos, recebendo os parâmetros necessários para que o exercício seja realizado corretamente.