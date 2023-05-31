package Aula.Heranca.Polimorfismo.SistemaBancario;

public class PagamentoOnline extends Pagamento {
    protected String numeroCartao;
    public String bandeira;
    private int qtdParcelas;

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return this.numeroCartao;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public PagamentoOnline(String data, double valor, String numeroCartao, String bandeira, int qtdParcelas) {
        super(data, valor);
        setNumeroCartao(numeroCartao);
        this.bandeira = bandeira;
        setQtdParcelas(qtdParcelas);

    }
    @Override
    public String toString() {
        return super.toString()
                + "Numero do Cartão: "
                + getNumeroCartao()
                + ", Bandeira:"
                + this.bandeira
                + "Quantidade de Parcelas: "
                + getQtdParcelas();
    }

    public boolean processarPagamento(Conta contaBancaria, int qtdParcelas, double juros) {
        int parcelas = this.qtdParcelas - qtdParcelas;
        double pagar = this.valor - (this.valor * (juros / 100.0 * parcelas));
        if (contaBancaria.Sacar(pagar))
            return true;
        else
            return false;
    }
}