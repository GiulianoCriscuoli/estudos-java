import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        double saldo = 237.0;
        String agencia = "067-8";
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe o numero da agência: ");
        int numero = scanner.nextInt();


        System.out.println("Usuário: " + numero);

        System.out.println("Olá ".concat(nome) + " obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
