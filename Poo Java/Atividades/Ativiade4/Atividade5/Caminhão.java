package atividade5;

public class Caminhao extends Veiculo{
	String placa;
	public Caminhao(String marca, String modelo, String placa,int rodas) {
		super(marca, modelo, rodas);
		// TODO Auto-generated constructor stub
		this.placa = placa;
	}
	public void ligar() {
		System.out.println("O caminhão "+modelo+" foi ligado");
	}
	public void desligar() {
		System.out.println("O caminhão "+modelo+" está desligado");
	}
	public void abastecer() {
		System.out.println("Abastecendo o caminhão "+modelo);
	}
	@Override
	public void info() {
		System.out.println("Caminhão: ");
		System.out.println("Marca: "+ marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Placa: "+placa);
		System.out.println("Rodas: "+rodas);
	}
}
