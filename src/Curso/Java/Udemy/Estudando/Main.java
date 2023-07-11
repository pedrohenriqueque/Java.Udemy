package Curso.Java.Udemy.Estudando;

import Curso.Java.Udemy.Estudando.Locadora.NivelDificuldadeException;

public class Main {
    public static void main(String[] args) {
        try {


            Tirolesa tirolesa1 = new Tirolesa("2:00", "204", "Marquin", 2, 4, "lasgo");
            CaminhadaEcologica caminhada1 = new CaminhadaEcologica("2:01","304","Matheus",3,5,"facil");
        }catch (TipoTirolesaException | NivelDificuldadeException e ){
            System.out.println(e.getMessage());
        } 
    }
}
