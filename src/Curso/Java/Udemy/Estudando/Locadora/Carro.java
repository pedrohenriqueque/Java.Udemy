package Curso.Java.Udemy.Estudando.Locadora;

public class Carro extends Veiculo {
    @Override
    public void alugar(){
        System.out.println("Carro Alugado!");
    }
    @Override
    public void devolver(){
        System.out.println("Carro Devolvido");
    }

    public Carro(String marca, String modelo){
        setMarca(marca);
        setModelo(modelo);
    }
}
