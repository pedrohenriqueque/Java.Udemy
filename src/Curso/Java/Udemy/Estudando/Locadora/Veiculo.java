package Curso.Java.Udemy.Estudando.Locadora;

public abstract class Veiculo implements VeiculoAlugavel {
    private String marca;
    private String modelo;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
