package Aula;

public class mFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao", "Silva", 1500.0);
        Funcionario funcionario2 = new Funcionario("Maria", "Santos", 2500.0);

        System.out.println("Funcionário 1:");
        System.out.println("Nome: " + funcionario1.getNome() + " " + funcionario1.getSobrenome());
        System.out.println("Salário: " + funcionario1.getSalario());

        System.out.println("\nFuncionário 2:");
        System.out.println("Nome: " + funcionario2.getNome() + " " + funcionario2.getSobrenome());
        System.out.println("Salário: " + funcionario2.getSalario());

        funcionario1.aumentarSalario(20);
        funcionario2.aumentarSalario(20);

        System.out.println("\nFuncionario 1 (apos aumento):");
        System.out.println("Nome: " + funcionario1.getNome() + " " + funcionario1.getSobrenome());
        System.out.println("Salario: " + funcionario1.getSalario());

        System.out.println("\nFuncionario 2 (apos aumento):");
        System.out.println("Nome: " + funcionario2.getNome() + " " + funcionario2.getSobrenome());
        System.out.println("Salario: " + funcionario2.getSalario());
    }
}
