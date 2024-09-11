package atividade4;

public class EstoqueProduto {
	private String descricao;
	private int quantidade;
	private double valor;
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
		
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return this.descricao;
		
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public double getValor() {
		return this.valor;
		
	}
	
	public void cadastrar(String descricao , int quantidade , double valor) {
		this.valor = valor;
		this.quantidade = quantidade;
		this.descricao = descricao;
		
		
	}
	
	public void exibirEstoque() {
		System.out.println("descricao"+ this.descricao);
		System.out.println("quantidade"+ this.quantidade);
		System.out.println("valor"+ this.valor);
	}
	
	public void removerQuantidade(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
		
	}
}
