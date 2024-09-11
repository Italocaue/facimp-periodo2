package atividade4;

public class Estudante {
	private String nome;
	private String cpf;
	private String curso;
	private int idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void cadastrar(String nome, String cpf, String curso, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.curso = curso;
		this.idade = idade;
		
		
	}

	public void exibirCadastro() {
		System.out.println("Nome"+ this.nome);
		System.out.println("Cpf"+ this.cpf);
		System.out.println("Curso"+ this.curso);
		System.out.println("Idade"+ this.idade);
	}
}
