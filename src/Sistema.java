import java.util.Scanner;

public class Sistema {
    private static Banco banco;

    public static void cadastrarCliente(Scanner sc) {
        System.out.println("============= Novo Cliente =============");
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.next();

        banco.inserirCliente(new Cliente(nome, cpf));

        System.out.println("\n=========== Abrir Nova Conta ===========");
        Sistema.abrirNovaConta(sc, banco);
        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("========================================");
    }

    public static void abrirNovaConta(Scanner sc, Banco banco) {
        System.out.print("CPF do cliente: ");
        String cpf = sc.next();

        Cliente cliente = banco.getCliente(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.print("Saldo inicial: R$ ");
        double saldo = sc.nextDouble();

        System.out.println("Tipo de conta:");
        System.out.println("""
            [1] - Conta Corrente
            [2] - Conta Poupança
        """);

        while (true) {
            System.out.print("Sua opção: ");
            int tipoConta = sc.nextInt();

            if (tipoConta == 1 || tipoConta == 2) {
                banco.abrirConta(tipoConta, sc, cliente, saldo);
                break;
            } else {
                System.out.println("Opção Inválida!");
            }
        }

        System.out.println("Conta criada com sucesso!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sistema.banco = new Banco("Inter S.A.", 30, 20);

        System.out.println("========================================");
        System.out.printf("\t\t   Sistema %s\n", banco.getNome());
        System.out.println("========================================");

        System.out.println("""
            [1] - Cadastrar cliente
            [2] - Abrir conta para cliente
            [3] - Depositar
            [4] - Sacar
            [5] - Transferir
            [6] - Consultar saldo
            [7] - Listar contas de um cliente
            [8] - Listar todos os clientes
            [9] - Listar todas as contas
            [0] - Sair
        """);
        System.out.println("========================================");

        while (true) {
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Sistema.cadastrarCliente(sc);
                    break;
                case 2:
                    Sistema.abrirNovaConta(sc, banco);
                    break;
                case 3:
                    // Depositar
                    break;

                case 4:
                    // Sacar
                    break;

                case 5:
                    // Transferir
                    break;

                case 6:
                    // Consultar saldo
                    break;

                case 7:
                    // Listar contas de um cliente
                    break;

                case 8:
                    // Listar todos os clientes
                    break;

                case 9:
                    // Listar todas as contas
                    break;

                case 0:
                    // Sair
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (opcao == 0)
                break;
        }

        for (int i = 0; i < 30; i++) {
            System.out.println(banco.getClientes()[i].getNome());
        }
    }
}
