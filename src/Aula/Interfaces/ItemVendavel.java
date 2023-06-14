package Aula.Interfaces;

public interface ItemVendavel {

     void setTitulo(String titulo);
     String getTitulo();
     void setPreco(double preco);
     double getPreco();
     void setQtdEstoque(int qtdEstoque);
     int getQtdEstoque();
     void setAutor(String autor);
     String getAutor();
     void setQtdPaginas(int qtdPaginas);
     int getQtdPaginas();

     void vender(int quantidade);
     void adicionarEstoque(int quantidade);

}
