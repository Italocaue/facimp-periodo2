class MeuErroPersonalizado(Exception):
    def __init__(self, mensagem):
        self.mensagem = mensagem

try:
    raise MeuErroPersonalizado("Ocorreu um erro personalizao.")
except MeuErroPersonalizado as e:
    print("Erro personalizado:", e.mensagem)