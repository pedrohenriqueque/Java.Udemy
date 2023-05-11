package Aula;


    public class ContaCorrente {

        private double saldo;
        private double movimentacao;
        private double taxa = 1.50;

        public ContaCorrente(double saldo) {
            setSaldo(saldo);
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            if (saldo >= 0) {
                this.saldo = saldo;
            } else {
                System.out.println("Saldo não pode ser negativo");
            }
        }

        public double getMovimentacao() {
            return movimentacao;
        }

        public void setMovimentacao(double movimentacao) {
            if (movimentacao >= 0) {
                this.movimentacao = movimentacao;
            } else {
                System.out.println("Movimentação não pode ser negativa");
            }
        }

        public void mostrarSaldo() {
            System.out.println("O saldo da conta é de "+getSaldo());
        }
        public void mostrarMovimentacao() {
            System.out.println("A Movimentação foi de  " + getMovimentacao());
        }
        public void depositar() {
            setSaldo(saldo + movimentacao);
        }

        public void sacar() {
            if (saldo > taxa && saldo - taxa >= movimentacao) {
                setSaldo((saldo - movimentacao) - taxa);
            } else {
                System.out.println("Não há saldo suficiente para efetuar um saque");
            }
        }

    }

