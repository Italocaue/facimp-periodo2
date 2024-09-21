try:
    numero = int(input("Digite um número: "))
except ValueError:
    print("Erro: Entrada inválida")
else:
    print("Nenhum erro ocorreu, o número é: ",numero)
finally:
    print("Este código sempre será executado")