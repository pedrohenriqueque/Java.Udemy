package Aula.JogoRPG;

public class Personagem1 extends PersonagemBase{
    @Override
    public void contarHistoria(){
        System.out.println("Arthur é um antigo cavaleiro que dedicou sua vida " +
                "à proteção dos inocentes e à busca pela paz. Ele percorreu " +
                "terras distantes em busca de conhecimentos ancestrais, " +
                "e durante suas jornadas, foi agraciado com o dom da Cura " +
                "Divina.");
    }

    @Override
    public void poderEspecial() {
        int curar = 50;
        System.out.println("Arthur utilizou a seu poder especial Cura Divina e curou" +curar + "de vida");
    }

    @Override
    public void ataque1() {
       int dano = numeroAleatorio(1,15);
        System.out.println("Arthur utilizou sua habilidade Golpe Divino e causou " +dano);
    }

    @Override
    public void ataque2() {
        int dano = numeroAleatorio(1,8);
        System.out.println("Arthur utilizou sua habilidade Purificação Celeste e causou "+dano +"aos seus inimigos");
    }

    public Personagem1(){
        setNome("Arthur");
        setCaracteristica(100);
        setIdade(23);
    }

}
