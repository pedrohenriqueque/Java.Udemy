package Aula.JogoRPG;

public class ChapeuDaMagia extends Item{

    public ChapeuDaMagia(){
        setNome("Chapéu da Magia");
        setDescricao("O ataque especial recebe 5 a mais de dano");
    }

    public String toString(){
        return "2 - " + super.toString();

    }
}
