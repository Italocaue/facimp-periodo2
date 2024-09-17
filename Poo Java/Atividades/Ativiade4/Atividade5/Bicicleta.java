package atividade5;

public class Bicicleta extends Veiculo{

	public Bicicleta(String marca, String modelo) {
		
		super(marca, modelo,2);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void acelerar() {
		System.out.println("Bicicleta "+modelo+" pedalando.");
	}
}
