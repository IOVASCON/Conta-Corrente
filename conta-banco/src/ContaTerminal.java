import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();

        // Consome a linha restante após ler um inteiro
        scanner.nextLine();

        // Solicita e lê a agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.println("Por favor, digite o saldo inicial da conta!");
        double saldo = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        // Exibe a mensagem com os dados coletados
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                          ", conta " + numero + " e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}
