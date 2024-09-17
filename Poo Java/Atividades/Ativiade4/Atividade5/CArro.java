package atv5;

public class Carro extends Veiculo{
	String placa;
	public Carro(String marca, String modelo, String placa) {
		super(marca, modelo, 4);
		// TODO Auto-generated constructor stub
	}
	public void ligar() {
		System.out.println("O carro "+modelo+" foi ligado");
	}
	public void desligar() {
		System.out.println("O Carro "+modelo+" está desligado");
	}
	public void abastecer() {
		System.out.println("Abastecendo o carro "+modelo);
	}
	@Override
	public void info() {
		System.out.println("Carro ");
		System.out.println("Marca: "+ marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Placa: "+placa);
		System.out.println("Rodas: "+rodas);
	}
}
