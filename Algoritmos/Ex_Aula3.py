#Operacoes matematicas
'''
A = float(input())
B = int(input())

print("A multiplicado por B é", A * B)
print("A dividido por B é", A / B, "mas com duas casas decimais é %.2f" % (A / B))
print("A mais B é", A + B, "e A menos B é", A - B)
print("A elevado a B é", A ** B)
'''

#Formula de baskara
a = int(input("Valor de a: "))
b = int(input("Valor de b: "))
c = int(input("Valor de c: "))

delta = (b ** 2) - 4 * a * c

if (delta > 0):
    x1 = (-b + (delta ** (1 / 2))) / (2 * a)
    x2 = (-b - (delta ** (1 / 2))) / (2 * a)
    print("x1 é", x1 ,"e x2 é",x2)
else:
    print("delta fora de domínio")