# def matrix_is_valid(x):
#     s1 = len(x[1])

#     for n in x:
#         s2 = len(n)
#         if s1 != s2:
#             return False
#     return True

# def matrixes_are_multiplicable(x, y):
#     return len(x[1]) == len(y)

x = [[1,1,1], [2,2,2], [1,2,3], [1,2,3]]
y = [[1,1,1,1], [2,2,2,2], [1,2,3,4]]
z = [[1,1,1], [1,1,1], [1,1,1]]
value = 0

# if not matrix_is_valid(x) or not matrix_is_valid(y):
#     print("As matrizes nao sao validas")
# elif not matrixes_are_multiplicable(x, y):
#     print("As matrizes nao sao multiplicaveis")
# else:
#     for m in x[0][m]:
#         print(m)

for line in range(len(x[0])):
    for column in range(len(y)):
        value = value + x[line][column] * y[line][column] 
#print(x[0][0])