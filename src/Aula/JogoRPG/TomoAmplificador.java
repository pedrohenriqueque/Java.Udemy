package Aula.JogoRPG;

public class TomoAmplificador extends Item{


    public TomoAmplificador(){
        setNome("Tomo Amplificador");
        setDescricao("O ataque especial recebe o dobro de dano");
    }

    public String toString(){
        return "1 - " + super.toString();

    }
}
