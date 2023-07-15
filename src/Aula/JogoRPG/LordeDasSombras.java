package Aula.JogoRPG;

public final class LordeDasSombras extends ObstaculoBase{
        int vida;
    public void interageComPersonagem(PersonagemBase personagemBase) {
        if(vida >= 0) {
            personagemBase.setCaracteristica(personagemBase.getCaracteristica() - numeroAleatorio(7, 23));
            System.out.println("Lorde das Sombras usou sua Habilidade e causou dano ");
        }

    }

    public void recebeDano(PersonagemBase personagemBase) {
        int dano;
        do {
            dano = personagemBase.atacar();
            vida -= dano;
        } while (dano < 0);

        if (vida <= 0) {
            System.out.println("Parabéns, herói! Você foi capaz de superar todos os desafios, derrotar o temível\n" +
                    "Lorde das Sombras e trazer a luz de volta ao reino. Sua coragem, habilidade e\n" +
                    "determinação foram fundamentais para alcançar a vitória.");
        }
    }

    public void combate(PersonagemBase personagemBase){
        do{
            System.out.println(personagemBase.getNome()+" possui " +personagemBase.getCaracteristica());
            System.out.println("Lorde das Sombras possui "+getVida());
            recebeDano(personagemBase);
            interageComPersonagem(personagemBase);
            personagemBase.morrer();
        }while (vida > 0 && personagemBase.getCaracteristica() > 0);
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public LordeDasSombras(){
        setNome("Lorde das Sombras");
        setVida(120);
    }
}
