class Aluno:
    def __init__(self, nome='', nota1=0.0, nota2=0.0):
        self._nome = nome
        self._nota1 = nota1
        self._nota2 = nota2

 
    def set_nome(self, nome):
        self._nome = nome

    def get_nome(self):
        return self._nome

   
    def set_nota1(self, nota1):
        self._nota1 = nota1

    def get_nota1(self):
        return self._nota1

    def set_nota2(self, nota2):
        self._nota2 = nota2

    def get_nota2(self):
        return self._nota2

    
    def calcular_media(self):
        return (self._nota1 + self._nota2) / 2

    
    def exibir_nome_e_media(self):
        media = self.calcular_media()
        print(f'Nome: {self._nome}')
        print(f'Média: {media:.2f}')


if __name__ == '__main__':
    aluno = Aluno('Italo', 7.5, 8.0)
    aluno.exibir_nome_e_media()
