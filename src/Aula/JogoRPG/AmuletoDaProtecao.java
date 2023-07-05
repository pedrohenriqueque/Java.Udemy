package Aula.JogoRPG;

public class AmuletoDaProtecao extends Item{

    public AmuletoDaProtecao(){
        setNome("Amuleto da Proteção");
        setDescricao("O portador ganha um bonus de 15 % da sua vida ");
    }

    public String toString(){
        return "3 - " + super.toString();

    }
}
