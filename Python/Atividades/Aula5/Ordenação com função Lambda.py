lista_de_nomes = ["Alice", "bob", "Charlie", "David"]
lista_de_nomes_ordenada = sorted(lista_de_nomes, key=lambda nome: len(nome))
#Resultado: ["Bob", "Alice", "David", "Charlie"]
print(lista_de_nomes_ordenada)