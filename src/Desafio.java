import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        String nome = "Bruce Wayne";
        String tipoConta = "Conta Corrente";
        double saldo = 100000.00;
        int opcao = 0;

        System.out.println("Olá, " + nome + "! Seu saldo em " + tipoConta + " é de R$ " + saldo + ".");

        String menu = """
                **Digite sua opção**
                1 - Consultar saldo
                2 - Transferencia PIX
                3 - Pagar boleto
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);
        double valor;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo é de R$ " + saldo);
            } else if (opcao == 2){
                System.out.println("Seu saldo atual é de R% " + saldo);
                System.out.println("Digite o valor da transferência: ");
                valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Seu saldo atual é de R$ " + saldo);
                }
            } else if(opcao == 3){
                System.out.println("Seu saldo atual é de R$ " + saldo);
                System.out.println("Digite o valor do boleto: ");
                valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Pagamento realizado com sucesso!");
                    System.out.println("Seu saldo atual é de R$ " + saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}