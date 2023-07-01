package Aula.EscritaArquivo;

public class Produto implements Comparable {
    private String codigo;
    private String produto;
    private int preco;
    private int quantidade;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto(String codigo, String produto, int preco, int quantidade) {
        setCodigo(codigo);
        setProduto(produto);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    @Override
    public int compareTo(Object obj) {
        Produto a = (Produto) obj;
        if (quantidade == a.getQuantidade()) {
            if (preco < a.getPreco())
                return -1;
            else
                return 1;
        } else if (quantidade < a.getQuantidade()) {
            return -1;
        } else {
            return 1;
        }
    }
}

