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


# Exercício 11: Passe todos os exercícios que você fez da lista de exercícios de if/else para métodos, 
# recebendo os parâmetros necessários para que o exercício seja realizado corretamente.

# exercicio 1: par ou impar
def par_impar(a):
    resto = a % 2

    if(resto == 0):
        print("O numero e par")
    else:
        print("O numero e impar")

par_impar(10)

#exercicio 2: retorna maior valor entre 2
def maior (x,y):
    if (x == y):
        print("Os valores sao iguais")
    elif (x > y):
        print ("O primeiro numero", x ,"e maior que o segundo", y)
    else:
        print("O segundo numero", y ,"e maior que o primeiro", x)

maior(9,4)

#exercicio 3: programa que impede divisao por zero

def div_zero(a,b):
    if (b == 0):
        print("b nao pode ser 0")
    else:
        print(a / b)

div_zero(1,0)

#exercicio 4: recebe tres numeros e retorna o menor

def menor(a,b,c):
    if (a < b and a < c):
            return a
    elif (b < a and b < c):
            return b
    elif (c < a and c < b):
            return c
    else:
        return "Não há número menor"

menor = menor(1,1,1)
print(menor)

#exercicio 5 classificacao de preco
def classificacao_preco(preco):
    if (preco <= 0):
        print("Preco inválido")
    elif (preco <= 30):
        print("Preco baixo")
    elif (preco <= 50):
        print("Preco medio")
    else:
        print("Preco alto")

classificacao_preco(float(input("Digite um preco ")))

#exercicio6: aumento de preco
def aumento_de_preco(preco):

    if (preco < 0):
        print("Valor negativo")
        erro += 1
    elif(preco < 100):
        return preco * 1.1
    elif (preco < 300):
        return preco * 1.2
    elif (preco < 1000):
        return preco * 1.5
    else:
        return "Invalido: valor maior que 1000"

novo_preco = aumento_de_preco(float(input("Digite um preco: ")))
print(novo_preco)

#exercicio 7: anos bissextos
def anos_bissextos(ano):
    if (ano % 4 == 0):
        if (ano % 100 != 0 or ano % 400 == 0):
            print("O ano é bissexto")
        else:
            print("O ano nao e bissexto")
    else:
        print("O ano não é bissexto")

anos_bissextos(int(input("Informe um ano ")))

#exercico 8: calculadora
def calculadora():
    print("Digite 1 para somar dois valores")
    print("Digite 2 para subtrair dois valores")
    print("Digite 3 para multiplicar dois valores")
    print("Digite 4 para dividir dois valores")
    print("Digite 5 para realizar uma potência entre dois valores")
    print("Digite 6 para realizar uma radiciação entre dois valores")
    print("Digite qualquer outro número para sair")

    x = int(input())
    c = None

    if(x == 1):
        print("Soma: Digite 2 numeros")
        a = int(input())
        b = int(input())
        c = a + b
    elif(x == 2):
        print("Subtracao: Digite 2 numeros")
        a = int(input())
        b = int(input())
        c = a - b
    elif(x == 3):
        print("Multiplicacao: Digite 2 numeros")
        a = int(input())
        b = int(input())
        c = a * b
    elif(x == 4):
        print("Divisao: Digite 2 numeros")
        a = int(input())
        b = int(input())
        c = a / b
    elif(x == 5):
        print("Potencia: Digite 2 numeros")
        a = int(input())
        b = int(input())
        c = a ** b
    elif(x == 6):
        print("Radiciacao: Digite 2 numeros")
        a = int(input())
        b = int(input())
        c = a ** (1 / b)
    else:
        print("Sair")

    print("Resultado:", c)

calculadora()

#exercicio 9: notas unisinos

def nota(a,b):
    if ((a + 2 * b) / 3 < 6):
        print("Você deverá fazer o grau C")
    else:
        print("Você passou")

a = float(input("Escreva a nota do grau A "))
b = float(input("Escreva a nota do grau B "))
nota(a,b)


#exercicio 10: vogal ou consoante

def vogal(x):
    if (x == 'a' or x == 'e' or x == 'i' or x == 'o' or x == 'u'):
        print("Vogal")
    else:
        print("Consoante")

vogal(input("Escreva uma letra "))

# Exercício 12: Passe todos os exercícios que você fez da lista de exercícios de for para métodos, recebendo os parâmetros 
# necessários para que o exercício seja realizado corretamente.


# Exercício 1
# Crie um programa imprime na tela os valores de 1 a 100 (incluindo o 1 e o 100).  
def print_1_100(x,y):
    for i in range(x,y+1):
        print(i)

# Exercício 2
# Crie um programa que imprime na tela todos os valores entre dois valores digitados pelo teclado.
def print_entre_dois_val(x,y):
    menor = 0
    maior = 0

    if x > y:
        maior = x
        menor = y
    elif x < y:
        maior = y
        menor = x
    else:
        print("Os numeros sao iguais")

    if maior !=0 and menor !=0:
        for i in range(menor + 1,maior):
            print(i)

x = int(input("Digite um numero: "))
y = int(input("Digite outro numero: "))

print_entre_dois_val(10,15)

# Exercício 3
# # Crie um programa que imprime a tabuada de um número qualquer digitado pelo usuário.
def tabuada(x):
    print("A tabuada de",x,"é: ")
    for i in range(0,11):
        print(x,"x", i ,"=",x * i)

tabuada(int(input("Digite um numero: ")))

# Exercício 4
# Sabendo que uma string é uma lista de letras, peça para o usuário digitar um texto e imprima na tela a quantidade de vogais que existem no texto.

def quant_vogais(texto):
    vogais = 0
    for i in texto:
        if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
            vogais += 1
    print("O texto possui",vogais,"vogais.")

quant_vogais(input("Digite um texto: "))

# Exercício 5
# Crie um programa que permita que o usuário crie sua lista de compras. Primeiramente, solicite que ele informe quantos produtos serão adicionados na lista. 
#Depois disto, peça para que o usuário digite os produtos que ele vai comprar, e armazene em uma lista. 
#Ao final, imprima a lista de compras do usuário.
def lista_compras():
    quant_produtos = int(input("Quantos produtos serão adicionados na lista? "))
    lista = []

    for i in range(0,quant_produtos):
        lista.append(input("Digite o produto:"))

    print("\nA lista de compras é: ")
    for i in lista:
        print(i)

lista_compras()

# Exercício 6
# Crie um programa que solicita o nome e o estado civil de 20 pessoas pelo teclado. 
# Ao final, imprima apenas o nome das pessoas separadas por estado civil: solteiras, casadas, divorciadas e viúvas (nesta ordem!)

def estado_civil():
    solteiro = []
    casado =[]
    viuvo = []
    divorciado = []
    num_pessoas = 4

    for i in range(0, num_pessoas):
        nome = input("Digite o nome: ")
        estado_civil = (input("Digite o estado civil (Solteiro, Casado, Divorciado ou Viuvo): "))
        if estado_civil == "Solteiro" or estado_civil == "solteiro" or estado_civil == "solteira" or estado_civil == "Solteira":
            solteiro.append(nome)
        elif estado_civil == "Casado" or estado_civil == "casado" or estado_civil == "casada" or estado_civil == "Casada":
            casado.append(nome)
        elif estado_civil == "Divorciado" or estado_civil == "divorciado" or estado_civil == "divorciada" or estado_civil == "Divorciada":
            divorciado.append(nome)
        elif estado_civil == "Viúvo" or estado_civil == "Viuvo" or estado_civil == "Viúva" or estado_civil == "Viuva" or estado_civil == "viúvo" or estado_civil == "viuvo" or estado_civil == "viúva" or estado_civil == "viuva":
            viuvo.append(nome)

    print("\nPessoas em ordem de Estado Civil: Solteiros, casados, divorciados e viúvos:")
    for i in solteiro:
        print(i)
    for i in casado:
        print(i)
    for i in divorciado:
        print(i)
    for i in viuvo:
        print(i)
        
estado_civil()



#Exercício 7
# Crie um programa que solicita ao usuário que ele defina sua senha. 
# A senha deve ser um texto (string) composto apenas por dígitos e deve ter entre 5 e 10 valores. 
# O usuário tem apenas 6 chances de definir corretamente a senha. 
# Caso ele defina corretamente a senha nas tentativas que ele tem, imprima uma mensagem de sucesso. 
# Caso ele não defina a senha corretamente, imprima uma mensagem de insucesso. 
# Dica: na aula aprendemos a ver se uma string é formada apenas por dígitos e aprendemos a descobrir o tamanho do texto digitado.

def senha():
    chances = 0

    while chances < 6:
        senha = input("Senha: ")
        valores = 0
        digitos = True

        for i in senha:
            valores += 1
            if i not in ('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'):
                digitos = False

        if digitos == True and valores >=5 and valores <= 10: 
            print("A senha esta correta")
            return senha
        chances += 1

    if chances == 6:
        print("Numero de tentativas excedido")

senha = senha()

# Exercício 8
# Crie um programa que separa o joio do trigo. Seu programa deve ler a lista abaixo e criar duas listas diferentes: 
# uma com todas as ocorrências da palavra "joio" e outra com todas as ocorrências da palavra "trigo". 
# Ao final, imprima as listas separadas. Copie e cole a linha abaixo no seu código e complete o programa:

def joio_trigo(lista):
    joio = []
    trigo = []

    for i in lista:
        if i == "joio":
            joio.append(i)
        else:
            trigo.append(i)

    print("\nLista joio: ")
    for i in joio:
        print(i)

    print("\nLista trigo: ")
    for i in trigo:
        print(i)

joio_trigo(["joio", "trigo", "trigo", "joio", "trigo", "joio", "joio", "joio", "joio", "trigo", "trigo", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "joio", "trigo", "joio", "joio", "joio"])
