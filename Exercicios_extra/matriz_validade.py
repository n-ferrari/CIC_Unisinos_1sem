# Verifies if 2 matrices are multipliable and multiply them

def matrix_is_valid(x):
    s1 = len(x[1])

    for n in x:
        s2 = len(n)
        if s1 != s2:
            return False
    return True

def get_column(M,i):
    lista = []
    for line in range(len(M)):
        lista.append(M[line][i])
    return lista

def matrices_are_multipliable(x, y):
    return len(x[1]) == len(y)

def sum_product(x, y):
    result = 0
    for value in range(len(x)):
        result = result + x[value] * y[value]
    return result

def multiply_matrix(x, y):
    out_list = []
    for line in range(len(x)):
        inner_list = []
        for column in range(len(y[0])):
            list_column = get_column(y,column)
            inner_list.append(sum_product(x[line],list_column))
        out_list.append(inner_list)
    return(out_list)


x = [[1,2,3], [4,5,6]]
y = [[1,1,1], [2,2,2],[3,3,3]]
result = []

if not matrix_is_valid(x) or not matrix_is_valid(y):
    print("Matrices are not valid")
elif not matrices_are_multipliable(x, y):
    print("Matrices are not multipliable")
else:
    result = multiply_matrix(x,y)
    print(result)


