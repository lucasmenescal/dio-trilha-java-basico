import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        // terminal.next();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        // terminal.next();

        try {
            contar(parametroUm, parametroDois);

        } catch (Exception exception) {
            terminal.close();
            System.out.println(exception.getMessage());
        }
        terminal.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O parametroUm é maior que parametroDois!");
        } else {

            int contagem = parametroDois - parametroUm;
            // realizar o for para imprimir os números com base na variável contagem

            for (int i = 1; i < contagem + 1; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
