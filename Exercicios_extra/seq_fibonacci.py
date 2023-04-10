# Sequencia de Fibonacci
x = 1
y = 1

num = int(input("Digite um numero: "))

print(x)
print(y)

for i in range(1, num - 1):
    z = x + y
    print(z)
    x = y
    y = z

for i in range(1, num - 1):
    x, y = y, x + y
    print(y)


# fatorial
fac = 1
for i in range(2, num):
    fac = fac * i

print(num)


# fatorial com pilha
def fac(n):
    if n == 1:
        return 1
    return n * fac(n - 1)


print(fac(num))
