import java.util.Scanner;

public class Sistema {

    public static void cadastrarCliente(Scanner sc, Banco banco) {
        System.out.println("============= Novo Cliente =============");
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.next();

        for (int i = 0; i < banco.getQuantidadeClientes(); i++) {
            if (banco.getClientes()[i] == null) {
                banco.getClientes()[i] = new Cliente(nome, cpf);
                break;
            }
        }

        System.out.println("\n=========== Abrir Nova Conta ===========");
        Sistema.abrirConta(sc, banco);
        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("========================================");
    }

    public static void abrirConta(Scanner sc, Banco banco) {
        System.out.print("CPF do cliente: ");
        String cpf = sc.next();

        Cliente cliente = null;
        for (int i = 0; i < banco.getQuantidadeClientes(); i++) {
            if (banco.getClientes()[i].getCpf().equals(cpf)) {
                cliente = banco.getClientes()[i];
                break;
            }
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

            if (tipoConta == 1) {
                Sistema.abrirContaCorrente(sc, banco, cliente, saldo);
                break;
            } else if (tipoConta == 2) {
                Sistema.abrirContaPoupanca(sc, banco, cliente, saldo);
                break;
            } else {
                System.out.println("Opção Inválida!");
            }
        }

        System.out.println("Conta criada com sucesso!");
    }

    public static void abrirContaCorrente(Scanner sc, Banco banco, Cliente cliente, double saldo) {
        System.out.print("Limite do cheque especial: R$ ");
        double limiteChequeEspecial = sc.nextDouble();

        for (int i = 0; i < banco.getQuantidadeContas(); i++) {
            if (banco.getContas()[i] == null) {
                banco.getContas()[i] = new ContaCorrente("85200", "001", saldo,
                                                        cliente, limiteChequeEspecial);
                break;
            }
        }
    }

    public static void abrirContaPoupanca(Scanner sc, Banco banco, Cliente cliente, double saldo) {
        System.out.print("Dia do rendimento: ");
        int diaRendimento = sc.nextInt();

        System.out.print("Taxa de rendimento [%]: ");
        float taxaRendimento = sc.nextFloat();

        for (int i = 0; i < banco.getQuantidadeContas(); i++) {
            if (banco.getContas()[i] == null) {
                banco.getContas()[i] = new ContaPoupanca("47200", "001", saldo, cliente,
                                                        diaRendimento, taxaRendimento);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco("Inter S.A.", 30, 20);

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

            switch (opcao) {
                case 1:
                    Sistema.cadastrarCliente(new Scanner(System.in), banco);
                    break;

                case 2:
                    Sistema.abrirConta(sc, banco);
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
