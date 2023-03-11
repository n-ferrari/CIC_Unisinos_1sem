seller = input("number of the seller: ")
salary = float(input("salary: "))
sells = float(input("value in sells: "))
percentage = float(input ("percentage over sells:"))

print("the total salary of the seller", seller, "is ", salary + sells * percentage/100)