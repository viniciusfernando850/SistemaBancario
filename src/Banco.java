import java.util.Scanner;
import java.util.Random;

public class Banco {
    private String nome;
    private int quantidadeContas;
    private int quantidadeClientes;
    private Conta[] contas;
    private Cliente[] clientes;
    private static final int CONTA_PADRAO = 10000;
    private static final String AGENCIA_PADRAO = "0145";

    public Banco(String nome, int quantidadeContas, int quantidadeClientes) {
        this.nome = nome;
        this.quantidadeClientes = quantidadeClientes;
        this.quantidadeContas = quantidadeContas;
        this.contas = new Conta[quantidadeContas];
        this.clientes = new Cliente[quantidadeClientes];
    }

    public String getNome() {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getQuantidadeContas() {return this.quantidadeContas;}
    public void setQuantidadeContas(int quantidadeContas) {this.quantidadeContas = quantidadeContas;}

    public int getQuantidadeClientes() {return this.quantidadeClientes;}
    public void setQuantidadeClientes(int quantidadeClientes) {this.quantidadeClientes = quantidadeClientes;}

    public Conta[] getContas() {return this.contas;}
    public void setContas(Conta[] contas) {this.contas = contas;}

    public Cliente[] getClientes() {return this.clientes;}
    public void setClientes(Cliente[] clientes) {this.clientes = clientes;}

    public Cliente getCliente(String cpf) {
        Cliente cliente = null;

        for (int i = 0; i < this.quantidadeClientes; i++) {
            if (this.clientes[i].getCpf().equals(cpf)) {
                cliente = this.clientes[i];
                break;
            }
        }

        return cliente;
    }

    public void abrirConta(int tipoConta, Scanner sc, Cliente cliente, double saldo) {
        Random r = new Random();
        String numeroConta = String.valueOf(CONTA_PADRAO + r.nextInt(1, 100));

        if (tipoConta == 1) {
            System.out.print("Limite de cheque especial: R$ ");
            double limiteChequeEspecial = sc.nextDouble();

            ContaCorrente novaConta = new ContaCorrente(numeroConta, AGENCIA_PADRAO, saldo,
                                                        cliente, limiteChequeEspecial);
            inserirConta(novaConta);
        } else {
            System.out.print("Dia do rendimento: ");
            int diaRendimento = sc.nextInt();

            System.out.print("Taxa de rendimento: ");
            float taxaRendimento = sc.nextFloat();

            ContaPoupanca novaConta = new ContaPoupanca(numeroConta, AGENCIA_PADRAO, saldo, cliente,
                                                        diaRendimento, taxaRendimento);
            inserirConta(novaConta);
        }
    }

    public void inserirCliente(Cliente cliente) {
        for (int i = 0; i < this.quantidadeClientes; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                break;
            }
        }
    }

    public void inserirConta(Conta conta) {
        for (int i = 0; i < this.quantidadeContas; i++) {
            if (this.contas[i] == null) {
                this.contas[i] = conta;
            }
        }
    }
}
