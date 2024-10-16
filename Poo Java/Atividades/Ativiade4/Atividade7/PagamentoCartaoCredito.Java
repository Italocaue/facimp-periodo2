package Atividade7;

class PagamentoCartaoCredito extends Pagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito. Número do cartão: " + numeroCartao);
    }
}
