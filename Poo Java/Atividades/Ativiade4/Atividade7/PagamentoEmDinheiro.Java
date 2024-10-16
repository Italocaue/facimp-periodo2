package Atividade7;

class PagamentoEmDinheiro extends Pagamento {

    public PagamentoEmDinheiro(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$ " + valor + " realizado em dinheiro.");
    }
}

