package Aula.Heranca.Cascata;

public class mMembrodaComunidade {
    public static void main(String[] args) {

        MembrodaComunidade membrodaComunidade = new MembrodaComunidade("João","1485452148",47);
        System.out.println(membrodaComunidade);
        Graduado graduado = new Graduado("Luiz","4872554789",2,2012,"Ciencias Economicas","Economia Moderna");
        System.out.println(graduado);
        Aluno aluno = new Aluno("Carlos","148547484",4,7,2013,8.8);
        System.out.println(aluno);
        Empregado empregado = new Empregado("Mariana","4587455214",8,4552.47);
        System.out.println(empregado);
        Funcionarios funcionarios = new Funcionarios("Joana","9654874226",12,4854,"Zelador");
        System.out.println(funcionarios);
        CorpoDocente corpoDocente = new CorpoDocente("Luiza","5478562485",9,4875.42,40);
        System.out.println(corpoDocente);
        Professor professor = new Professor("Matheus","244874521456",21,22547.23,45,"Matematica");
        System.out.println(professor);
        Administrador administrador = new Administrador("Laura","1458789654",55,2456.47,20,"Lado A");
        System.out.println(administrador);

    }
}
