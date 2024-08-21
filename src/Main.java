import java.util.Scanner;

class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 2500;
        int opcao = 0;


        System.out.println("***********************************");
        System.out.println("Dados iniciais do cliente: \n");

        System.out.println("Nome:             Gabriel Franco" );
        System.out.println("Tipo de conta:    Corrente" );
        System.out.println("Saldo inicial:    R$ " + saldo);
        System.out.println("*********************************** \n\n");

        System.out.println("Operações: \n");

        String menu = """ 
                \n** Digite sua opção **
                1 - Consutar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair \n
                """;


        while (opcao <= 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("\n O saldo atual da conta é de R$ " + saldo);
            }
            if (opcao == 2) {
                System.out.println("\nInforme um valor a receber: ");
                double receber = leitura.nextDouble();
               saldo += receber;
                System.out.println("\nSaldo atualizado R$ " + saldo);
            }

            if (opcao == 3) {
                System.out.println("\n Quanto quer transferir?");
                double transferir = leitura.nextDouble();
                if (transferir > saldo) {
                    System.out.println("\n Não há saldo para realizar a trasnferencia");
                } else {
                    saldo -= transferir;
                    System.out.println("\n Saldo atualizado R$ " + saldo);
                }
            }
            if (opcao == 4) {
                System.out.println("\n Dados encerrados.");
                return;
            }
        }
        if (opcao > 4) {
            System.out.println("\n Opção invalida.");
        }
    }
}