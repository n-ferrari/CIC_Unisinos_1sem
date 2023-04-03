# Exercício 6
# Crie um programa que solicita o nome e o estado civil de 20 pessoas pelo teclado. 
# Ao final, imprima apenas o nome das pessoas separadas por estado civil: solteiras, casadas, divorciadas e viúvas (nesta ordem!)

class Person:
    def __init__(self, name, civil_status):
        self.name = name
        self.civil_status = civil_status

    def __str__(self):
        return f'{self.name} {self.civil_status}'

solteiro = []
casado =[]
divorciado = []
viuvo = []
num_pessoas = 4

for i in range(0, num_pessoas):
    name = input("Digite o nome da pessoa ")
    civil_status =  input("Digite o estado civil ")

    person = Person(name,civil_status)

    if person.civil_status == "Solteiro":
        solteiro.append(person.name)

