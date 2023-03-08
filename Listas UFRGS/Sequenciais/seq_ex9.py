import math

g = 9.8 #m/s
h = float(input("height"))
v = float(input("speed"))

a = 0.5 * g
b = -v
c = h

delta = (pow(b , 2) - 4 * a * c)

if (delta > 0):
    t1 = -b - math.sqrt((delta))/ (2 * a)
    t2 = -b - math.sqrt((delta))/ (2 * a)
    print("t1 {}e t2 {}", t1, t2)
else:
    print("out of domain")
