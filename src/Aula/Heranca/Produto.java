package Aula.Heranca;
public class Produto {
    protected int codigo;
    protected String descricao;
    protected double preco;
    protected double peso;

    public void setCodigo(int codigo){
        this.codigo =  codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    public double calcularFrete(){
        return peso * 6.50;
    }

    public Produto(int codigo , String descricao , double preco , double peso){
        setCodigo(codigo);
        setDescricao(descricao);
        setPreco(preco);
        setPeso(peso);
    }
}






