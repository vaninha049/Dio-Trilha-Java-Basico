import java.util.Locale;
import java.util.Scanner;
public class contaTerminal {
  
    public static void main(String[] args) {
        // criando o objeto scanner
        double saldo = 700.00;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("ola, Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite o numero da conta ");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da agencia");
        String agencia = scanner.next();
        
        
        
        System.out.println("Ola," + nome + " Obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + " conta " + numero + " e seu saldo " + saldo + " que ja esta disponivel para saque ");
        scanner.close();
    }
}
