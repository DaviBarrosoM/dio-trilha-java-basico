import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine().toUpperCase();

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agnência é " + agencia + ", conta "+ numero + " e seu saldo "+ saldo +" já está disponíenvel para saque");



        scanner.close();
    }
}
