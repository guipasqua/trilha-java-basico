import java.util.Scanner;

public class SimulacaoBancaria {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione umas das opções abaixo" + "\n" + "1 - Deposito" + "\n" + "2 - Saque" + "\n" + "3 - Consultar Saldo" + "\n" + "0 - Encerrar");
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor do deposito:" );
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor do saque:" );
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}