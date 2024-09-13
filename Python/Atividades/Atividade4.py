class Empregado:
    def __init__(self, nome, salario_base):
        self.nome = nome
        self.salario_base = salario_base

    def CalculodoSalario(self):
        ...
    
class Gerente (Empregado):
    def CalculodoSalario(self):
        return f"Salario {self.salario_base}"
    
class Vendedor (Empregado):
    def CalculodoSalario(self,comissao):
        return f"Salario {self.salario_base+comissao}"
    
gerente1 = Gerente("Italo",100000)
vendedor1 = Vendedor("Vendedor",1800)

print(vendedor1.CalculodoSalario(8))
