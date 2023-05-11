package Aula;
public class Cifra {

    public String Criptografar(String mensagem) {
        String cifrada = "";
        for (int i = 0; i < mensagem.length(); i++) {
            char c = mensagem.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                c = (char) (c + 3);
                if ((Character.isLowerCase(mensagem.charAt(i)) && c > 'z')
                        || (Character.isUpperCase(mensagem.charAt(i)) && c > 'Z')) {
                    c = (char) (c - 26);
                }
            }
            cifrada += c;
        }
        return cifrada;
    }

    public String Descriptografar(String mensagemCifrada) {
        String decifrada = "";
        for (int i = 0; i < mensagemCifrada.length(); i++) {
            char c = mensagemCifrada.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                c = (char) (c - 3);
                if ((Character.isLowerCase(mensagemCifrada.charAt(i)) && c < 'a')
                        || (Character.isUpperCase(mensagemCifrada.charAt(i)) && c < 'A')) {
                    c = (char) (c + 26);
                }
            }
            decifrada += c;
        }
        return decifrada;
    }

}