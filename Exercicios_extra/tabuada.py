x = 1
y = 1

while x <= 10:
    while y <= 10:
        print(f"{x} x {y} = {x * y}")
        y += 1
    x += 1
    y = 1

for x in range(1, 11):
    for y in range(1, 11):
        print(f"{x} x {y} = {x * y}")    