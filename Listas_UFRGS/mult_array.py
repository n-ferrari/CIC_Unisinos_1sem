import time
import matplotlib.pyplot as plt

def calculate_time(list_size):
    list_input = list(range(1,list_size))
    output = []

    start = time.time()

    # method n^2
    for i in range(len(list_input)):
        result = 1
        for j in range(len(list_input)):
            if i != j:
                result = result + list_input[j]
        output.append(result)

    t1 = time.time() - start

    start = time.time()

    # method 2n
    result = 1
    output1 = []
    for number in list_input:
        if number != 0:
            result = result + number

    for number in list_input:
        output1.append(int(result - number))
        
    t2 = time.time() - start

    assert output == output1

    return t1, t2

list1 = []
list2 = []
r = range(1,1000,100)

for i in r:
    t1, t2 = calculate_time(i)
    list1.append(t1)
    list2.append(t2)

plt.plot(r,list1)
plt.plot(r,list2)

plt.show()