import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Nome do cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Saldo em conta:");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco; sua agência é " + numeroAgencia + ", conta " + numeroConta + ", e possui o saldo de R$ " + saldoConta + "!" );
    }
}
