package Aula.Heranca;
public class Software extends Produto {
    String categoria;

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria() {
        return this.categoria;
    }

    public Software(int codigo, String descricao, double preco, double peso, String categoria) {
        super(codigo, descricao, preco, peso);
        setCategoria(categoria);
    }
}