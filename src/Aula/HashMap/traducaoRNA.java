package Aula.HashMap;
import java.util.HashMap;

public class traducaoRNA {
    private String trincaRNA;
    private String nomeAminoacido;
    HashMap traducao = new HashMap<>();

    public String getNomeAminoacido() {
        return nomeAminoacido;
    }


    public void setNomeAminoacido(String nomeAminoacido) {
        this.nomeAminoacido = nomeAminoacido;
    }

    public String getTrincaRNA() {
        return trincaRNA;
    }

    public void setTrincaRNA(String trincaRNA) {
        this.trincaRNA = trincaRNA;
    }


    public String toString() {
        return "A Trica RNA é: "
                + getTrincaRNA()
                + " ,O Nome do Aminoacido é: "
                + getNomeAminoacido();
    }

    public void preencherHashMap() {
        traducao.put("UUU", "Phe");
        traducao.put("CUU", "Leu");
        traducao.put("UUA", "Loa");
        traducao.put("AAG", "Lisina");
        traducao.put("UCU", "Ser");
        traducao.put("UAU", "Tyr");
        traducao.put("CAA", "Gin");
    }

    public void traduzir(String traduzir) {
        preencherHashMap();
        int qtdletras = 3;
        StringBuilder sb = new StringBuilder();
        if (traduzir.length() % 3 == 0) {
            for (int i = 0; i < traduzir.length(); i += qtdletras) {
                int fim = qtdletras + i;
                String linha = traduzir.substring(i, fim);
                sb.append(traducao.get(linha));
            }
            String resultado = sb.toString();
            this.trincaRNA = traduzir;
            this.nomeAminoacido = resultado;

        }
    }
}