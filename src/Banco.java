public class Banco {
    private String nome;
    private int quantidadeContas;
    private int quantidadeClientes;
    private Conta[] contas;
    private Cliente[] clientes;

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
}
