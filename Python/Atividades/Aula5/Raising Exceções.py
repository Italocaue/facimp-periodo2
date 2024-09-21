def dividir(x, y):
    if y == 0:
        raise ValueError("Divisão por zero n~so é permitida")
    return x / y

try:
    resultado = dividir(10, 0)
    # resultado = 10 / 0
except ValueError as e:
    print("Erro:", e)