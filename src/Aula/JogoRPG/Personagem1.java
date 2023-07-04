package Aula.JogoRPG;

import java.util.ArrayList;

public class Personagem1 extends PersonagemBase{
    @Override
    public void contarHistoria(){
        super.contarHistoria();
        System.out.println("Arthur é um antigo cavaleiro que dedicou sua vida à proteção dos inocentes e à\n" +
                "busca pela paz. Ele percorreu terras distantes em busca de conhecimentos\n" +
                "ancestrais.");
    }

    @Override
    public int poderEspecial() {
        int curar = numeroAleatorio(1,5);
        System.out.println("Arthur utilizou a seu poder especial Cura Divina e curou" +curar + "de vida");
        for (Item item : inventario) {
            if (item instanceof TomoAmplificador) {
                curar *= 2;
            }else if(item instanceof ChapeuDaMagia){
                curar += 5;
            }
        }
        return curar;
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
        inventario = new ArrayList<>();
        setNome("Arthur");
        setCaracteristica(100);
        setIdade(23);
    }

}
