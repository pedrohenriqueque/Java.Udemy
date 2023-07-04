package Aula.JogoRPG;

public class LordeDasSombras extends ObstaculoBase{
        int vida;
    public void interageComPersonagem(PersonagemBase personagemBase) {
        personagemBase.setCaracteristica(personagemBase.getCaracteristica() - numeroAleatorio(7,23));
    }

    public void atacar(PersonagemBase personagemBase){
            interageComPersonagem(personagemBase);
            System.out.println("Lorde das Sombras usou sua Habilidade e causou dano ");
        if(personagemBase.getCaracteristica() <= 0){
            throw new RuntimeException("Infelizmente, sua jornada chegou a um fim prematuro. O Lorde das Sombras se\n" +
                    "mostrou um oponente formidável e suas habilidades não foram suficientes para\n" +
                    "derrotá-lo. Apesar de todos os seus esforços, o reino continua envolto em trevas.");
        }
    }
    public void recebeDano(PersonagemBase personagemBase){
            vida -= personagemBase.poderEspecial();
        if(vida <= 0){
            System.out.println("Parabéns, herói! Você foi capaz de superar todos os desafios, derrotar o temível\n" +
                    "Lorde das Sombras e trazer a luz de volta ao reino. Sua coragem, habilidade e\n" +
                    "determinação foram fundamentais para alcançar a vitória.");
        }
    }

    public void combate(PersonagemBase personagemBase){
        do{
            System.out.println(personagemBase.getNome()+" possui " +personagemBase.getCaracteristica());
            System.out.println("Lorde das Sombras possui "+vida);
            atacar(personagemBase);
            recebeDano(personagemBase);
        }while (vida > 0 && personagemBase.getCaracteristica() > 0);
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public LordeDasSombras(){
        setVida(120);
    }
}
