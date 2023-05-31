package Aula.Interfaces;

import java.util.ArrayList;

public class Lista implements Printable {
     ArrayList<String> nomes;

    public Lista(){
        this.nomes = new ArrayList<>();
    }

    public void adicionarNome(String nome) {
        this.nomes.add(nome);
    }

    @Override
    public void print() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
