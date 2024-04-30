import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Bem vindo ao Nosso Banco");
        System.out.print("Por Favor, Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Por Favor, Digite o número da agência: ");
        String numeroAgencia = sc.next();

        System.out.print("Por Favor, Digite Seu Nome : ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();


        System.out.print("Insira o Saldo Atual: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá" +" "+ nomeCliente +
                " obrigado por criar uma conta em nosso banco,\nsua agência é: " + numeroAgencia +
                "\nconta: "+ numeroConta +
                "\ne seu saldo: " + saldo +
                " já está disponível para saque.");


    }
}
