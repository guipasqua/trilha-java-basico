import java.util.Scanner;
public class ContaBanco {

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite a agência:");
        agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo inicial:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
}
