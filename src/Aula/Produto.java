package Aula;

public class Produto {
    private int Numero;
    private int Quantidade;
    private String Nome;
    private double Preco;

    public Produto (int Numero,int Quantidade,String Nome, double Preco){

        if(Numero >= 1 && Numero <= 9999)
            this.Numero = Numero;

        if(Quantidade > 0)
            this.Quantidade = Quantidade;

        this.Nome = Nome;

        if(Preco > 0 )
            this.Preco = Preco;
    }

    public int getNumero(){
        return Numero;
    }

    public void setNumero(int Numero){
        if(Numero >= 1 && Numero <= 9999)
            this.Numero = Numero;
    }

    public int getQuantidade(){
        return Quantidade;
    }

    public void setQuantidade(int Quantidade){
        if(Quantidade < 0)
            this.Quantidade = Quantidade;
    }

    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public double getPreco(){
        return Preco;
    }

    public void setPreco(double Preco){
        if(Preco > 0 )
            this.Preco = Preco;
    }
}