import java.util.Objects;
import java.util.Scanner;

public class Bancojava {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldoInicial = 2500.00;
        int opcao = 0;

        System.out.println("Digite por gentileza seu nome: ");
        String nomeUsuario = leitura.next();
        System.out.println("\nOlá bem vindo(a) ao banco:"  + nomeUsuario);
        String dadosUsuario;
        System.out.println("***********************************");
        System.out.println("Dados inicias do cliente: \n" +
                "Nome: " + nomeUsuario +
                "\nTipo conta: Corrente" +
                "\nSaldo inicial:"+ saldoInicial
        );
        System.out.println("***********************************");

        String menu = """
                ** Digite sua opção: **
                1 - Consultar saldo
                2 - Transferencia
                3 - Receber valor
                4 - Sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println(" O saldo atual é: " + saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Qual valor de trasferência");
                double valor = leitura.nextDouble();
                if ( valor > saldoInicial){
                    System.out.println("Não há saldo suficiente para trasferência");
                } else {
                    saldoInicial -= valor;
                    System.out.println("Novo saldo" + saldoInicial);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                double valor = leitura.nextDouble();
                saldoInicial += valor;
                System.out.println("Novo saldo" + saldoInicial);
            } else if (opcao != 4) {
                System.out.println("Opção Inválida");
            }
        }





    }
}
