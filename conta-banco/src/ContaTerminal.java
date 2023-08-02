import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Favor digitar o número da Agência: ");
        agencia = sc.nextLine();
        System.out.println("Favor digitar o número da Conta: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Favor digitar o seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.println("Favor digitar o seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", sua conta é " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        sc.close();

    }

}