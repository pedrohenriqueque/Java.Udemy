package Aula.Heranca.Polimorfismo.SistemaBancario;

public abstract class Pagamento{
    protected String data;
    protected double valor;
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
    public Pagamento(String data, double valor){
        setData(data);
        setValor(valor);
    }
    @Override
    public String toString(){
        return "Data de Pagamento: "
                +getData()
                +", Valor: "
                +getValor();
    }
    public boolean processarPagamento(Conta contaBancaria){
        return contaBancaria.Sacar(this.valor);
        }
    }

