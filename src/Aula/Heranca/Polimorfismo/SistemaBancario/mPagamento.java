package Aula.Heranca.Polimorfismo.SistemaBancario;

public class mPagamento {
    public static void main(String[] args) {
        Conta conta = new Conta(987654, 2000.0);


        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto("2023-06-02", 2000.0, 123456, "2023-06-10", true);

        System.out.println("Detalhes do Pagamento Boleto:");
        System.out.println(pagamentoBoleto);
        boolean pagamentoBoletoRealizado;
        if(pagamentoBoleto.isVenceu())
                pagamentoBoletoRealizado = pagamentoBoleto.processarPagamento(conta, 50.0);
        else
            pagamentoBoletoRealizado = pagamentoBoleto.processarPagamento(conta);
        if (pagamentoBoletoRealizado) {
            System.out.println("Pagamento boleto realizado com sucesso!");
        } else {
            System.out.println("Falha ao processar o pagamento boleto.");
        }
        System.out.println(conta);
        Conta contaOnline = new Conta(987654, 3000.0);

        PagamentoOnline pagamentoOnline = new PagamentoOnline("2023-06-02", 500.0, "1234 5678 9012 3456", "MasterCard", 3);

        System.out.println("Detalhes do Pagamento Online:");
        System.out.println(pagamentoOnline);



        boolean pagamentoOnlineRealizado = pagamentoOnline.processarPagamento(contaOnline, 6, 10.0);

        if (pagamentoOnlineRealizado) {
            System.out.println("Pagamento online realizado com sucesso!");
        } else {
            System.out.println("Falha ao processar o pagamento online.");
        }
        System.out.println(contaOnline);
    }
}







