package Aula.Heranca;
public class CD extends Produto{
    String nomeBanda;

    public void setNomeBanda(String nomeBanda){
        this.nomeBanda = nomeBanda;
    }
    public String getNomeBanda(){
        return this.nomeBanda;
    }
    public CD(int codigo, String descricao, double preco, double peso,String nomeBanda) {
        super(codigo, descricao, preco, peso);
        setNomeBanda(nomeBanda);
    }

    }
