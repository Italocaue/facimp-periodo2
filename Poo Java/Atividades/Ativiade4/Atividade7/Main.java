package Atividade7;

public class Main {
	public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoEmDinheiro(150.00);
        Pagamento pagamento2 = new PagamentoCartaoCredito(250.00, "1234-5678-9876-5432");

        pagamento1.realizarPagamento();
        pagamento2.realizarPagamento();
    }
}
