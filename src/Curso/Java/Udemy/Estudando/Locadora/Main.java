package Curso.Java.Udemy.Estudando.Locadora;

import Curso.Java.Udemy.Estudando.Locadora.Carro;
import Curso.Java.Udemy.Estudando.Locadora.Moto;
import Curso.Java.Udemy.Estudando.Locadora.Veiculo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Veiculo> frota = new HashMap<>();

        Moto moto1 = new Moto("Volks", "AsaBranca");
        Carro carro1 = new Carro("Reno", "Matelas");

        frota.put("KOP-8523", moto1);
        frota.put("MMM-999", carro1);

    }
}
