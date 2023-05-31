package Aula.Heranca.Polimorfismo.SistemaBancario;

public class PagamentoBoleto extends Pagamento {
    private int numeroBoleto;
    private String dataVencimento;
    protected boolean venceu;


    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public int getNumeroBoleto() {
        return this.numeroBoleto;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataVencimento() {
        return this.dataVencimento;
    }

    public void setVenceu(boolean venceu) {
        this.venceu = venceu;
    }

    public boolean isVenceu() {
        return venceu;
    }


    public PagamentoBoleto(String data , double valor , int numeroBoleto, String dataVencimento, boolean venceu){
        super(data,valor);
        setNumeroBoleto(numeroBoleto);
        setDataVencimento(dataVencimento);
        setVenceu(venceu);
    }
    public boolean processarPagamento(Conta contaBancaria, double multa){
        if(contaBancaria.Sacar(this.valor+multa))
            return true;

        return false;
    }
    public boolean processarPagamento(Conta contaBancaria){
        if(contaBancaria.Sacar(this.valor))
            return true;

        return false;
    }
    @Override
    public String toString(){
        return super.toString()
                +", Numero do Boleto: "
                +getNumeroBoleto()
                +", Data de Vencimento: "
                +getDataVencimento()
                +", Venceu? "
                +isVenceu();
    }
}

