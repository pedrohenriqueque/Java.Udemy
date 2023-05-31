package Aula.Heranca.Polimorfismo;

public class mConta {
    public static void main(String[] args) {
        Conta[] contas = new Conta[3];
        contas[0] = new Conta(100, 500);
        contas[1] = new ContaPoupanca(200, 1200);
        contas[2] = new ContaEspecial(300, 500, 1000);

        for (int i = 0; i < contas.length; i++) {
            if (contas[i] instanceof ContaPoupanca) {
                System.out.println("Conta Poupanca antes do Rendimento: ");
                System.out.println(contas[i]);
                ((ContaPoupanca) contas[i]).render(10);
            }
        }
        for (int i = 0; i < contas.length; i++) {
            System.out.println(contas[i]);
        }

        for (int i = 0; i < contas.length; i++) {
            contas[i].Sacar(1500);
        }

        for (int i = 0; i < contas.length; i++) {
            System.out.println(contas[i]);
        }

        for (int i = 0; i < contas.length; i++) {
            contas[i].Depositar(1500);
        }
        for (int i = 0; i < contas.length; i++) {
            System.out.println(contas[i]);
        }
    }
}