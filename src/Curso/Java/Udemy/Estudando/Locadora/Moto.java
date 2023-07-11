package Curso.Java.Udemy.Estudando.Locadora;

public class Moto extends Veiculo {

    @Override
    public void alugar() {
        System.out.println("Moto Alugada!");
    }

    public void devolver(){
        System.out.println("Moto Devolvida");
    }

    public Moto(String marca, String modelo){
        setMarca(marca);
        setModelo(modelo);
    }
}
