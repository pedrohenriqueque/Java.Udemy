package Aula;

public class mCifra {
    public static void main(String[] args) {
        Cifra cifra = new Cifra();
        String mensagem = "Rato Roeu a Roupa";
        String segredo = cifra.Criptografar(mensagem);
        System.out.println("Mensagem Criptografada: " + segredo);
        System.out.println("Descriptografada: " + cifra.Descriptografar(segredo));

    }
}
