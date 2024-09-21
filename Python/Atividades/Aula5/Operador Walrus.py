
 #Sem o operador walrus
numero = int(input("Digite um número: "))
if numero > 10:
    print("0 número é mator que 10: ", numero)
else:
    print("0 número é menor ou igual a 10:", numero)

 #Como operador Walrus
if(numero := int(input("Digite um número: "))) > 10:
    print("0 número é maior que 10:", numero)
else:
 print("0 número é menor ou igual a 10:", numero)