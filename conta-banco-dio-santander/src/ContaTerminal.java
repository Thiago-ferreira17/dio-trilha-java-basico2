import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha deixada pelo nextInt

        // Solicitar número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicitar nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar saldo
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibir mensagem de confirmação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
                          " já está disponível para saque.";
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}

