import math

x1 = int(input("Enter coordinate x1:" ))
y1 = int(input("Enter coordinate y1:" ))
x2 = int(input("Enter coordinate x2:" ))
y2 = int(input("Enter coordinate y2:" ))

z = math.sqrt(pow((x2 - x1) , 2) + pow((y2 - y1) , 2))
print(z)