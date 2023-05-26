package Aula.Heranca;
public class Livro extends Produto{
    String nomeAutor;

    public void setNomeAutor(String nomeAutor){
        this.nomeAutor = nomeAutor;
    }
    public String getNomeAutor(){
        return this.nomeAutor;
    }
    public Livro(int codigo, String descricao, double preco, double peso,String nomeAutor) {
        super(codigo, descricao, preco, peso);
        setNomeAutor(nomeAutor);
    }
}