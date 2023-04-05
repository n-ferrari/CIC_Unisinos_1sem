# Exercício 1: Crie um método que recebe um inteiro X por parâmetro e imprime os valores de 1 até X (inclusive).
def print_1_to_x(num):
    for i in range(1,num+1):
        print(i)

print_1_to_x(10)


# Exercício 2: Crie um método que recebe 3 notas por parâmetro e retorna o conceito atingido pela média aritmética das notas. 
# Os conceitos são:

# - entre 0.0 e 4.0 (inclusive): conceito "D"
# - entre 4.0 (não incluído) e 7.0 (inclusive): conceito "C"
# - entre 7.0 (não incluído) e 9.0 (inclusive): conceito "B"
# - entre 9.0 (não incluído) e 10.0 (inclusive): conceito "A"

# Caso alguma das notas digitadas seja negativa, retorne o texto "ERRO"

def nota(nota1,nota2,nota3):
    if nota1 < 0 or nota2 < 0 or nota3 < 0:
        return "ERROR"
    
    nota_final = (nota1 + nota2 + nota3) / 3
    if nota_final <= 4:
        return 'D'
    elif nota_final <=7:
        return 'C'
    elif nota_final <= 9:
        return 'B'
    else:
        return 'A'

print(nota(9,9,10))

# Exercício 3: Crie um método que recebe um inteiro por parâmetro e retorna verdadeiro caso seja um valor primo e falso caso contrário. 
# Caso o parâmetro seja negativo o método deve retornar falso.

def primo(x):
    if x < 0:
        return False
    else:
        for i in range(x-1,1,-1):
            if x % i == 0:
                return False  
    return True

print(primo(int(input())))