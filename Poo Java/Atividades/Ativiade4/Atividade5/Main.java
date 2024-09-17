package atividade5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro civic = new Carro("Honda","Civic","nxk-1508");
		civic.info();
		civic.ligar();
		Bicicleta bike = new Bicicleta("Posseidon","Clister");
		bike.acelerar();
		Caminhao caminhao = new Caminhao("Volvo","FH 540","FEF-3434",12);
		caminhao.abastecer();
		
	}

}
