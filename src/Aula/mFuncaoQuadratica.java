package Aula;
import java.util.Scanner;
public class mFuncaoQuadratica {
    public static void main(String[] args)
    {
        System.out.println("Bem-vindo à calculadora de funções quadráticas!");
        System.out.println("Favor entre com os valores de a, b e c:");

        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();

        FuncaoQuadratica objFunc = new FuncaoQuadratica(a, b, c);
        System.out.printf("O objeto função criado é %s", objFunc.Descricao());

        System.out.printf("O X do vértice vale %f e o Y do vértice vale %f\n",
                objFunc.XVertice(), objFunc.YVertice());
        System.out.printf("As raízes da função valem %f e %f\n", objFunc.Raiz1(),
                objFunc.Raiz2());
        System.out.printf("A concavidade da função é %s\n", objFunc.Concavidade());
    }
}
